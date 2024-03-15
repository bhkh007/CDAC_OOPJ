package Assignment_1;

import java.util.Scanner;

public class Ques_03 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
	    
		System.out.print("Enter the first number: ");
		double num1 = scanner.nextDouble();
		System.out.print("Enter the second number: ");
		double num2 = scanner.nextDouble();
		
		System.out.print("Enter the operator (+,-,*,/)");
		char operator = scanner.next().charAt(0);
		double result = 0;
		
		switch (operator)
		{
			case '+':
				result = num1+num2;
				break;
			case '-':
				result = num1-num2;
				break;
			case '*':
				result = num1*num2;
				break;
			case '/':
				result = num1/num2;
				break;
			default:
				System.out.print("Error, invalid input");
				return;
				
					
		}
		System.out.print("Result:" + result);
		scanner.close();
		

	}

}
