package com.revature.services;

import java.util.List;

import com.revature.beans.Animal;

public interface AquaService {
	
	public List<Animal> allAnimals();
	public Animal getAnimalById(int id);
	public void createAnimal(Animal fish);
	public Animal updateAnimal(Animal fish);
	public void deleteAnimal(Animal fish);
}