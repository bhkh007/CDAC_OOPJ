package Assignment_5;

import java.util.Scanner;

class Bank
{
	private String name;
	private int accNumber;
	private double balance;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	Scanner sc = new Scanner(System.in);
	public void createAccount() {
		
		System.out.println("Enter account holder's name");
		String name = sc.next();
		int accNumber = (int)Math.ceil(Math.random()*9999);
		this.name = name;
		this.setAccNumber(accNumber);
		this.setBalance(0);
		System.out.println("Your Account Created Successfully!!");
		System.out.println("Your account number is : " + this.getAccNumber());
		
	}
	
	public void depositMoney() {
		System.out.println("Enter account number : ");
		int accNumber = sc.nextInt();
		if(accNumber==this.getAccNumber()) {
			System.out.println("Enter amount to be deposited : ");
			int amount = sc.nextInt();
			this.setBalance(this.getBalance() + amount);
			System.out.println("Amount deposited Successfully!!");
		}else {
			System.out.println("Invalid account number input");
		}
	}
	
	public void withdrawMoney()
	{
		System.out.println("Enter account number : ");
		int accNumber = sc.nextInt();
		if(accNumber==this.getAccNumber()) {
			System.out.println("Enter amount to be withdrawn : ");
			int amount = sc.nextInt();
			if(this.getBalance()>=amount)
			System.out.println("Amount withdrawn Successfully!!");
			this.setBalance(this.getBalance()-amount);
		}else {
			System.out.println("Invalid account number input");
		}
	}
	 public void accbalance()
	 {
		 System.out.println("Enter account number : ");
			int accNumber = sc.nextInt();
			if(accNumber==this.getAccNumber()) {
				System.out.println("Bank balance is : "+ this.getBalance());
			}
			else{
					System.out.println("Invalid account number input");
				}
	 }	 
	 public void accholderInfo()
	 {
		 System.out.println("Name  : " + this.getName());
		 System.out.println("Account number  : "+this.getAccNumber());
		 System.out.println("Account balance : "  + this.getBalance());
		 System.out.println("*****************************");
	 }
	 
}
public class Ques_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Bank bk = new Bank();
		while (true) {
			System.out.println("Enter choice");
			System.out.println("1. Create new account");
			System.out.println("2. Deposit money");
			System.out.println("3. Withdraw  amount");
			System.out.println("4. Display bank balance");
			System.out.println("5. Display account holder's info");
			System.out.println("6. Exit Bank");
			
			int choice = sc.nextInt();
			if (choice==1){
				bk.createAccount();
			}else if(choice==2) {
				bk.depositMoney();
			}
			else if(choice==3) {
				bk.withdrawMoney();
			}
			else if(choice==4) {
				bk.accbalance();
			}
			else if(choice==5) {
				bk.accholderInfo();
			}
			else if(choice==6) {
				 System.out.println("Thankyou for visiting !!");
				 break;
			}
			
				
			}

	}

}
