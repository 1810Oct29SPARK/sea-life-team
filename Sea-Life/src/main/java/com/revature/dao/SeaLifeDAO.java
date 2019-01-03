package com.revature.dao;
import java.util.List;
import com.revature.beans.Animal;
public interface SeaLifeDAO {
    
    public List<Animal> allAnimals();
    public Animal getAnimalById(int id);
    public void createAnimals(int id, String genus, String characteristics, String habitat, String species, String diet);
    public void updateAnimals(Animal animal);
    public void deleteAnimalById(Animal animal);
    
}