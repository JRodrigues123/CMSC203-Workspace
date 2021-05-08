
public abstract class Beverage {
	
	
	/*
	 * This is the string variable that 
	 * will hold the beverage name
	 */
	private String name;
	
	/*
	 *These double variables will hold the prices 
	 *for the base and sizes
	 */
	private final double BASE_PRICE = 2.0;
	private final double SIZE_PRICE = 1.0;
	
	/*
	 * These are the Enums for the day, size, and type
	 */
	private TYPE type;
	private DAY day;
	private SIZE size;
	
	/**
	 * 
	 * @param name
	 * @param type
	 * @param size
	 */
	public Beverage(String name, TYPE type, SIZE size) {
		
		this.name = name;
		this.type = type;
		this.size = size;
		
	}
	
	/*
	 * This is an abstract method that will be inherited into 
	 * other classes
	 */
	public abstract double calcPrice();
	
	/**
	 * This method checks the equality of the type, name
	 * and size of the beverage 
	 * @param bev
	 * @return false || true
	 */
	public boolean equals(Beverage bev) {
		
		if(this.name.equals(bev.name)) {
			
			if(this.size.equals(bev.size)) {
				
				if(this.type.equals(bev.type)) {
					
					return true;
				}
				
			}
		}
		
		return false;
		
	}
	
	/*
	 * These are the getters and setters
	 */
	public String getName() {
		return this.name;
	}

	public double getBASE_PRICE() {
		return BASE_PRICE;
	}
	
	/*
	 * The size price is a little special 
	 * because depending on the size of the 
	 * beverage, the customer pays more money
	 */
	public double getSIZE_PRICE() {
		
		//This holds the price of the sizes
		double sizePrice = 0.0;
		
		if(this.size.equals(size.MEDIUM)) {
			
			return this.SIZE_PRICE;
		}
		if(this.size.equals(size.LARGE)) {
			
			return this.SIZE_PRICE * 2.0;
		}
		
		return sizePrice;
	}

	public TYPE getType() {
		return this.type;
	}

	public DAY getDay() {
		return this.day;
	}

	public SIZE getSize() {
		return this.size;
	}
	
	/*
	 * The toString method
	 */
	public String toString() {
		return "Name: " + this.name + ", Size: " + this.size;
	}
	
	
	
	
	
	
	
}
