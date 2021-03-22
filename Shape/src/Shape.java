
public class Shape {

	private String name, color;
	
	private int numOfSides = 0;
	
	
	
	
	public Shape() {
		
		name = "noName";
		color = "NoColor";
		numOfSides = 1;
	}
	
	//Copy
	public Shape(Shape shape) {
		
		this.name = shape.name;
		this.color = shape.color;
		this.numOfSides = shape.numOfSides;
	}
	
	
	 /**
	  * Second Constructor
	  * @param name
	  * @param color
	  * @param numOfSides
	  */
	public Shape(String name, String color, int numOfSides) {
		
		this.name = name;
		
		this.color = color;
		
		this.numOfSides = numOfSides;
	}
	
	/**
	 * Constructor 3
	 * @param name
	 */
	public Shape(String name) {
		
		this.name = name;
		this.color = "Blue";
		this.numOfSides = 0;
		
	}


	public String getName() {
		return name;
	}


	public String getColor() {
		return color;
	}


	public int getNumOfSides() {
		return numOfSides;
	}
	
	
	
	
}
