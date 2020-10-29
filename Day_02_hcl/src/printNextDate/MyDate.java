package printNextDate;

public class MyDate {

	private int day;
	private int month;
	private int year;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;

		printDate(day, month, year);

	}

	private void printDate(int day, int month, int year) {
		int tempDay = day;
		int tempMonth = month;
		int tempYear = year;

		if (isLeapYear(year)) {
			int[] noOfDaysInMonth = { -1, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			tempDay = day + 1;
			
			if (tempDay > noOfDaysInMonth[month]) {
				tempDay = 1;
				tempMonth = month + 1;
				if (tempMonth > 12) {
					tempMonth = 1;
					tempYear = year + 1;
				}
			}

			System.out.println(tempDay + "/" + tempMonth + "/" + tempYear);
		} else {
			int[] noOfDaysInMonth = { -1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

			tempDay = day + 1;
			
			if (tempDay > noOfDaysInMonth[month]) {
				tempDay = 1;
				tempMonth = month + 1;
				if (tempMonth > 12) {
					tempMonth = 1;
					tempYear = year + 1;
				}
			}

			System.out.println(tempDay + "/" + tempMonth + "/" + tempYear);
		}

	}

	private static boolean isLeapYear(int year) {

		boolean isLeapYear = false;
		if ((year % 4 == 0) || (year % 100 != 0) && (year % 4 == 0)) {
			isLeapYear = true;
		}
		return isLeapYear;
	}

}
