package Assignment_1;
import java.util.Scanner;
public class Ques_06 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your weight in kilograms: ");
		double weight = scanner.nextDouble();
		
		System.out.println("Enter your weight in meters: ");
		double height = scanner.nextDouble();
		
		double bmi = (weight / (height * height)) ;
		
		String category = null;
		
		if (bmi < 18.5)
		{
			category = "Underweight";
		}
		else if (bmi <25)
		{
			category = "Normal Weight";
		}
		else if (bmi>25)
		{
			category = "Overweight";
			
		}
		System.out.println("BMI: " + bmi);
		System.out.println("Category is: " + category);
		
		scanner.close();

	}

}
