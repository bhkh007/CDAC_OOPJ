package Assignment_9;

import java.util.Scanner;

public class Ques_02 {

	public static void method(int number) throws Exception {

		if (number % 2 != 0) {
			throw new Exception("Exception : Number is Odd");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			method(5);
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
		} finally {
			System.out.println("Finally statement");
		}
	}

}
