package com.revature.dao;
import java.util.List;
import com.revature.beans.Animal;
public interface SeaLifeDAO {
    
    public List<Animal> allAnimals();
    public Animal getAnimalById(String genus);
    public void createAnimals(Animal animal);
    public Animal updateAnimals(Animal animal);
    public void deleteAnimals(Animal animal);
}