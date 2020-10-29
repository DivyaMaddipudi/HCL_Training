package com.immutable_classes;

import java.util.Arrays;
import java.util.Date;

final class MyImmutableClass {
	
	private final int temp;
	private final String name;
	private final Date date;
	private final int[] arr;
	
	public MyImmutableClass(int temp, String name, Date date, int[] arr) {
		super();
		this.temp = temp;
		this.name = name;
		this.date = (Date) date.clone();
		this.arr = Arrays.copyOf(arr, arr.length);
	}

	public int getTemp() {
		return temp;
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		return date;
	}

	public int[] getArr() {
		return Arrays.copyOf(arr, arr.length);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyImmutableClass [temp=");
		builder.append(temp);
		builder.append(", name=");
		builder.append(name);
		builder.append(", date=");
		builder.append(date);
		builder.append(", arr=");
		builder.append(Arrays.toString(arr));
		builder.append("]");
		return builder.toString();
	}
	
}

public class DemoOnOwnImmutableClasses {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		int arr[] = {4, 8, 9};
		
		MyImmutableClass obj = new MyImmutableClass(10, "divya", date, arr);

//		arr[2] = 10;
//		date.setDate(date.getDate()+2);
		
		System.out.println(obj);
	}

}
