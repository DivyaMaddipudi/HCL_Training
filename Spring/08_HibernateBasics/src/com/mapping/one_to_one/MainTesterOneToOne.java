package com.mapping.one_to_one;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bookapp.dao.HibernateSessionFactory;

public class MainTesterOneToOne {

	public static void main(String[] args) {
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		Session session = factory.openSession();
		
		session.getTransaction().begin();
		
//		List<Employee> employees = session.createQuery("select e from Employee e").list();
		
		List<Employee> employees=session.createQuery("select e from Employee e join fetch e.parking Parking").list();
		
		for(Employee emp: employees) {
			System.out.println(emp.getEmpName());
			System.out.println(emp.getParking());
		}
		
		
		
		
		
//		Employee employee = session.get(Employee.class, 1);
//		
//		
//		System.out.println(employee.getEmpName());
//		session.close();
//		
//		System.out.println(employee.getParking());
		
		
		
		
		
//		Parking parking1 = new Parking("A123");
//		Employee employee1 = new Employee("ravi", parking1);
//		
//		Parking parking2 = new Parking("B123");
//		Employee employee2 = new Employee("hari", parking2);
//		
//		Parking parking3 = new Parking("C123");
//		Employee employee3 = new Employee("jaggu", parking3);
		
		
		
//		session.save(employee1);
//		session.save(parking1);
		
		
//		session.save(parking2);
//		session.save(employee2);
		
//		session.save(parking3);
//		session.save(employee3);
		
		
//		session.getTransaction().commit();
//		session.close();
		factory.close();
		
	}
}
