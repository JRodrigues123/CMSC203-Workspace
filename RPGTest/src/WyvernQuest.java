import java.util.Scanner;
public class WyvernQuest {

	enum Elements {FIRE, WATER, EARTH, WIND}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//Elements used
		Elements element;
		
		MainCharacter character = new MainCharacter();
		
		String name;
		String gender;
		
		int exp = 0;
		
		System.out.println("Welcome to the world of wadafuk palace, before we start your journey "+
							"\nwhat is your Gender?(g for girl, b for Boy, or n for Neither, no uppercase) ");
		gender = in.nextLine();
		
		//This will determine your gender in this great quest
		if(gender.charAt(0) == 'g') {
			
			gender = "Woman";
			character.setGender(gender);
		}
		if(gender.charAt(0) == 'b') {
			
			gender = "Man";
			character.setGender(gender);
		}
		else {
			
			gender = "Other";
			character.setGender(gender);
			
		}
		
		//Character's name
		System.out.println("You are a " + character.getGender() + "...congrats!");
		System.out.println("Next up on this lst is well your name, do you remember it?");
		
		name = in.nextLine();
		
		character.setName(name);
		
		System.out.println(character.getName() + "? What a beautiful name, fits you very well.");
		System.out.println("You will now traverse this trwacherous world full of demons and monsters");
		
		System.out.println("But before you head out into this deep long journey, I will be giving "
							+ "you Ol Reliable, take great care of it.");
		System.out.println("YOU GOT THE SWORD!!!!!");
		
		Weapons olReliable = new Sword("olReliable", "Wood", 1);
		
	}
		

}
