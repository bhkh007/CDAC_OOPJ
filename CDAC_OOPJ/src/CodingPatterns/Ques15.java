package CodingPatterns;

public class Ques15 {

	public static void main(String[] args) {
		int rows = 6;
		
		for(int i =0;i<rows ;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j = i+1;j<=rows;j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}
