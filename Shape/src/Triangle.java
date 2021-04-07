
public class Triangle extends Shape{

	private double base;
	private double height;
	private final int SIDES = 3;
	
	/*
	 * No param constructor
	 */
	public Triangle() {
		super();
		this.base = 0;
		this.height = 0;
		
	}
	
	
	public Triangle(String n, String c, double base, double height) {
		super(n, c);
		this.base = base;
		this.height = height;
		
	}
	
	




	@Override
	public double findArea() {
		
		double area;
		
		area = (this.base * this.height) / 2;
		
		return area;
	}






	@Override
	public String toString() {
		return "base = " + this.base + ", height = " + this.height + ", sides = " + SIDES + ", Name " + getName()
				+ ", Color = " + getColor();
	}
	
	

}
