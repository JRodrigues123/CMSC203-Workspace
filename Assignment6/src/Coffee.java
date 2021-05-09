
public class Coffee extends Beverage{

	/*
	 * These will be the prices for the extra shots and 
	 * syrup for the coffee
	 */
	private final double COFFEESHOT_PRICE = 0.50;
	private final double SYRUP_PRICE = 0.50;
	
	/*
	 * This checks whether or not the customer wants 
	 * an extra shot of coffee or extra syrup
	 */
	private boolean coffeeShot;
	private boolean syrup;
	
	
	/**
	 * This is a parameterized constructor
	 * @param name
	 * @param size
	 * @param extraShot
	 * @param extraSyrup
	 */
	public Coffee(String name, SIZE size, boolean extraShot, boolean extraSyrup) {
		
		super(name, TYPE.COFFEE, size);
		
		this.coffeeShot = extraShot;
		this.syrup = extraSyrup;

	}
	
	/*
	 * Inherited from the beverage class
	 */
	@Override
	public double calcPrice() {
		
		/*
		 * This will hold the price of the coffee
		 */
		double coffeePrice = super.getBASE_PRICE() + super.getSIZE_PRICE();
		
		/*
		 * These if statements will check 
		 * whether or not the customer's coffee 
		 * has an extra shot of coffee of syrup
		 */
		if(this.syrup == true) {
			
			coffeePrice += SYRUP_PRICE;
		}
		if(this.coffeeShot == true) {
			
			coffeePrice += COFFEESHOT_PRICE;
		}
		
		return coffeePrice;
	}
	
	/**
	 * This equals method check the equality of the coffee
	 * object
	 * @param c
	 * @return false/true
	 */
	public boolean equals(Coffee c) {
		 
		
		 /*
		  * These if statements will check 
		  * the equality of the Coffee object
		  */
		 if(this.syrup == c.syrup) {
			 
			 if(this.coffeeShot == c.coffeeShot) {
				 
				 if(super.equals(c)) {
					 
					 return true;
				 }
			 }
		 }
		 
		 
		 return false;
	 }
	
	
	
	/*
	 * The getter methods needed
	 */
	public boolean isCoffeeShot() {
		return this.coffeeShot;
	}
	
	public boolean getExtraShot() {
		
		return this.coffeeShot;
	}
			

	public boolean isSyrup() {
		return this.coffeeShot;
	}
	
	public boolean getExtraSyrup() {
		
		return this.syrup;
	}
	
	public double getBasePrice() {
		
		return super.getBASE_PRICE();
	}
	
	/**
	 * This is the toString method
	 */
	public String toString() {
		
		return "Name: " + super.getBevName() + ", Size: " + super.getSize() + ", Extra Shot: "+ this.coffeeShot 
		
				+ ", Extra Syrup: " + this.syrup + ", Price: " + this.calcPrice();
	}
	
	

}
