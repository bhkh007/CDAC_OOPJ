package Assignment_9;

public class Ques_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[] = { 25, 35, 45, 55 };
			System.out.println(" " + arr[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception : " + e);
		}
	}

}
