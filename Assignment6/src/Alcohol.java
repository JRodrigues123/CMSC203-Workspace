
public class Alcohol extends Beverage{
	
	/*
	 * This is the additional cost for drinks on the 
	 * weekend
	 */
	private final double WEEKEND = 0.6;
	
	/*
	 * This is a boolean that shows whether ot not 
	 * the alcohol is available on weekends
	 */
	private boolean onWeekends;
	
	
	/**
	 * 
	 * @param name
	 * @param size
	 * @param onWeekends
	 */
	public Alcohol(String name, SIZE size, boolean onWeekends) {
		
		//Superclass from the beverage class
		super(name, TYPE.ALCOHOL, size);
		this.onWeekends = onWeekends;
		
		
	}
	
	/**
	 * This is a method that shows the equality of the alcohol class
	 * @param a
	 * @return
	 */
	public boolean equals(Alcohol a) {
		
		if(this.onWeekends == a.onWeekends) {
			
			if(super.equals(a)) {
				
				return true;
			}
		}
		
		return false;
	}
	
	/*
	 * To get the price of the alcohol
	 */
	@Override
	public double calcPrice() {
		
		/*
		 * This will hold the price of the alcohol beverage
		 */
		double alcoholPrice = super.getSIZE_PRICE() + super.getBASE_PRICE();
		
		/*
		 * This will tell if the drink is 
		 * offered on the weekend
		 */
		if(onWeekends == true) {
			
			alcoholPrice += WEEKEND;
		}
		
		return alcoholPrice;
	}
	
	/*
	 * Getters
	 */
	public boolean isOnWeekends() {
		return onWeekends;
	}
	
	public double getBasePrice() {
		
		return super.getBASE_PRICE();
	}
	
	/**
	 * This is the to String method
	 */
	@Override
	public String toString() {
		return "Name: " + getBevName() + ", Size: " + this.getSize()
				+ ", is it offered on weekends?: " + this.onWeekends
				+ ", Price: " + this.calcPrice();
				
	}
	
	
	
	
	
}
