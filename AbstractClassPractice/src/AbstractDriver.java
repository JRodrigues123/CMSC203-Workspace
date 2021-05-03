import java.util.Scanner;
import java.util.InputMismatchException;

public class AbstractDriver {

	public static void main(String[] args) {
		
		int n = 20;
		
		conv(n);
	}
	
	public static void conv(int n) {
		
		if(n > 0) {
			
			conv(n/2);
			System.out.printf("%d", n % 2 );
			System.out.println();
		}
	}
	
	

}
