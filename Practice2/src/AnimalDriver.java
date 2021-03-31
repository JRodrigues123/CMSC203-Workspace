/**
 * Main Driver
 */
import java.util.Scanner;

//Client Class/Driver Class

public class AnimalDriver {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Dog d1 = new Dog(5, 69.02, "Germane", "German Sheperd", "Black");
				
		Animal d2 = new Dog();
		
		System.out.println(d1.toString());
		
	}

}