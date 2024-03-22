package Assignment_5;

import java.util.Scanner;

class Calculation
{
	private double numerator;
	private double denominator;
	public double getNumerator() {
		return numerator;
	}
	public void setNumerator(double val) {
		this.numerator = val;
	}
	public double getDenominator() {
		return denominator;
	}
	public void setDenominator(double val) {
		this.denominator = val;
	}
}

public class Ques_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Calculation calc1 = new Calculation();
		System.out.println("Enter the first numerator :");
		double val = sc.nextDouble();
		calc1.setNumerator(val);
		System.out.println("Enter the first denominator : ");
		val = sc.nextDouble();
		calc1.setDenominator(val);
		
		Calculation calc2 = new Calculation();
		System.out.println("Enter the second numerator :");
		val = sc.nextDouble();
		calc2.setNumerator(val);
		System.out.println("Enter the second denominator : ");
		val = sc.nextDouble();
		calc2.setDenominator(val);
		
		System.out.println("Enter operations {+,-,*,/}");
		String str = sc.next();
		char ch = str.charAt(0);
		
		double ans =0;
		double num1 = calc1.getNumerator()/calc1.getDenominator();
		double num2 = calc2.getNumerator()/calc2.getDenominator();
		
		if(ch=='+') {
			ans = num1+ num2;
		}else if(ch=='-') {
			ans = num1-num2;
		}else if(ch=='*') {
			ans = num1*num2;
		}else if(ch=='/') {
			ans = num1/num2;
		}
		System.out.println(calc1.getNumerator()+"/"+calc1.getDenominator() +"/" +calc2.getNumerator()+"/" +calc2.getDenominator() +" = "+ ans);
			
		
		

	}

}
