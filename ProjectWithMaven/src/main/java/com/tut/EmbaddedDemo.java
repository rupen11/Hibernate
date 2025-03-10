package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbaddedDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
//		Create Student 1
		Student student1 = new Student();
		student1.setId(107);
		student1.setName("Vaidehi");
		student1.setCity("Himmatnagar");
		System.out.println(student1);

//		Create Certificate 1
		Certificate certificate1 = new Certificate();
		certificate1.setCourse("Java");
		certificate1.setDuration("3 Months");
		student1.setCerti(certificate1);
		System.out.println(certificate1);
		
		
//		Create Student 2
		Student student2 = new Student();
		student2.setId(108);
		student2.setName("Pratham");
		student2.setCity("Ahmedabad");
		System.out.println(student2);

//		Create Certificate 2
		Certificate certificate2 = new Certificate();
		certificate2.setCourse("Android");
		certificate2.setDuration("2 Months");
		student2.setCerti(certificate2);
		System.out.println(certificate2);
		
		
		Session s = factory.openSession();
		Transaction t = s.beginTransaction();
		s.save(student1);
		s.save(student2);
		t.commit();
		s.close();

	}

}
