
public class Triangle extends Shape{

	private double base;
	private double height;
	private int sides = 3;
	
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
		
	}
	
	




	@Override
	public double findArea() {
		
		double area;
		
		area = (this.base * this.height) / 2;
		
		return area;
	}

}
