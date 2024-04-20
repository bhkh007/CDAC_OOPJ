package CodingPatterns;

public class Ques02 {

	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i=0;i<n;i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
		
		
		for(int j=0; j<2*(n -i)-1 ;j++) {
			if(i==0 || j==0 || j== 2*(n-i) - 2 ) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
