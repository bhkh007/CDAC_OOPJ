package Assignment_8;

import java.util.Scanner;

public class Ques_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		int arr[] =  new int[size];
		System.out.println("Enter size of Array : " + size );
		for (int i=0;i<size; ++i) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Displaying Array contents" );
		displayArray(arr);
		
		System.out.println("Sum of Array : " + sumofArray(arr));
		
		System.out.println("Average of Array : " + averageArray(arr));
		System.out.println("Largest number of Array : " + largestNumber(arr));
		System.out.println("Smallest number of Array : " + smallestNumber(arr));
		
		
	}
	
	public static void displayArray(int[] arr) {
		for (int num : arr) {
			System.out.println(num + " ");
			
		}
	}
	
	public static int sumofArray(int[]arr) {
		int sum =0;
		for (int num : arr) {
			sum+=num;
		}
		return sum;
	}
	
	public static double averageArray(int []arr) {
		return (double) sumofArray(arr)/ arr.length; 

	}
	
	public static int  largestNumber(int []arr) {
		int largest = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}return largest;
		
	}
	
	public static int  smallestNumber(int []arr) {
		int smallest = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest =arr[i];
			}
		}return smallest;

	}

}
