package com.glearning.hibernate.crud.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.glearning.hibernate.crud.model.Teacher;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory==null) {
			sessionFactory = new Configuration()
					.configure("hibernate-cfg.xml")
					.addAnnotatedClass(Teacher.class)
					.buildSessionFactory();
		}
		return sessionFactory;
	}

}
