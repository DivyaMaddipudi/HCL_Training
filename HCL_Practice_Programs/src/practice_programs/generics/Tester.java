package practice_programs.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Tester {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();

		Employee emp = new Employee(106, "jon", 2500.0);
		Employee emp1 = new Employee(103, "dhev", 50000.0);
		Employee emp2 = new Employee(102, "das", 25000.0);
		Employee emp3 = new Employee(105, "john", 45000.012);
		Employee emp4 = new Employee(104, "doe", 45000.0);
		Employee emp5 = new Employee(101, "sam", 23000.0);

		employeeList.add(emp);
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);

		// sort based on id
		Collections.sort(employeeList);
		printEmployees(employeeList);
		
		//sort based on salry, if salary equals then sort based on name
//		Collections.sort(employeeList, new SortBasedOnSalaryThenName());
//		printEmployees(employeeList);

		List<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student(1002, "divya", "CSE"));
		studentList.add(new Student(1001, "satya", "ECE"));
		studentList.add(new Student(1004, "riya", "IT"));
		studentList.add(new Student(1005, "ram", "CSE"));

		// sort based on id
		System.out.println("Students list");
		Collections.sort(studentList);		
		printStudent(studentList);
	}

	private static void printStudent(List<Student> studentList) {
		Iterator<Student> studIt = studentList.iterator();
		while(studIt.hasNext()) {
			System.out.println(studIt.next());
		}
	}

	private static void printEmployees(List<Employee> employeeList) {
		Iterator<Employee> empIt = employeeList.iterator();
		while (empIt.hasNext()) {
			System.out.println(empIt.next());
		}
	}

}
