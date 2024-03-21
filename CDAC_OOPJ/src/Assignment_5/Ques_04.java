package Assignment_5;

import java.util.Scanner;

class ElectricityBill {
	private String customerName;
	private double unitsConsumed;
	private double billAmount;

    ElectricityBill(String customerName, double unitsComsumed) {
		this.customerName = customerName;
		this.unitsConsumed = unitsComsumed;
	}

	double calculateBillAmount() {
		double amount = 0;

		if (unitsConsumed >= 100) {
			amount += 100 * 5;
			 unitsConsumed = unitsConsumed -100;
		
			if (unitsConsumed >= 200) {
				unitsConsumed -= 200;
				amount += 200 * 7;
			}
			if (unitsConsumed >= 0) {
				amount += unitsConsumed * 10;

			} 
			}
			else {
				amount += 100 * unitsConsumed;
			}
		return amount;
	}
}

public class Ques_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer name : ");
		String customerName = sc.next();
		System.out.println("Enter units consumed : ");
		double unitsConsumed = sc.nextDouble();
		ElectricityBill eb = new ElectricityBill(customerName, unitsConsumed);

		System.out.println("Customer name : " + customerName);
		System.out.println("Units consumed : " + unitsConsumed);
		System.out.println("Total amount bill : " + eb.calculateBillAmount());

	}
}
