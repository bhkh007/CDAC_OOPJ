package CodingPatterns;

public class Ques12 {

	public static void main(String[] args) {
		int rows = 	6;
		for(int i=rows;i>=1;i--) {
			for(char j ='A';j<='A' +(rows -i);j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
