package com.one2many.uni;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bookapp.dao.HibernateSessionFactory;

public class MainOneToMany {
	
	public static void main(String[] args) {
		
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		Session session = factory.openSession();
		
		session.getTransaction().begin();
		
		
		List<Department> depts = session.createQuery("select distinct d from Department d  join fetch d.employees").list();
		
		
		for(Department d: depts) {
			System.out.println(d.getDeptName());
			System.out.println(d.getEmployees());
		}
		
		
//		Employee employee = new Employee("diya");
//		Employee employee1 = new Employee("riya");
//		Employee employee2 = new Employee("ram");
//		
//		List<Employee> employees = Arrays.asList(employee, employee1, employee2);
//
//		Department department = new Department("hcl training", employees);
//		
//		session.save(department);
		
		
		session.getTransaction().commit();
		session.close();
		factory.close();
		
		
		
	}

}
