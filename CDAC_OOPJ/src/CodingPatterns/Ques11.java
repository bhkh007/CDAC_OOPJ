
package CodingPatterns;

public class Ques11 {

	public static void main(String[] args) {
		
		int rows = 7;
		
		for(int i=1; i<=rows; i++) {
			for(char j = 'A'; j<='A'+(rows -i); j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		for(int i=rows; i>=1; i--) {
			for(char j = 'A'; j<= 'A' +(rows -i); j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
