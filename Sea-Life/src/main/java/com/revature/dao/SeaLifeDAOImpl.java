package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.beans.Animal;
import com.revature.util.HibernateUtil;

public class SeaLifeDAOImpl implements SeaLifeDAO {

	@Override
	public List<Animal> allAnimals() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Animal getAnimalById(int id) {
		Animal a = null;
		try(SessionFactory sf = HibernateUtil.getSessionFactory()) {
			Session s = sf.getCurrentSession();
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public Animal updateAnimals(Animal animal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAnimals(Animal animal) {
		// TODO Auto-generated method stub
		
	}
	
	

}
