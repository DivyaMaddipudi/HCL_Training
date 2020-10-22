package lab_assignment_4.q7;

import java.io.IOException;

import lab_assignment_4.q6.InputException;

public class Tester7 {

	public static void main(String[] args) {
		ExceptionExample exceptionExample = new ExceptionExample();
		try {
			exceptionExample.throwException();
		} catch (InputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

// Answer: 2 catch blocks because the methods throws two exceptions and 
//we have to handle those two exceptions