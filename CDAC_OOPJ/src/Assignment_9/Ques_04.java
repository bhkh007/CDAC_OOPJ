package Assignment_9;

import java.util.Scanner;

public class Ques_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter num1 : ");
			int num1 = sc.nextInt();
			System.out.println("Enter num2 : ");
			int num2 = sc.nextInt();
			int result = num1 / num2;
			System.out.println("Result : " + result);
		} catch (ArithmeticException e) {
			System.out.println("Exception found : " + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		} catch (Throwable e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		finally {
			System.out.println("Finally block");
		}

	}

}
