package com.revature.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.revature.beans.Animal;
import com.revature.dao.SeaLifeDAO;
import com.revature.dao.SeaLifeDAOImpl;

public class Driver {

	public static void main(String[] args) {
		SeaLifeDAO s = new SeaLifeDAOImpl();
		//System.out.println(s.getAnimalById(2));
//		List<Animal> caveList = s.allAnimals();
//		for (Animal a : caveList) {
//			System.out.println(a);
//		}
//		Animal dolphin = s.getAnimalById(69);
//		s.deleteAnimalById(dolphin);
//		s.createAnimals(69, "xiphias", "stabby stabby", "tropical temperate waters", "Swordfish", "Zooplankton");
//		s.updateAnimals(new Animal(69, "xiphias", "stabby stabby", "tropical temperate waters", "Stabby Boi", "Zooplankton"));
		
		//2nd level cache
//
//	    StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
//	    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
//	      
//	    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
//	    Session session1=factory.openSession();    
//	    Animal a1=(Animal)session1.load(Animal.class,1);    
//	    System.out.println(a1.getDiet()+" "+a1.getHabitat()+" "+a1.getSpecies());    
//	    session1.close();    
	}

}
