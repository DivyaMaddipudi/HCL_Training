package ntu_oops.classes8;

public class Time {

	private int hour;
	private int minute;
	private int second = 00;

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void setTime(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	@Override
	public String toString() {
		String hour = String.valueOf(getHour());
		String minute = String.valueOf(getMinute());
		String second = String.valueOf(getSecond());
		
		if((hour.length() != 2 && minute.length() != 2 && second.length() != 2))  {
			
			hour = "0" + hour;
			minute = "0" + minute;
			second = "0" + second;
			
		} else if(hour.length() != 2 && minute.length() != 2) {
			
			hour = "0" + hour;
			minute = "0" + minute;
			
		} else if((minute.length() != 2 && second.length() != 2)) {
			
			minute = "0" + minute;
			second = "0" + second;
			
		} else if((second.length() != 2 && hour.length() != 2)) {
			
			second = "0" + second;
			hour = "0" + hour; 
		} else if(second.length() != 2) {

			second = "0" + second;
			
		} else if(minute.length() != 2)  {
			
			minute = "0" + minute;
			
		} else if(hour.length() != 2) {
			
			hour = "0" + hour;	
		}
		
		return hour + ":" + minute + ":" + second;
	}

	public Time nextSecond() {
		int tempSec = getSecond();
		int tempMin = getMinute();
		int tempHour = getHour();

		Time time;

		if (tempHour == 23 && tempMin == 59 && tempSec == 59) {
			tempHour = 0;
			tempMin = 0;
			tempSec = 0;
		} else {
			tempSec = getSecond() + 1;
			if (tempSec > 59) {
				tempSec = 0;
				tempMin = getMinute() + 1;
				if (tempMin > 59) {
					tempSec = 0;
					tempMin = 0;
					tempHour = getHour() + 1;

				}
			}
		}

		time = new Time(tempHour, tempMin, tempSec);
		return time;
	}
	
	public Time previousSecond() {
		int tempSec = getSecond();
		int tempMin = getMinute();
		int tempHour = getHour();

		Time time;

		if (tempHour == 0 && tempMin == 0 && tempSec == 0) {
			tempHour = 23;
			tempMin = 59;
			tempSec = 59;
		} else {
			tempSec = getSecond() - 1;
			if (tempSec < 0) {
				tempSec = 59;
				tempMin = getMinute() - 1;
				if (tempMin < 0) {
					tempSec = 59;
					tempMin = 59;
					tempHour = getHour() - 1;

				}
			}
		}

		time = new Time(tempHour, tempMin, tempSec);
		return time;
	}

}
