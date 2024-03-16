package Assignment_4;


class Employee
{
	public static void employData(String name,int empid)
	{
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Id: " + empid);
	}
	public static void employData(double salary, String performance)
	{
		System.out.println("employee Salary: " + salary);
		System.out.println("Employee Performance: " + performance);
	}
	public static void employData(boolean raise, double attendence)
	{
		System.out.println("Deserve a raise: " + raise);
		System.out.println("Employee attendence: " + 95);
	}
}

public class Ques_03 {

	public static void main(String[] args) 
	{
		Employee.employData("Bhavesh",500);
		Employee.employData(40000, "Good");
		Employee.employData(true, 95.5);
	}

}
