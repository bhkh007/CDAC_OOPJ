package Assignment_1;
import java.util.Scanner;
public class Ques_04 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a day number");
		int dayNumber = scanner.nextInt();
		
		String dayName;
		
		switch (dayNumber)
		{
			case 1:
				dayName = "Monday";
				break;
			case 2:
				dayName = "Tuesday";
				break;
			case 3:
				dayName = "Wednesday";
				break;
			case 4:
				dayName = "Thursday";
				break;
			case 5:
				dayName = "Friday";
				break;
			case 6:
				dayName = "Saturday";
				break;
			case 7:
				dayName = "Sunday";
				break;
			default:
				System.out.print("Invalid Day Name Input!");
				return;
		}
			System.out.print("The Name of the day is: " + dayName);
			scanner.close();

	}

}
