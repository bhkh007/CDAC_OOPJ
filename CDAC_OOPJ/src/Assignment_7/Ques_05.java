package Assignment_7;

public class Ques_05 {

	
	private static int smallestno(int []arr) {
		int smallest =arr[0];
		
		for(int i = 1; i < arr.length; i++)
		{
			if (arr[i] < smallest)
			{
				smallest = arr[i];
			}
		}
		return smallest;
	}

	private static int largestno(int arr[]) {
		int largest =arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if (arr[i] > largest)
			{
				largest = arr[i];
			}
		}
		return largest;
	}
	
	public static void main(String[] args) {
		 int []arr = new int[] {10,20,30,40,50};
		 
		 int smallest = smallestno(arr);
		 int largest = largestno(arr);
		 
		 System.out.println("Smallest number is : " + smallest);
		 System.out.println("Largest number is : " + largest);

	}

	

}
