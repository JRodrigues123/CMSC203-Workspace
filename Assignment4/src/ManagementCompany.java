import java.util.Arrays;

public class ManagementCompany {
	
	private Plot plot;
	
	private Property[] properties;
	
	private final int MAX_PROPERTY = 5;
	private final int MGMT_WIDTH = 10;
	private final int MGMT_DEPTH = 10;
	
	private int result = 0;
	
	private double mgmFeePer = 0.0;
	
	private String name;
	private String taxID;
	
	/**
	 * A constructor that has no args in it
	 * it intializes some of the variables and objects
	 */
	public ManagementCompany() {
		
		this.name = "";
		this.taxID = "";
		properties = new Property[MAX_PROPERTY];
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
	}
	
	/**
	 * This has three parameter
	 * @param name
	 * @param taxID
	 * @param mgmFee
	 */
	public ManagementCompany(String name, String taxID, double mgmFee) {
		
		this.name = name;
		this.mgmFeePer = mgmFee;
		this.taxID = taxID;
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
	}
	
	/**
	 * This is a constructor with the parameters and the plot
	 * @param name
	 * @param taxID
	 * @param mgmFee
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
		
		properties = new Property[MAX_PROPERTY];
		this.taxID = taxID;
		this.name = name;
		this.mgmFeePer = mgmFee;
		this.plot = new Plot(x, y, width, depth);
		
	}
	
	/**
	 * A copied constructor
	 * @param otherCompany
	 */
	public ManagementCompany(ManagementCompany otherCompany) {
		
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.mgmFeePer = otherCompany.mgmFeePer;
		this.plot = otherCompany.plot;
		
	}
	
	/**
	 * This is a add property method that checks if you can 
	 * make a property based on whats going on
	 * @param property
	 * @return
	 */
	public int addProperty(Property property) {
		
		/*
		 * This is to check whether or not the properties you create will 
		 * overlap with on another
		 */
		int a;
		
		for(a = 0; a < result; a++ ) {
			
			//This'll return -4 if the properties overlap with on another
			if(properties[a].getPlot().overlaps(property.getPlot())) {
				
				return -4;
			}
			
		}
		
		if(!this.plot.encompasses(property.getPlot())) {
			
			//Returns -3 if the plot isn't part of the mgmt co plot
			return -3;
		}
		else if(property == null) {
			
			//returns -2 if the property is null
			return -2;
		}
		else if(result == MAX_PROPERTY) {
			
			//Returns -1 if the array of properties is full
			return -1;
		}
		else {
			
			//This will add a property to the array
			properties[result] = property;
			
			result++;
			
			return result - 1;
		}
	}
	
	/**
	 * This is a similar method where you re given the parameters
	 * but need to add the property to it, it checks the properties
	 * aswell
	 * @param name
	 * @param city
	 * @param rent
	 * @param owner
	 * @return
	 */
	public int addProperty(String name, String city, double rent, String owner) {
		
		/*
		 * This creates a property object with regular parameters 
		 */
		Property property = new Property(name, city, rent, owner, 0, 0, 1, 1);
		
		/*
		 * This makes a properties array that holds a set amount of properties
		 */
		properties[result] = property;
		
		//Used in the for loop
		int b;
		
		//used for the for loop
		result++;
		
		for(b = 0; b < result; b++) {
			
			if(properties[b].getPlot().overlaps(property.getPlot())) {
				
				return -4;
			}
		}
		
		if(!this.plot.encompasses(property.getPlot())) {
			
			return -3;
		}
		else if(property == null) {
			
			return -2;
		}
		else if(result == MAX_PROPERTY) {
			
			return -1;
		}
		else {
			
			properties[result] = property;
			
			result++;
			
			return result - 1;
		}
		
		
		
	}
	
	/**
	 * Another method to add a property  but this time with user given parameters from the plot
	 * @param name
	 * @param city
	 * @param rent
	 * @param owner
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 * @return
	 */
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
		
		//Creating an object with now the plot's parameters
		Property property = new Property(name, city, rent, owner, x, y, width, depth);
		
		/*
		 * Creates a properties array
		 */
		properties[result] = property;
		
