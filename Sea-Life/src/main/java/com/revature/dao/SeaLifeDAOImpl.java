package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.beans.Animal;
import com.revature.util.HibernateUtil;

public class SeaLifeDAOImpl implements SeaLifeDAO {
	
	SessionFactory sf = HibernateUtil.getSessionFactory();

	@Override
	public List<Animal> allAnimals() {
		List<Animal> animals = new ArrayList<>();
		//use a Query to retrieve all caves
		try(Session s = sf.getCurrentSession()) {
			System.out.println("in try block");
			Transaction tx = s.beginTransaction();
			animals = s.createQuery("from Animal").getResultList();
			tx.commit();
			s.close();
		}
		return animals;
	}

	@Override
	public Animal getAnimalById(int id) {
		Animal a = null;
		try(Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			a = (Animal) s.get(Animal.class, id);
			tx.commit();
			s.close();
		}
		return a;
	}

	@Override
	public void createAnimals(int id, String genus, String characteristics, String habitat, String species,
			String diet) {
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			s.persist(new Animal(id, genus, characteristics, habitat, species, diet));
			tx.commit();
			s.close();
		}
	}

	@Override
	public void updateAnimals(Animal animal) {
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			s.update(animal);
			tx.commit();
			s.close();
		}
	}

	@Override
	public void deleteAnimalById(Animal animal) {
		try(Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			s.delete(animal);
			tx.commit();
			s.close();
		}
	}
	
	

}
