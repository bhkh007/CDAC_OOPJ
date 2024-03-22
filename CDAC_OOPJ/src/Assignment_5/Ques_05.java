package Assignment_5;

import java.util.Scanner;

class TelephoneBill
{
	private  String cus_name;
	private String phoneno ;
	private int callsmade;
	private double callduration;
	
	public TelephoneBill(String cus_name, String phoneno, int callsmade, double callduration)
	{
		this.cus_name = cus_name;
		this.phoneno = phoneno;
		this.callsmade = callsmade;
		this.callduration = callduration;
	}
	
	public double billAmount() {
		double charge = 0;
		if(callsmade>=100) {
			charge+=100*0.25;
			callsmade-=100;
			if(callsmade>0) {
				charge+=callsmade*0.25;
			}
		}else {
			charge+=callsmade*0.25;
		}
		if(charge<10) {
			charge =10;
		}
		return charge;
	}
}

public class Ques_05 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer name : ");
		String cus_name = sc.nextLine();
		System.out.println("Enter phone number : ");
		String phoneno = sc.next();
		System.out.println("Enter number of calls made : ");
		int callsmade = sc.nextInt();
		System.out.println("Enter duratiuon pf calls made : ");
		double callduration = sc.nextDouble();
		
		TelephoneBill tbill = new TelephoneBill(cus_name, phoneno, callsmade, callduration);
		
		System.out.println("The total bill amount is : " + " ₹ " +tbill.billAmount());

	}

}
