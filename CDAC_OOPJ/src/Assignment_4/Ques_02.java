package Assignment_4;


class Vehicle
{
	public static void types(String model_name ,float speed )
	{
		 System.out.println("Model name: "+ model_name);
		 System.out.println("Speed: " + speed);
	}
	public static void types(float price,String fuel_type)
	{
		System.out.println( "Price: " + price);
		System.out.println("Fuel_type: "+fuel_type);
		
	}
	public static void types(int engine_cc, int torque )
	{
		System.out.println("Engine_cc: "+ engine_cc);
		System.out.println("Torque: " + torque);
	}
}


public class Ques_02 {

	public static void main(String[] args) 
	{
		Vehicle.types("BMW 7 Series  ", 220);
		Vehicle.types(3000, 650);
		Vehicle.types(20000000, " Petrol ");
	}

}
