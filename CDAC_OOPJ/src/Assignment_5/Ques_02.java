package Assignment_5;

import java.util.Scanner;

public class Ques_02
{
	private double height;
	private double weight;
	
	public Ques_02(double height, double weight)
	{
		this.height = height;
		this.weight = weight;
		
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double calculateBMI()
	{
		return weight /(height*height);
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your height :" );
		double height = scanner.nextDouble();
		
		System.out.println("Enter your weight :" );
		double weight = scanner.nextDouble();
		
		Ques_02 bmiCalculator = new Ques_02(height, weight);
		
		double  bmi =  bmiCalculator.calculateBMI();
		
		System.out.println("BMI is  :"  + bmi);
		
		scanner.close();
		
		
	}
	
}