package com.revature.main;

import com.revature.dao.SeaLifeDAO;
import com.revature.dao.SeaLifeDAOImpl;

public class Driver {

	public static void main(String[] args) {
		SeaLifeDAO s = new SeaLifeDAOImpl();
		System.out.println(s.getAnimalById(2));
	}

}
