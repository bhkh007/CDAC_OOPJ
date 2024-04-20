package CodingPatterns;

public class Ques18 {

	public static void main(String[] args) {
		int row = 7;
		for(int i=1;i<=row;i++) {
			for(int j =7;j>=8-i;j--){
			System.out.print(j + " ");		
			}
			System.out.println();
		}
	}
}
