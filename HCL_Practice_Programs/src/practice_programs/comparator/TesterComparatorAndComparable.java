package practice_programs.comparator;

import java.util.ArrayList;
import java.util.List;

public class TesterComparatorAndComparable {
	
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1001, "divya", "cse", 21));
		studentList.add(new Student(1002, "satya", "ece", 21));
		studentList.add(new Student(1003, "ram", "cse", 21));
		studentList.add(new Student(1004, "veenai", "cse", 21));
		studentList.add(new Student(1005, "riya", "cse", 21));
		studentList.add(new Student(1006, "joe", "cse", 21));
	}

}
