package com.secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//Not nessasary- Just for hibernate.cfg.xml->import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class secondcache {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		//First
		Session session1 = factory.openSession();
		Student student1 = session1.get(Student.class, 107);
		System.out.println(student1);
		session1.close();
		
		//Second
		Session session2 = factory.openSession();
		Student student2 = session2.get(Student.class, 107);
		System.out.println(student2);
		session2.close();
		
		factory.close();
	}
}
