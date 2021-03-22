
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
	private double rentAmount = 0.0;
	
	/**
	 * This creates a plot object from plot.java
	 */
	private Plot plot;
	
	/**
	 * This will be a no argument constructor
	 */
	public Property() {
		
		this.plot = new Plot();
		propertyName = "";
		city = "";
		owner = "";
		rentAmount = 0;
		
	}
	
	/**
	 * This is a copy constructor
	 * @param p creates a copy
	 */
	public Property(Property p) {
		
		this.city = p.getCity();
		this.owner = p.getOwner();
		this.propertyName = p.getPropertyName();
		this.rentAmount = p.getRentAmount();
		this.plot = p.plot;
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
		plot = new Plot();
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
		super();
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
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public double getRentAmount() {
		return rentAmount;
	}

	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}

	public Plot getPlot() {
		return plot;
	}

	public void setPlot(Plot plot) {
		this.plot = plot;
	}
	
	/**
	 * This method returns a plot with it's arguments intact
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 * @return plot
	 */
	public Plot setPlot(int x, int y, int width, int depth) {
		
		plot = new Plot(x, y, width, depth);
		
		return plot;
	}
	
	
	
	

}