		for(int c = 0; c < result; c++) {
			
			if(properties[c].getPlot().overlaps(property.getPlot())) {
				
				return -4;
			}
		}
		
		if(!this.plot.encompasses(property.getPlot())) {
			
			return -3;
		}
		else if(property == null) {
			
			return -2;
		}
		else if(result == MAX_PROPERTY) {
			
			return -1;
		}
		else {
			
			properties[result] = property;
			
			result++;
			
			return result - 1;
		}
	}
	
	
	public double totalRent() {
		
		/*
		 * This'll hold the amount of 
		 * rent totaled
		 */
		double rentAmount = 0.0;
		
		/*
		 * This for loop is used to get every property and 
		 * their rent to get the ultimate total
		 */
		for(int d = 0; d < result; d++) {
			
			if(properties[d] != null) {
				
				rentAmount += properties[d].getRentAmount(); 
				
			}
		}
		return rentAmount;
		
	}
	
	/**
	 * This'll find the property with the highest rent
	 * @return
	 */
	public double maxRentProp() {
		
		//this is to hold the max rent amount
		double maxRent = 0.0;
		
		//This will call a method to find the highest rent property
		maxRent = properties[maxRentPropertyIndex()].getRentAmount();
		
		return maxRent;
	}
	
	//this'll find the highest max rent
	private int maxRentPropertyIndex() {
		
		/*
		 * The max rent for each property
		 */
		int maxPropsRent = 0;
		
		for(int i = 0; i < result; i++) {
			
			if(properties[i] != null) {
				
				if(properties[maxPropsRent].getRentAmount() < properties[i].getRentAmount()) {
					
					maxPropsRent = i;
				}
			}
		}
		
		return maxPropsRent;
	}
	
	
	private String displayPropertyAtIndex(int i) {
		
		//This will be returned
		String displayProp = "";
		
		/*
		 * this will displays a propertie's info
		 */
		if(properties[i] != null) {
			
			displayProp = ("Owner: " + properties[i].getOwner() + "City: "
							+ properties[i].getCity() + "Property Name: "
							+ properties[i].getPropertyName() + "Rent Amount: "
							+ properties[i].getRentAmount() + "Plot: " 
							+ properties[i].getPlot());
		}
		
		return displayProp;
		
		
	}
	
	
	
	/*
	 * These are all the getters and setters
	 * for the variables present and objects aswell
	 */
	public Plot getPlot() {
		return plot;
	}

	public void setPlot(Plot plot) {
		this.plot = plot;
	}

	public Property[] getProperties() {
		return properties;
	}

	public void setProperties(Property[] properties) {
		this.properties = properties;
	}

	public double getMgmFeePer() {
		return mgmFeePer;
	}

	public void setMgmFeePer(double mgmFeePer) {
		this.mgmFeePer = mgmFeePer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaxID() {
		return taxID;
	}

	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}

	public int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}

	public int getMGMT_WIDTH() {
		return MGMT_WIDTH;
	}

	public int getMGMT_DEPTH() {
		return MGMT_DEPTH;
	}

	@Override
	public String toString() {
		
		//37
		//This will be the return variable 
		String manageString = "";
		
		//
		manageString += "List of the properties for " + this.getName()
							+ ",TaxID: " + this.taxID + "\n";
		
		//This is here to add the border
		for(int e = 0; e < 37; e++) {
			
			manageString += "-";
		}
		
		/*
		 * This will output every info about the property
		 */
		for(int g = 0; g < this.properties.length; g++) {
			
			if(properties[g] != null) {
				
				manageString += "\nProperty Name: " + this.properties[g].getPropertyName() +
								"\n Located in " + this.properties[g].getCity() + 
								"\n Belonging to: " + this.properties[g].getOwner() +
								"\n RentAmount: " + this.properties[g].getRentAmount();
			}
			
		}
		
		manageString += "\n\n";
		
		//This is the end border
		for(int f = 0; f < 37; f++) {
			
			manageString += "-";
		}
		
		manageString += "total mangement Fee: " + (0.01 * this.mgmFeePer * this.totalRent());
		
		//Returns the String
		return manageString;
		
		
		
		
	}
	
	
	
}
