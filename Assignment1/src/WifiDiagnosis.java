/*
 * Class: CMSC203
 * Instructor: Monshi, Khandon
 * Description: This is a WiFi Diagnosis test to see if the 
 * person can fix their internet.
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source
 * I have not given my code to any student.
 * Justin Rodrigues
 */
import java.util.Scanner;
public class WifiDiagnosis {

	public static void main(String[] args) {
		
		/**
		 * This Scanner is here for the user input 
		 * to answer yes or no
		 */
		Scanner in = new Scanner(System.in);
		
		//This is to hold the user's answer
		String ans;
		
		/*
		 * This starts off the whole code
		 */
		System.out.println("Reboot the computer and try to connect ");
		System.out.println("Did that fix the problem? ");
		//The user answers
		ans = in.nextLine();
		

		
		/*
		 * Going to do nested if statements
		 * Depending on what @ans equals, it'll end or continue the diagnosis
		 */
		if(ans.equals("yes")){
			
			System.out.println("\nRebooting your computer seemed to work.");
		
		}
		else if(ans.equals("no")){
			
			/*
			 * This is step 2 of the Diagnosis
			 */
			System.out.println("\nReboot the Router");
			System.out.println("Did that fix the problem? ");
			//User inputs their answer
			ans = in.nextLine();
			
			//An if and else if statement
			if(ans.equals("yes")){
				
				System.out.println("\nReboot it next time.");
			}
			else if(ans.equals("no")){
				
				/*
				 * Step 3 of the diagnosis
				 */
				System.out.println("\nMake sure the cables connecting the router are firmly"
									+ "\nplugged in and the power is getting to the router.");
				System.out.println("Did that fix the problem?");
				
				//User inputs their answer
				ans = in.nextLine();
				
				//Another if and else if statement
				if(ans.equals("yes")){
					
					System.out.println("\nRemember to connect your cables next time");
				}
				else if(ans.equals("no")){
					
					/*
					 * Final step of the diagnosis
					 */
					System.out.println("\nMove the computer closer to the router and try to connect");
					System.out.println("Did that fix the problem?");
					//User inputs their final answer
					ans= in.nextLine();
					
					//Last if and else statement
					if(ans.equals("yes")) {
						
						System.out.println("\nRemember to do that next time");
					}
					else if(ans.equals("no")) {
						
						System.out.println("\nContact your ISP!");
						
					}
				}
			}
		}
		
	}

}
