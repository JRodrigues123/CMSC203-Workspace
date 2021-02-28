/**
 * 
 * @author justinrodrigues
 */
import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		
		//Created Scanner
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		Movie m1 = new Movie();
		
		//Holds the movie's title and rating
		String title;
		String rating;
		
		//Answer yes or no
		String ans = "";
		
		//Holds the amount of tickets
		int tickets;
		
		//This will allow the loop to repeat or not
		int checkTheLoop = 1;
		
		do{	
			
				//Tells the user to enter  the title
				System.out.println("Enter the name of the movie: ");
			
				title = in.nextLine();
			
				//Sets the titla of the movie to the Movie Class
				m1.setTitle(title);
			
				//Now asks the user to enter the rating
				System.out.println("Enter the movie rating: ");
			
				rating = in.nextLine();
			
				//Sets the rating in the Movie class
				m1.setRating(rating);
			
				//Prompts the user
				System.out.println("Enter the amount of tickets sold: ");
			
				tickets = in.nextInt();
			
				//Set the tickets in Movie
				m1.setSoldTickets(tickets);
			
			
				//This is the output
				System.out.println(m1.toString());
			
			
				System.out.println("Would you like to try again? Enter y or n");
				in.next();
				ans = in.nextLine();
			
				//Check if it will loop or not
				if(ans.equals("n")) {
				
				checkTheLoop = 0;
				}
			
			
		   } while(checkTheLoop == 1);
		System.out.println("You are done boyo");		
	}

}
