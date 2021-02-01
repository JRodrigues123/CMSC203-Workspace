import java.util.Scanner;
public class ProgramLoop {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int ans;
		
		
		System.out.println("Please enter the number zero please! ");
		
		ans = in.nextInt();
		
		while(ans != 0) {
			
			System.out.println("\n" + ans);
			
			System.out.println("Please type in the right number! ");
			
			ans = in.nextInt();
			
			
		}
		
		System.out.println("This is the right number!");
	}

}
