package CodingPatterns;

public class Ques03 {

	public static void main(String[] args) {
		int x = 5;
		int y =1;
		
		for(int i =0; i< x ; i++) {
			for(int j=0; j<= i; j++) {
				System.out.print(y + " ");
				y++;
			}
			System.out.println();
		}
		
	}
}
