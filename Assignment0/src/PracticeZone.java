import java.util.Scanner;
public class PracticeZone  {
    public static void main(String[] args) {
        
    	/*
    	 * For a quicker way to get a system.out.print statement
    	 * type "sysout" then control+space on your keyboard
    	 */
    	
    	
    	
    	Scanner in = new Scanner(System.in);
    	
    	String ans;
    	
    	//Question
    	System.out.println("Do you like JavaFX?");
    	
    	ans = in.nextLine();
    	
    	if(ans.equals("Justin")) {
    		
    		System.out.println("Very bad mistake!");
    		
    	}
    	else {
    		System.out.println("You are very smart");
    	}
    	
   
    }

    
}
