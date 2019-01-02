package com.revature.main;

import java.util.List;

import com.revature.beans.Animal;
import com.revature.dao.SeaLifeDAO;
import com.revature.dao.SeaLifeDAOImpl;

public class Driver {

	public static void main(String[] args) {
		SeaLifeDAO s = new SeaLifeDAOImpl();
		System.out.println(s.getAnimalById(1));
//		List<Animal> caveList = s.allAnimals();
//		for (Animal a : caveList) {
//			System.out.println(a);
//		}
	}

}
