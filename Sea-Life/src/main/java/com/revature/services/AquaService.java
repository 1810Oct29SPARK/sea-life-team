package com.revature.services;

import java.util.List;

import com.revature.beans.Animal;

public interface AquaService {
	
	public List<Animal> allAnimals();
	public Animal getAnimalById(int id);
	public void createAnimal(int id, String genus, String characteristics, String habitat, String species, String diet);
	public Animal updateAnimal(Animal fish);
	public void deleteAnimal(Animal fish);
}