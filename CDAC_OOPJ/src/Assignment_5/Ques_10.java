package Assignment_5;

import java.util.Scanner;

class CreditScore
{
	Scanner sc = new Scanner(System.in);
	private int creditHistory;
	private double creditutilization;
	private boolean paymentHistory;
	public int getCreditHistory() {
		return creditHistory;
	}
	public void setCreditHistory(int creditHistory) {
		this.creditHistory = creditHistory;
	}
	public double getCreditutilization() {
		return creditutilization;
	}
	public void setCreditutilization(double creditutilization) {
		this.creditutilization = creditutilization;
	}
	public boolean getPaymentHistory() {
		return paymentHistory;
	}
	public void setPaymentHistory(boolean paymentHistory) {
		this.paymentHistory = paymentHistory;
	}
	
	public CreditScore() {
		System.out.println("Enter credit history length : ");
		int crlength = sc.nextInt();
		System.out.println("Enter percentage of available credit : ");
		int crHistory = sc.nextInt();
		System.out.println(" Credit holder payment history Good/Bad : ");
		boolean goodOrBad = sc.nextBoolean();
		this.setCreditHistory(crlength);
		this.setCreditutilization(crHistory);
		this.setPaymentHistory(goodOrBad);
		
		System.out.println("Your credit score is "+ this.calculateCreditScore());
		
	}
	 int calculateCreditScore()
	{
		 int score=0;
		 if(this.paymentHistory) {
			 score=(this.getCreditHistory()*15+(int)(this.getCreditutilization()*30)+50);
		 }else {
			 score=(this.getCreditHistory()*15+(int)(this.getCreditutilization()*30)+35);
		 }
		 return score;
	}
	 
}

public class Ques_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreditScore crscore = new CreditScore();
	}

}
