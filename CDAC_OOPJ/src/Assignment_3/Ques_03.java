package Assignment_3;

public class Ques_03 {

	public static void main(String[] args) 
	{
		int intValue = 40;
		float floatValue = 10.5f;
		double doubleValue = 20.5;
		
		double result1 = intValue + doubleValue;
		float result2 = intValue + floatValue;
		
		double result3 = intValue - doubleValue;
		float result4 = intValue - floatValue;
		
		double result5 = intValue * doubleValue;
		float result6 = intValue * floatValue;
		
		double result7 = intValue / doubleValue;
		float result8  = intValue / floatValue;
		
		System.out.println("Addition: "+ result1+ " & " +result2 );
		System.out.println("Subtraction: " + result3+ " & " +result4);
		System.out.println("Multiplication: " +result5+ " & " +result6);
		System.out.println("Division: " +result7+ " & " +result8);
				
	}

}
