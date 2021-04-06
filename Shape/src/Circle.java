import java.math.*;
public class Circle extends Shape{
	
	double diameter;
	
	public Circle(String n, String c,double diameter) {
		super(n, c);
		this.diameter = diameter;
		
	}
	
	
	@Override
	public double findArea() {
		
		double area;
		double rad = this.diameter / 2;
		
		area = Math.PI * (Math.pow(rad, 2));
		
		
		
		
		return area;
	}


	@Override
	public String toString() {
		return "Circle [diameter=" + this.diameter + ", getName()=" + this.getName() + ", getColor()=" + this.getColor() + "]";
	}


	
	
	
}
