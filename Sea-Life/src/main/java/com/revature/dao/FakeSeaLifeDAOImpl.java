package com.revature.dao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.revature.beans.Animal;
public class FakeSeaLifeDAOImpl implements SeaLifeDAO {
    
    private List<Animal> aquarAnimals = new ArrayList<Animal>();
    
    public FakeSeaLifeDAOImpl() {
        aquarAnimals.add(new Animal("Cetacea", "fins", "temperate waters", "Dolphin", "fish", "gray, long mammal with smooth rubbery skin"));
    }
    public void createAnimals(Animal animal) {
        aquarAnimals.add(animal);
        
    }
    public Animal updateAnimals(Animal animal) {
        for (Animal a : aquarAnimals) {
            if (a.getGenus() == animal.getGenus()) {
                a.setCharacteristic(animal.getCharacteristic());
                a.setHabitat(animal.getHabitat());
                a.setSpecies(animal.getSpecies());
                a.setDiet(animal.getDiet());
                a.setAppearence(animal.getAppearence());
                return a;
            }
        }
        return null;
    }
    public void deleteAnimals(Animal animal) {
        Iterator<Animal> it = aquarAnimals.iterator();
        while(it.hasNext()){
            Animal a = it.next();
            if (a.getGenus() == animal.getGenus()) {
                it.remove();
            }
        }
        
    }
    public List<Animal> allAnimals() {
        return aquarAnimals;
    }
    public Animal getAnimalById(String genus) {
        Animal toReturn = null;
        for (Animal b : aquarAnimals) {
            if (b.getGenus() == genus) {
                toReturn  = b;
            }
        }
        return toReturn;
    }
}