package com.date_examples;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DemoOnDate {
	public static void main(String[] args) throws ParseException {
		
		//finding the days
		
		LocalDate date = LocalDate.now();
		LocalDate date2= date.plusDays(1);
		System.out.println(date2);
		
		
//		LocalDateTime ldt = LocalDateTime.now();
//		System.out.println(ldt);
		
//		LocalDate localDate = LocalDate.now();
//		System.out.println(localDate); //2020-10-23
		
//		LocalDate localDate = LocalDate.of(2011, Month.JANUARY, 23);
//		System.out.println(localDate); //2011-01-23
		
//		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		LocalDate localDate = LocalDate.parse("11/11/2021", fmt);
//		System.out.println(localDate); 
//		
		
		
		// how to convert util.Date ==> java.sql.Date
		
//		Date date1 = new Date(System.currentTimeMillis());
//		java.sql.Date date = new java.sql.Date(date1.getTime());
//		System.out.println(date);
		
		
		//convert string to date	
//		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//		Date date = df.parse("11/12/2020");
//		System.out.println(date);
		
		// not very good design, it is mutable and not thread safe, performance is also bad
		//Java 8: date and time api => joda date and time
		//LOcalDate, LocalTime, LocalDateTime
		
		
		//Deprecated: Out dated
							//yy MM  dd  0-11 ----> : increase the year by one
							//year start from 1900+ 12 + 1
//		Date date = new Date(12, 12, 12);
		//Sun Jan 12 00:00:00 IST 1913
		
//		System.out.println(date.getDate());
//		System.out.println(date.getMonth());
//		System.out.println(date.getYear());
//		System.out.println(date);
		
		
		//Thu Jan 01 05:30:00 IST 1970
//		long time = System.currentTimeMillis();
//		System.out.println(time);
//		Date date = new Date(time);
//		System.out.println(date);
		
	}
}
