package com.sqlquery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.tut.Student;

public class SQLExample {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		String q = "select * from Student";
		
		NativeQuery nq = session.createSQLQuery(q);
		
		List<Object[]> list = nq.list();
		
		System.out.println(list);
		
		for(Object[] s: list) {
			System.out.println(Arrays.toString(s));
		}
		
		session.close();
		factory.close();
	}
}