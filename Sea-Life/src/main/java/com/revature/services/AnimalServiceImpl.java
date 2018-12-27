package com.revature.services;

import java.util.List;

import com.revature.beans.Animal;
import com.revature.dao.SeaLifeDAO;
import com.revature.dao.FakeSeaLifeDAOImpl;

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
	public void createAnimal(Animal fish) {
		// TODO Auto-generated method stub
		
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

	
}