package com.emp;

import java.util.*;
import java.util.stream.Collectors;

public class DemoEmp {

	public static void main(String[] args) {

		List<Emp> emps = getEmps();
		
		//get name of emps, sal < 10000 sort as per name
		
		//find emps those are getting sal < 10000
		System.out.println("-----------less sal and sort by name---------------");
		List<String> lessSal = emps.stream()
							.filter(EmpUtil::isLowSalried) //emp->emp.getSalary()<10000
							.map(Emp::getName) //emp -> emp.getName()
							.sorted(Comparator.reverseOrder())
							.limit(20)
							.collect(Collectors.toList());
//		lessSal.forEach(emp -> System.out.println(emp));
		lessSal.forEach(System.out::println);
		
		
		//name and designation of employees
		System.out.println("-------------concat of name and designation----------------");
		
		List<String> nameAndDesig = emps.stream()
										.map(emp-> emp.getName().concat(" ").concat(emp.getDept()))
										.sorted()
										.collect(Collectors.toList());
		nameAndDesig.forEach(System.out::println);
		
		System.out.println("--------------printing all records------------------");
		emps.stream().forEach(emp -> System.out.println(emp));
		
		//sort based on sal if sal equal sort by name
		
		System.out.println("------------------sort based on sal if sal equal sort by name--------------------");
		List<Emp> empSortedList = emps.stream()
									.sorted(Comparator.comparing(Emp::getSalary)
											.thenComparing(Emp::getName)
											.thenComparing(Emp::getDept))
									.collect(Collectors.toList());
		empSortedList.forEach(emp -> System.out.println(emp));
		
		//print record of all the employees working in CS
		System.out.println("------------employees working in CS---------------------");
		emps.stream()
		.filter(emp->emp.getDept().equals("CS"))
		.forEach(emp->System.out.println(emp));
		
		
	}

	private static List<Emp> getEmps() {
		List<Emp> emp = new ArrayList<>();
		emp.add(new Emp(121, "divya", 20000, "CS"));
		emp.add(new Emp(122, "riya", 10000, "Sales"));
		emp.add(new Emp(123, "john", 10000, "Marketing"));
		emp.add(new Emp(124, "ram", 5000, "IT"));
		emp.add(new Emp(125, "veenai", 25000, "HR"));
		emp.add(new Emp(126, "doe", 8000, "CS"));

		return emp;
	}
}
