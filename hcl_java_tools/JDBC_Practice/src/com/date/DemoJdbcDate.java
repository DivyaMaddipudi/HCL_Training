package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DemoJdbcDate {
	public static void main(String[] args) throws ParseException {
		
		//how to create date object
//		Date date = new Date(0, 11, 9); //dont use this
		
//		String dateString = null;
//		Scanner scanner = new Scanner(System.in);
//		dateString = scanner.nextLine();
//		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//		Date date = format.parse(dateString);
//		System.out.println(date);
		
		//in order to support jdbc: we need to convert util.date to sql.date
		//date.detTime(): java.util.Date.getTime() give me milliseconds since mid night 1970
		
//		java.sql.Date dateSql = new java.sql.Date(date.getTime());
//		System.out.println(dateSql);
		
		
		
		System.out.println("------------------------------java 8 date time api------------------------------------");
		LocalDate localDate = LocalDate.of(2019, Month.JUNE, 1);
		System.out.println(localDate);
		
		//getting current date
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current date: " + currentDate);
		
		//convert string to localDate
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dateStr = "06/11/2020";
		LocalDate date = LocalDate.parse(dateStr, fmt);
		System.out.println("String to local date: " + date);
		
		//convert local date to sql date
		java.sql.Date localToSqlDate = java.sql.Date.valueOf(date);
		System.out.println("local to sql dare: " +localToSqlDate);
	}
}
