package java_codes_examples.stackOverflow;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

class Simptoms {
	String name;
	int value;

	public Simptoms(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Simptoms [name=");
		builder.append(name);
		builder.append(", value=");
		builder.append(value);
		builder.append("]");
		return builder.toString();
	}

}

public class StackOverEx1 {
	public static void main(String[] args) {

		Simptoms[] simptoms = new Simptoms[5];
		simptoms[0] = new Simptoms("sym1", 10);
		simptoms[1] = new Simptoms("sym2", 20);
		simptoms[2] = new Simptoms("sym3", 30);
		simptoms[3] = new Simptoms("sym4", 40);
		simptoms[4] = new Simptoms("sym5", 50);
		Scanner scanner = new Scanner(System.in);

		int number = 0;

		System.out.println("choose " + (number + 1) + " symptom");

		for (int j = 0; j < simptoms.length; j++) {
			System.out.println(j + 1 + " " + simptoms[j].getName() + " " + simptoms[j].getValue());
		}
		System.out.print("Choose: ");

		try {
			do {
				number = scanner.nextInt();

				if (!Character.isAlphabetic(number)) {
					if (number > simptoms.length) {
						System.out.println("Error, choose again");
						System.out.println("Please enter number!");
					}
				}
			} while (scanner.hasNext());
		} catch (InputMismatchException e) {
			System.out.println("Enter number");
		}

	}
}
