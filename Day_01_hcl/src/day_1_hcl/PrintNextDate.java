package day_1_hcl;

import java.util.Scanner;

public class PrintNextDate {
	
	public static boolean isLeapYear(int year) {
		
		boolean isLeapYear = false;
		if((year % 4 == 0) || (year%100 != 0) && (year%4 == 0))  {
			isLeapYear = true;
		}
		return isLeapYear;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int date = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		
		System.out.println(date+"/"+month +"/"+year);
		
		//0 indicate invalidate month
		int monthsArr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

		if(isLeapYear(year)) {
			if(monthsArr[month] == 1 || monthsArr[month] == 3 || monthsArr[month] == 5 || monthsArr[month] == 7 || monthsArr[month] == 8 || monthsArr[month] == 10 || monthsArr[month] == 12) {
				if( date < 31 ) {
					date = date + 1;
				} else {
					if(month < 12) {
						month = month + 1; 
						date = (date%31) + 1;
					} else {
						date = (date%31)+1; 
						month = (month % 12)+1;
						year = year + 1;
					}
					
				}
			}else if(monthsArr[month] == 2) {
				if( date < 28 ) {
					date = date + 1;
				} else {
					if(month < 12) {
						month = month + 1; 
						date = (date%29) + 1;
					} else {
						date = (date%28)+1; 
						month = (month % 12)+1;
					}
					
				}
			}else {
				if( date < 30 ) {
					date = date + 1;
				} else {
					if(month < 12) {
						month = month + 1; 
						date = (date%31) + 1;
					} else {
						date = (date%31)+0; 
						month = (month % 12)+1;
						year = year + 1;
					}
					
				}
			}
			
		} else {
			if(monthsArr[month] == 1 || monthsArr[month] == 3 || monthsArr[month] == 5 || monthsArr[month] == 7 || monthsArr[month] == 8 || monthsArr[month] == 10 || monthsArr[month] == 12) {
				if( date < 31 ) {
					date = date + 1;
				} else {
					if(month < 12) {
						month = month + 1; 
						date = (date%31) + 1;
					} else {
						date = (date%31)+1; 
						month = (month % 12)+1;
						year = year + 1;
					}
					
				}
			}else if(monthsArr[month] == 2) {
				if( date < 28 ) {
					date = date + 1;
				} else {
					if(month < 12) {
						month = month + 1; 
						date = (date%28) + 1;
					} else {
						date = (date%28)+1; 
						month = (month % 12)+1;
					}
					
				}
			}else {
				if( date < 30 ) {
					date = date + 1;
				} else {
					if(month < 12) {
						month = month + 1; 
						date = (date%31) + 1;
					} else {
						date = (date%31)+1; 
						month = (month % 12)+1;
						year = year + 1;
					}
					
				}
			}
			
		}
		System.out.println(date+"/"+month +"/"+year);
		
		
	}

}
