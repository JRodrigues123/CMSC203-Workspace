import java.util.Scanner;
import java.util.InputMismatchException;

public class AbstractDriver {

	public static void makerOfExceptions() throws ArithmeticException, ArrayIndexOutOfBoundsException, NumberFormatException{
		Scanner s = new Scanner(System.in);
		int x[] = new int[5];
		System.out.println(1/x[4]);
		System.out.println(x[5]);
		System.out.println("Enter an integer: ");
		int num = s.nextInt();
		System.out.println(num);
	}

	public static void main(String[] args) {
		try {
			makerOfExceptions();
		} 
		catch(ArithmeticException e) {
			System.out.println("No dividing by zero!");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("only five spots in this array!");
		}
		catch(NumberFormatException e) {
			System.out.println("Silly, I said integer.");
		}
	}

}
