package CodingPatterns;

public class Ques23 {

	public static void main(String[] args) {
		
	
	int row =9;
	for(int i =1;i<row;i++) {
		for(int j =0; j<row;j++) {
			if((i+j) %2 ==0) {
				System.out.print("0");
			}
			else {
				System.out.print("1");
			}
		}
		System.out.println();
	}
}
}
