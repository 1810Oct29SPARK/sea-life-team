package com.revature.main;

import com.revature.dao.FakeSeaLifeDAOImpl;
import com.revature.dao.SeaLifeDAO;

public class Driver {

	public static void main(String[] args) {
		SeaLifeDAO  sl = new FakeSeaLifeDAOImpl();
		System.out.println(sl.allAnimals());
	}

}
