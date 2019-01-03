package com.revature.dao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.revature.beans.Animal;
public class FakeSeaLifeDAOImpl implements SeaLifeDAO {
    
    private List<Animal> aquarAnimals = new ArrayList<Animal>();
    
    public FakeSeaLifeDAOImpl() {
        aquarAnimals.add(new Animal(1, "Cetacea", "fins, gray, long mammal with smooth rubbery skin", "temperate waters", "Dolphin", "fish"));
        aquarAnimals.add(new Animal(2, "Archelon", "flipper, green, shell, 3.52 meters long", "South Dakota", "Sea Turtle", "fish and plants"));
        aquarAnimals.add(new Animal(3, "Dugong", "tail, flat snout", "Australia", "Dugong", "sea grass"));
        aquarAnimals.add(new Animal(4, "Pterois", "colorful, worst fish ever", "temperate waters", "Lion Fish", "everything smaller than them"));
    }
    public void createAnimals(int id, String genus, String characteristics, String habitat, String species, String diet) {
    	Animal an = new Animal(id, genus, characteristics, habitat, species, diet);
        aquarAnimals.add(an);
        System.out.println("method works");
        
    }
    public void updateAnimals(Animal animal) {
        for (Animal a : aquarAnimals) {
            if (a.getGenus() == animal.getGenus()) {
                a.setCharacteristic(animal.getCharacteristic());
                a.setHabitat(animal.getHabitat());
                a.setSpecies(animal.getSpecies());
                a.setDiet(animal.getDiet());
            }
        }
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
	@Override
	public Animal getAnimalById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteAnimalById(Animal animal) {
		// TODO Auto-generated method stub
		
	}
}