
public class Property {
	
	/**
	 * @param city, holds the city name
	 * @param owner, holds the owner's name
	 * @param propertyName, holds the property name
	 * All in String variable
	 */
	private String city;
	private String owner;
	private String propertyName;
	
	/**
	 * This'll hold the rent amount
	 */
	private double rentAmount;
	
	/**
	 * This creates a plot object from plot.java
	 */
	private Plot plot;
	
	/**
	 * This will be a no argument constructor
	 */
	public Property() {
		
		this.plot = new Plot();
		propertyName = " ";
		city = " ";
		owner = " ";
		rentAmount = 0.0;
		
	}
	
	/**
	 * This is a copy constructor
	 * @param p creates a copy
	 */
	public Property(Property p) {
		//Use the get methods if it aint working
		this.city = p.city;
		this.owner = p.owner;
		this.propertyName = p.propertyName;
		this.rentAmount = p.rentAmount;
		this.plot = new Plot(p.plot);
	}
	
	/**
	 * This is a parameterized constructor that has no plot
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 */
	public Property(String propertyName, String city, double rentAmount, String owner) {
		
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot();
	}
	
	
	/**
	 * This is a more parameterized constructor that includes
	 * the object plot itself
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
		
		this.city = city;
		this.owner = owner;
		this.propertyName = propertyName;
		this.rentAmount = rentAmount;
	    this.plot = new Plot(x, y, width, depth);
		
	}

	/*
	 * These are the getters and setters for 
	 * all the private variables
	 */
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPropertyName() {
		return this.propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public double getRentAmount() {
		return this.rentAmount;
	}

	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}

	public Plot getPlot() {
		return this.plot;
	}

	public void setPlot(Plot plot) {
		this.plot = plot;
	}
	
	
	//Tostring method for property
	public String toString() {
		
		//String variable that will be returned
		String appends = "";
		
		appends += "\nProperty Name: " + this.getPropertyName() +
				  "\nLocated in " + this.getCity() + 
				  "\n" + "Belonging to: " + this.getOwner() +
				  "\n" + "Rent Amount: " + this.getRentAmount();
		
		return appends;
	}
	
	
	
	

}
