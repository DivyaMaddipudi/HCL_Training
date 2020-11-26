package com.mapping.one_to_one.bi;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bookapp.dao.HibernateSessionFactory;

public class MainTesterOneToOne {

	public static void main(String[] args) {
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		Session session = factory.openSession();
		
		session.getTransaction().begin();
		
//		List<Employee> employee = session.createQuery("from Employee e join fetch e.parking Parking").getResultList();
//		
//		for(Employee emp : employee) {
//			System.out.println(emp.getEmpName());
//			System.out.println(emp.getParking());
//		}
		
//		List<Parking> parking = session.createQuery("from Parking p join fetch p.employee Employee").getResultList();
//		
//		for(Parking park : parking) {
//			System.out.println(park.getParkingLocation());
//			System.out.println(park.getEmployee().getEmpName());
//		}
		
		Parking parking1 = new Parking("A123");
		Employee employee1 = new Employee("ravi", parking1);
		
		Parking parking2 = new Parking("B123");
		Employee employee2 = new Employee("hari", parking2);
		
		Parking parking3 = new Parking("C123");
		Employee employee3 = new Employee("jaggu", parking3);
		
		
		//hey parking1 ur emp is emp1
		parking1.setEmployee(employee1);
		//hey emp1 ur parking is parking1
		employee1.setParking(parking1);
		
		parking2.setEmployee(employee2);
		employee2.setParking(parking2);
		
		employee3.setParking(parking3);
		parking3.setEmployee(employee3);
		
		
		session.save(employee1);
		session.save(parking1);
		
		
		session.save(parking2);
		session.save(employee2);
		
		session.save(parking3);
		session.save(employee3);
		
		
		session.getTransaction().commit();
		session.close();
		factory.close();
		
	}
}
