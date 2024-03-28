package Assignment_8;

import java.util.Scanner;

class RestaurantMenu{
	
	private static final int MAX_MENU_SIZE = 10;
	private String[]menu = new String[MAX_MENU_SIZE];
	private double[] prices = new double[MAX_MENU_SIZE];
	private int menusize =0;
	
	Scanner sc = new Scanner(System.in);
	public void menuList() {
		System.out.println(" आपका मेनू ");
		for(int i=0;i<menusize;i++) {
			System.out.println((i+1) +"." + menu[i]+ " ₹"+ prices[i]);
		}
	}
	public void addDish() {
		System.out.println("Enter the name of dish: ");
		String dish = sc.nextLine();
		System.out.println("You've selected "+ dish);
		System.out.println("Enter the price of dish : ₹");
		double price = sc.nextDouble();
		menu[menusize] = dish;
		prices[menusize] = price;
		menusize++;
		
		System.out.println("Dishes added to the menu ");
		menuList();
		menuList();
	}
	
	public void removeDish() {
		if(menusize == 0) {
			System.out.println("The menu is empty");
			return;
		}
		System.err.println("Enter the dish number to remove");
		int index = sc.nextInt();
		if(index<1 || index> menusize) {
			System.out.println("Please enter valid Dish number");
			return;
		}
		index--;
		for(int i = index;i<menusize-1;++i) {
			menu[i]= menu[i+1];
			prices[i] = prices[i+1];
		}
		menusize--;
		
		System.out.println("Dish removed from Menu");
		menuList();
	}
	
	public void priceModify() {
		if(menusize==0) {
			System.out.println("Menu is empty");
			return;
		}
		System.out.println("Enter dish number to modify");
		int index = sc.nextInt();
		if(index<1 || index>menusize) {
			System.out.println("Invalid Index");
			return;
		}
		index--;
		System.out.println("Enter new prices of dishes : ₹");
		double newPrice = sc.nextDouble();
		prices[index] = newPrice;
		
		System.out.println("Price of the dish modified");
		menuList();
	}
}

public class Ques02{
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		RestaurantMenu rm= new RestaurantMenu();
		
		boolean exit = false;
		while(!exit) {
			System.out.println("Menu");
			System.out.println("1. View Menu ");
			System.out.println("2. Add new Dish to Menu ");
			System.out.println("3. Remove a dish from Menu ");
			System.out.println("4. Modify the price of a Dish ");
			System.out.println("5. Exit ");
			
			System.out.println("Enter choice : ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				rm.menuList();
				break;
			case 2:
				rm.addDish();
				break;
			case 3:
				rm.removeDish();
				break;
			case 4:
				rm.priceModify();
				break;
			case 5:
				exit = true;
				System.out.println("Thank You! ");
				break;
				default:
				System.out.println("Invalid choice ");
			}
		}
		sc.close();
	}
}