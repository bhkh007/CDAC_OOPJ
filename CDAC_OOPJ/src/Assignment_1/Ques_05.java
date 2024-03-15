package Assignment_1;
import java.util.Scanner;
public class Ques_05 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		char ch = scanner.next().charAt(0);
		
		
		if (ch == 'a' || ch == 'e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.print("Entered character is a Vowel");
		}
		else
		{			
			System.out.print("Entered character is a Consonant");
		}
		
		scanner.close();
	}
	

}
