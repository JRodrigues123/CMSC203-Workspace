import java.util.Scanner;
public class ShapeDriver {

	public static void main(String[] args) {
		
		//First Triangle
		Shape tri1 = new Triangle("Tri1","Black",4, 7);
		
		//Second Triangle
		Shape tri2 = new Triangle("Tri2", "Red", 8, 10);
		
		//First circle
		Shape circ1 = new Circle("C1","Blue",5);
		
		//Second circle
		Shape circ2 = new Circle("C2","Purple",7);
		
		
		//Create an array of type shape
		//Circle, triangle, triangle, circle
		Shape[] shapes = new Shape[4];
		
		//Adding these shapes to the shapes array
		shapes[0] = circ1;
		shapes[1] = new Triangle("tri1", "Gray", 5, 7);
		shapes[2] = tri2;
		shapes[3] = new Circle("C2", "Red", 9);
		
		//Now a for loop to get their information
		for(int i = 0; i < shapes.length; i++) {
			
			System.out.println(String.format("%.2f", shapes[i].findArea()));
			
		}
		
	}

}
