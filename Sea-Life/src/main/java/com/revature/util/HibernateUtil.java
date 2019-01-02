package com.revature.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if (HibernateUtil.sessionFactory == null) {
			//if no SessionFactory has been created, create one
			Configuration c = new Configuration();
			c.setProperty("hibernate.connection.username", System.getenv("FISH_DB_USERNAME"));
			c.setProperty("hibernate.connection.password", System.getenv("FISH_DB_PASS"));
			c.setProperty("hibernate.connection.url", System.getenv("FISH_DB_URL"));
			c.configure(); //by default, looks for hibernate.cfg.xml in srs/main/resources
			HibernateUtil.sessionFactory = c.buildSessionFactory();
		}
		return HibernateUtil.sessionFactory;
	}
}
