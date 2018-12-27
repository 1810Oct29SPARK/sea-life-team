package com.revature.dao;
import java.util.List;
import com.revature.beans.Animal;
public interface SeaLifeDAO {
    
    public List<Animal> allAnimals();
    public Animal getAnimalById(String genus);
    public void createAnimals(int id, String genus, String characteristics, String habitat, String species, String diet);
    public Animal updateAnimals(Animal animal);
    public void deleteAnimals(Animal animal);
    

//	private int id;
//	private String genus;
//	private String characteristic;
//	private String habitat;
//	private String species;
//	private String diet;
}