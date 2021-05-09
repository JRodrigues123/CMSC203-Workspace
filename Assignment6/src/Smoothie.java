
public class Smoothie extends Beverage{
	
	/*
	 * This boolean variable is here to check whether or not 
	 * the smoothie has protein
	 */
	private boolean protein;
	
	/*
	 * This variable will hold the number of fruits
	 * each customer will choose
	 */
	private int fruits;
	
	/*
	 * These are final constants for the price of 
	 * protein and each fruit added
	 */
	private final double PROTEIN_PRICE = 1.5;
	private final double FRUIT_PRICE = 0.5;
	
	/**
	 * A parameterized constructor
	 * @param name
	 * @param size
	 * @param fruit
	 * @param protein
	 */
	public Smoothie(String name, SIZE size, int fruits, boolean protein) {
		
		super(name, TYPE.SMOOTHIE, size);
		this.protein = protein;
		this.fruits = fruits;
		
	}
	
	/**
	 * This method here is to get the total 
	 * price of the entire smoothie
	 */
	@Override
	public double calcPrice() {
		
		//This is to hold the base price of the smoothie
		double smoothiePrice = super.getBASE_PRICE() + super.getSIZE_PRICE();
		
		/*
		 * These statements check whether or not 
		 * the customer adds multiple fruits 
		 * or extra protein
		 */
		if(this.protein == true) {
			
			smoothiePrice += PROTEIN_PRICE;
		}
		
		if(fruits >= 1) {
			
			for(int f = 0; f < this.fruits; f++) {
				
				smoothiePrice += FRUIT_PRICE;
			}
			
		}
		
		return smoothiePrice;
	}
	
	/**
	 * This method is here to show the 
	 * equality of the order
	 * @param s
	 * @return
	 */
	public boolean equals(Smoothie s) {
		
		if(this.protein == s.protein) {
			
			if(this.fruits == s.fruits) {
				
				if(super.equals(s)) {
					
					return true;
					
				}
			}
		}
		
		return false;
	}

	//Getters
	public boolean isProtein() {
		return this.protein;
	}
	
	public boolean getAddProtien() {
		
		return this.protein;
	}

	public int getNumOfFruits() {
		return this.fruits;
	}
	
	public double getBasePrice() {
		
		return super.getBASE_PRICE();
	}
	
	/**
	 * The toString method
	 */
	@Override
	public String toString() {
		return "Name: " + super.getBevName() + ", Size: " + this.getSize() 
				+ ", Protein Present: " + this.protein + "Number of Fruits: " + this.fruits
				+ ", Price: " + this.calcPrice();
	}
	
	
	
	
	
	
	
	
}
