package Assignment_5;

import java.util.ArrayList;
import java.util.Scanner;

class Book {

	private String title;
	private String author;
	private String publisher;
	private String isbn_nu;
	private int year;
	private double price;
	private int quantity;
	static double totalCost;

	public Book() {

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getIsbn_nu() {
		return isbn_nu;
	}

	public void setIsbn_nu(String isbn_nu) {
		this.isbn_nu = isbn_nu;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setTotal() {
		totalCost = (this.quantity) * (this.price);

	}

	public void increaseQuantity(int quantity) {
		this.quantity = +quantity;
		setTotal();
	}

	public void decreaseQuantity(int quantity) {
		this.quantity = -quantity;
	}

	double getInventoryValue() {
		return totalCost;
	}
}

public class Ques_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Book> arr = new ArrayList<>();
		while (true)
		{
			System.out.println("*******************");
			System.out.println("1. Add new Book ");
			System.out.println("2. Increase quantity of book  ");
			System.out.println("3. Decrease quantity of book  ");
			System.out.println("4. Inventory of book of book  ");
			System.out.println("5. Break   ");
			System.out.println("*******************");
			
			int n = sc.nextInt();
			if(n==5)
			{
				break;
			}
			else if(n==1)
			{
				Book bk = new Book();
				System.out.println("Enter name of the book ");
				sc.next();
				String title = sc.nextLine();
				bk.setTitle(title);
				System.out.println("Enter author of the book ");
				String author = sc.nextLine();
				bk.setAuthor(author);
				System.out.println("Enter publisher name ");
				String publisher = sc.nextLine();
				bk.setPublisher(publisher);
				System.out.println("Enter ISBN number ");
				String isbn = sc.nextLine();
				bk.setIsbn_nu(isbn);
				
				Book bk1;
				boolean flag = false;
				for (int i=0;i<arr.size();i++)
				{
					bk1 = arr.get(i);
					if(bk1.getIsbn_nu().equals(isbn))
					{
						flag =true;
						break;
					}
				}
				if(flag)
				{
					System.out.println("This inbn already exist ");
					break;
				}
				else
				{
					bk.setIsbn_nu(isbn);
				}
				System.out.println("Enter publication year ");
				int year = sc.nextInt();
				bk.setYear(year);
				System.out.println("Enter price of book  ");
				double price = sc.nextInt();
				bk.setPrice(price);
				System.out.println("Enter quantity of books ");
				int quantity = sc.nextInt();
				bk.setQuantity(quantity);
				bk.setTotal();
				arr.add(bk);
				
				
		}
			else if(n==2) {
				System.out.println("Enter isbn number :");
				String isbn = sc.next();
				System.out.println(isbn);
				Book bk = null;
				boolean flag = false;
				for(int i=0;i<arr.size();i++) {
					bk=arr.get(i);
					if(bk.getIsbn_nu().equals(isbn)) {
						flag = true;
						break;
					}
				}
				if(flag) {
					System.out.println("Enter quantity : ");
					int quantity = sc.nextInt();
					if(quantity>0) {
						bk.increaseQuantity(quantity);
					}else {
						System.out.println("Quantity can not be negative ");
					}
				}else {
						System.out.println("Invalid ISBN number entered ");
				}
					}else if(n==3) {
						System.out.println("Enter ISBN number : ");
						String isbn = sc.next();
						System.out.println(isbn);
						Book bk = null;
						boolean flag = false;
						for(int i=0;i<arr.size(); i++){
							bk = arr.get(i);
							if (bk.getIsbn_nu().equals(isbn)) {
								flag = true;
								break;
							}
							}
						if(flag) {
							System.out.println("Enter quantity : ");
							int quantity = sc.nextInt();
							if(bk.getQuantity()-quantity>0) {
								bk.decreaseQuantity(quantity);
							}else {
								System.out.println("Quantity can not be negative ");
							}
						}else {
								System.out.println("Invalid ISBN number entered ");
						}
					}else if(n==4) {
						
						System.out.println("Enter ISBN number : ");
						String isbn = sc.next();
						System.out.println(isbn);
						Book bk = null;
						boolean flag = false;
						for(int i=0;i<arr.size();i++) {
							bk=arr.get(i);
							if(bk.getIsbn_nu().equals(isbn)) {
								flag = true;
								break;
							}
						}
						if (flag) {
							System.out.println(bk.getInventoryValue());
						}
						else {System.out.println("Invalid ISBN number entered");
						}
						
			}
				}System.out.println("Thank You for Coming!!");
				}
				
	

}

