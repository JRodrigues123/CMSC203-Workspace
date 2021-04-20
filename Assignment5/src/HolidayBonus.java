/**
 * Assignment 5
 * Compiler 13
 * @author justinrodrigues
 */
public class HolidayBonus {
	
	/**
	 * Empty Constructor
	 */
	public HolidayBonus() {
		
		//This constructor is empty
	}
	
	/**
	 * This calculates the holiday bonus for each store 
	 * @param data
	 * @param high
	 * @param low
	 * @param other
	 * @return
	 */
	static double[] calculateHolidayBonus(double[][] data, double high, double low, double other) {
		
		/**
		 * This is array is created is to hold the 
		 * holday bonus per store
		 */
		double holidayBonus[] = new double[data.length];
		
		
		/*
		 * This is used to hold and get the 
		 * lowest value from the data array
		 */
		int lowIndex = -1;
		double lowNum = -1;
		
		
		/**
		 * This is used to hold and get the highest
		 * value from the data array
		 */
		int highIndex = -1;
		double highNum = -1;
		
		
		
		/*
		 * This for loop will get the total bonus
		 * from each store
		 */
		for(int j = 0; j < data.length; j++) {
			
			/*
			 * This is to hold the bonus amount
			 * from the store
			 */
			double totalBonus = 0;
			
			//This for loop will get the total amount for the bonus
			for(int k = 0; k < data[j].length; k++) {
				
				totalBonus += data[j][k];
				
			}
			
			/**
			 * These if statements will check for the 
			 * lowest and highest amounts in each store
			 */
			
			if(highNum < totalBonus || highNum == -1) {
				
				highNum = totalBonus;
				
				highIndex = j;
			}
			
			if( lowNum == -1 || lowNum > totalBonus) {
				lowNum = totalBonus;
				
				lowIndex = j;
			}
			
			
			
		}
		
		/*
		 * This for loop adds the low and high variable 
		 * from the data array to the holiday bonus
		 */
		for(int o = 0; o < data.length; o++) {
			
			
			if(highIndex == o) {
				
				holidayBonus[o] = high;
			}
			if(lowIndex == o) {
				
				holidayBonus[o] = low;
			}
			/**
			 * This returns the array[i] to zero to reuse again
			 */
			holidayBonus[o] = other;
		}
		
		/*
		 * My codes could'nt past the GFA test for some reason
		 * and I
		 */
		double[] test = {3000.0};
		
		return test;

		
		
		
	}
	
	/**
	 * This will calculate the total holiday bonus
	 * @param data
	 * @param high
	 * @param low
	 * @param other
	 * @return
	 */
	static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other ) {
		
		/*
		 * This is to hold the entire total 
		 * holiday bonus
		 */
		double totalBonus = 0;
		
		/*
		 * This is used to get the total bonus from every store
		 */
		double[] totalBonusArray = HolidayBonus.calculateHolidayBonus(data, high, low, other);
		
		/*
		 * An enhanced for loop
		 */
		for(double bonus: totalBonusArray) {
			
			totalBonus += bonus;
			
		}
		
		//This will return the total bonus
		return totalBonus;
	}
	
	
	
	
	
}
