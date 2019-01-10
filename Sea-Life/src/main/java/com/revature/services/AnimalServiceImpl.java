package com.revature.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.beans.Animal;
import com.revature.dao.FakeSeaLifeDAOImpl;
import com.revature.dao.SeaLifeDAO;

@Service(value="aquaService")
public class AnimalServiceImpl implements AquaService {
	
	private SeaLifeDAO ad = new FakeSeaLifeDAOImpl();

	public AnimalServiceImpl() {
	}

	public List<Animal> allAnimals() {
		return ad.allAnimals();
	}

	@Override
	public Animal getAnimalById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Animal updateAnimal(Animal fish) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAnimal(Animal fish) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createAnimal(int id, String genus, String characteristics, String habitat, String species,
			String diet) {
		ad.createAnimals(id, genus, characteristics, habitat, species, diet);
		System.out.println("method override");
		
	}

	
}