/**
 * 
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
		
		/*
		 * This array is to store the holiday bonus from
		 * each store
		 */
		double[] bonusArray = new double[data.length];
		
		/*
		 * A nested for loop to get the rows
		 * and columns from the array
		 */
		for(int r  = 0; r < data.length; r++) {
			
			/*
			 * This is a loop variable that will 
			 * hold the holiday bonus from each store
			 */
			double holidayBonus = 0.0;
			
			for(int c = 0; c < data[r].length; c++) {
				
				/*
				 * 
				 */
				if(r == TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, c)) {
					
					holidayBonus += low;
				}
				else if(r == TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, c)) {
					
					holidayBonus += high;
				}
				else if(data[r][c] <= 0) {
					
					holidayBonus += 0.0;
					
				}
				else {
					
					holidayBonus += other;
					
				}
				
			}
			
			bonusArray[r] = holidayBonus;
			
		}
		
		//
		return bonusArray;
		
		
		
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
		
		//
		return totalBonus;
	}
	
	
	
	
	
}
