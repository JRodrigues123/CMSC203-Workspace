
public class Property extends java.lang.Object{
	
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
	}
	
	

}
