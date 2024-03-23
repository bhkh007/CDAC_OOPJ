package Assignment_5;

import java.util.Calendar;

class Date
{
	private int day;
	private int month;
	private int year;
	
	public Date(int day,int month,int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	 boolean isValid() {
		if(year <1 || month <1 || month>12 || day<1)
			return false;
		int maxDays = 31;
		if(month ==4 || month == 6 || month == 9|| month == 11)
			maxDays = 30;
		else if(month ==2) {
			maxDays = isLeapYear()?29:28;
		}
		return day <=maxDays;
		
	}
	 public int getDayOfWeek() {
		 Calendar cal = Calendar.getInstance();
		 cal.set(year, month -1 , day);
		 return cal.get(Calendar.DAY_OF_WEEK)- 1;
	 }
	 

	 boolean isLeapYear() {
		// TODO Auto-generated method stub
		return ((year %4 ==0 && year %100 !=0 ) || year %400==0);
	}
	 
	 public Date getNextDay() {
		 if (!isValid())
		 return null;
		 
		 Calendar cal = Calendar.getInstance();
		 cal.set(year,month - 1, day);
		 cal.add(Calendar.DAY_OF_MONTH, 1);
		 return new Date(cal.get(Calendar.DAY_OF_MONTH), cal.get(Calendar.MONTH) +1, cal.get(Calendar.YEAR));
		 
	 }
	 public Date getPreviousDay() {
		 if (!isValid())
		 return null;
		 
		 Calendar cal = Calendar.getInstance();
		 cal.set(year,month - 1, day);
		 cal.add(Calendar.DAY_OF_MONTH -1, day);
		 return new Date(cal.get(Calendar.DAY_OF_MONTH), cal.get(Calendar.MONTH) +1, cal.get(Calendar.YEAR));
		 
	 }
	 
	 @Override
	 public String toString()
	 {
		 return String.format("%02d-%02d-%04d", day,month,year);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date(31, 12, 2022);
		System.out.println(date.isValid());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.isLeapYear());
		
		Date nextDay = date.getNextDay();
		System.out.println(nextDay);
		
		Date previousDay = date.getPreviousDay();
		System.out.println(previousDay);
	}

}
