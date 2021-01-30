import java.util.Scanner;
public class Gradebook {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Student One = new Student("Justin", 18, 12);
		
		System.out.println(One.getAge());
	}

}
