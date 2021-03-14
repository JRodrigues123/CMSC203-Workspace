import java.util.Scanner;
public class WyvernQuest {

	enum Elements {FIRE, WATER, EARTH, WIND}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Elements element;
		
		MainCharacter character = new MainCharacter();
		
		String name;
		
		char gender;
		
		System.out.println("Welcome to the world of wadafuk palace, before we start your journey "+
							"\nwhat is your Gender?(G/g for girl, B/b for Boy, or N/n for Neither ");
		gender = in.next().charAt(0);
		
		while(gender != 'G' || gender != 'g' || gender != 'B' || gender != 'b' || gender != 'N' || gender != 'n') {
			
			System.out.println("Please pick a gender, I don't have time for this...");
			
			gender = in.next().charAt(0);
		}
		
		System.out.println("You are a " + character.getGender());
		
		
		
	}

}
