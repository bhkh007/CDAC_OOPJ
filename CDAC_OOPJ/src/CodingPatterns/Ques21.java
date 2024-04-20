package CodingPatterns;

public class Ques21 {

	public static void main(String[] args) {
		

	int rows = 7;
	for(int i =1; i<=rows;i++) {
		for(int j =1;j<=i;j++) {
			if(j%2 ==1) {
				System.out.print("1");
			}
			else {
				System.out.print("0");
			}
		}
		System.out.println();
		}
}
}