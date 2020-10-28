/*
 * 
 * Write a program to serialize and deserialize an object of Employee class. Employee class has the following members.
 * 
 */
package lab_assignment_4.q3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Tester3 {
	public static void main(String[] args) {
		
		//serialize
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tester3.ser"));
			Employee employee = new Employee("divya", 51896251, "andhra", 30000.0);
			oos.writeObject(employee);
			employee.display();
			System.out.println("data successfully serialized..!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//deserialize
		
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream("tester3.ser"));
			Employee employeeObj = (Employee) ois.readObject();
			employeeObj.display();
			System.out.println("deserialized data successfully....!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
