package Assignment_7;

public class Ques_10 {

	public static void main(String[] args) {
		int []arr1 = {5,14,35,90,139};
		int []arr2 = {88,67,35,14,-12};
		int []arr3 = {65,14,129,34,7};
		
		printOrder(arr1);
		printOrder(arr2);
		printOrder(arr3);
	}
	private static void printOrder(int[] arr) {
		// TODO Auto-generated method stub
		
		boolean ascending = true;
		boolean descending = false;
		
		for (int i= 1; i< arr.length; i++)
		{
			if (arr[i] > arr[i-1]) {
				descending = false;
			}else if(arr[i] < arr[i-1]) {
				ascending = false;
			}
		}
		
		if (ascending) {
			System.out.println("Ascending");
		}else if (descending) {
			System.out.println("Descending");
		}else {
			System.out.println("Random");
		}
	}

}
