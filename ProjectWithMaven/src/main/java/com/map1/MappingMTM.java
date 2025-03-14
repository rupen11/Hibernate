package com.map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingMTM {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
//		Create Employee1
		Employee emp = new Employee();
		emp.setEid(1);
		emp.setName("Rupen");
		
//		Create Employee2
		Employee emp1 = new Employee();
		emp1.setEid(2);
		emp1.setName("Pratham");
		
//		Create Project1
		Project pro = new Project();
		pro.setPid(101);
		pro.setProjectName("Food Website");
		
//		Create Project2
		Project pro1 = new Project();
		pro1.setPid(102);
		pro1.setProjectName("Food Application");
		
		List<Employee> list1 = new ArrayList<Employee>();
		list1.add(emp);
		list1.add(emp1);
		
		List<Project> list2 = new ArrayList<Project>();
		list2.add(pro);
		list2.add(pro1);
		
		//Set Project and Employee
		emp.setProject_(list2);
		pro1.setEmployee_(list1);
		
		
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.save(emp);
		session.save(emp1);
		session.save(pro);
		session.save(pro1);
		t.commit();
		session.close();
		
	}
}
