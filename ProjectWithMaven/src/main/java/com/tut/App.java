package com.tut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Project Start");
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		
//		Create a student
		Student student = new Student();
		
		student.setId(103);
		student.setName("Coder");
		student.setCity("Ahemdabad");
		
		System.out.println(student);
		

//		Create a address
		Address address = new Address();
		address.setAddressId(101);
		address.setStreet("street2");
		address.setCity("Ahmedabad");
		address.setAddedDate(new Date());
		address.setOpen(true);
		address.setX(1.1);
		
//		Reading Image
		FileInputStream fis = new FileInputStream("src/main/java/pic.png");
		byte[] data = new byte[fis.available()];
		fis.read(data);
		address.setImage(data);
		
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();
		session.save(student);
		session.save(address);
		t.commit();
		session.close();
		
	}
}
