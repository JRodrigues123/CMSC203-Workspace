import java.util.Scanner;
public class ShapeDriver {

	public static void main(String[] args) {
		
		
		Shape s = new Shape(); //create an object
		System.out.println(s.getColor())	 ;
		System.out.println(s.getName())	 ;
		System.out.println(s.getNumOfSides());
		
		
		
		Shape s2 = new Shape("Square", "Black", 5);
		
		System.out.println("This");
		
		Shape s3 = new Shape("Circle");
		
		
	}

}
