package Assignment_5;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.*;

public class Ques_01 {

	public static void main(String[] args) throws ParseException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Date (dd/mm/yyyy):");
		int date = sc.nextInt();
		System.out.println("Enter Date (dd/mm/yyyy):");
		int month = sc.nextInt();
		System.out.println("Enter Date (dd/mm/yyyy):");
		int year = sc.nextInt();
		month--;
		year = year-1900;
		System.out.println("Enter hour in hh :");
		int hour = sc.nextInt();
		System.out.println("Enter hour in hh :");
		int minute = sc.nextInt();
		System.out.println("Enter hour in hh :");
		int second = sc.nextInt();
		
		Date d = new Date();
		d.setDate(date);
		d.setMonth(month);
		d.setYear(year);
		
		d.setHours(hour);
		d.setMinutes(minute);
		d.setSeconds(second);
		
		
		System.out.println("************************");
		
		System.out.println("Date pattern");
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY  a");
		String ans = sdf.format(d);
		System.out.println(ans);
		
		System.out.println(new SimpleDateFormat("M/DD/YYYY :").format(d));
		System.out.println(new SimpleDateFormat("YYYY/M/DD : ").format(d));
		
		System.out.println("************************");
		
		System.out.println(new SimpleDateFormat("HH:mm:ss :").format(d));
		System.out.println(new SimpleDateFormat("hh:mm:ss a : ").format(d).replace("am", "AM").replace("pm", "PM"));
		System.out.println(new SimpleDateFormat("HH:MM").format(d));
		
		System.out.println(new SimpleDateFormat("DD/MM/YYYY HH:mm:ss :").format(d));
		System.out.println(new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a: ").format(d).replace("am", "AM").replace("pm", "PM"));
		System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(d));
		
		
		
		
	
	}


	
}
