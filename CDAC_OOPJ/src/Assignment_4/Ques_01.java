

package Assignment_4;
import java.util.Scanner;

class Student
{
 private String name;
 private int roll_no;
 private float marks;


 
 public void studentData()
 {
 try(Scanner scanner = new Scanner(System.in))
 {
	 System.out.println("Enter name: ");
	 this.name = scanner.nextLine();
	 System.out.println("Enter rollno: ");
	 this.roll_no = scanner.nextInt();
	 System.out.println("Enter marks: ");
	 this.marks = scanner.nextInt();
 }
	 
 }
 public void printData()
 {
	 System.out.println(this.name +" "+ this.roll_no+" "+ this.marks);
 }
	
}
 
public  class Ques_01
{

	public static void main(String[] args)
	{
		Student student = new Student();
		student.studentData();
		student.printData();
	}

}