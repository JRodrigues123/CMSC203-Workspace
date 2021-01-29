import java.util.Scanner;
public class WifiDiagnosis {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String ans;
		
		System.out.println("Is your wifi working Sir?");
		
		ans = in.nextLine();
		
		if(ans.equals("yes") || ans.equals("Yes")) {
			
			
			System.out.println("Good job! Now stop calling us");
		}
		else if(ans.equals("no") || ans.equals("No")){
			
			System.out.println("Are your cables ok?");
			
			ans = in.nextLine();
			
			if(ans.equals("yes")){
				
				System.out.println("You are good!");
			}
			else {
				System.out.println("You are fudged!");
			}
		}
		
		System.out.println();
		System.out.println("Thanks for calling us!");
	}

}
