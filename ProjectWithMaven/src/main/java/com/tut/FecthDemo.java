package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FecthDemo {

	public static void main(String[] args) {
		// Get & Load
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Student student = session.load(Student.class, 105);
		System.out.println(student);
		
		Student student1 = session.load(Student.class, 105);
		System.out.println(student1);
		
		
//		Address address = session.get(Address.class, 1);
//		System.out.println(address.getStreet()+":"+address.getCity());
//		
//		Address address1 = session.get(Address.class, 1);
//		System.out.println(address1.getStreet()+":"+address1.getCity());
	
		
		
		
		factory.close();
	}

}
