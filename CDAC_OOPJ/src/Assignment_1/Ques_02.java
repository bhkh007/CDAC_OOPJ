package Assignment_1;

import java.util.Scanner;
public class Ques_02 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Year: ");
		int year = scanner.nextInt();
		
		int remainby4 = year % 4;
		int remainby100 = year %100;
		int remainby400 = year %400;
		
		switch (remainby4)
		{
		case 0:
		if (remainby100 !=0 || remainby400 == 0)
			System.out.print(year + " is a leap year");
		
		else
		{
			System.out.print(year + " is not a leap year");
		}
		break;
		default:
			System.out.print(year + " is not a leap year");
			
	}
			
			scanner.close();
	}
	
}
