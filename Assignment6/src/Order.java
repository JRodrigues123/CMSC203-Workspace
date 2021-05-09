import java.util.ArrayList;
import java.util.Random;
public class Order implements OrderInterface, Comparable<Order>{

	/*
	 * This enum holds the days of the week
	 */
	private DAY day;
	
	/*
	 * This makes a Customer object
	 */
	private Customer customer;
	
	/*
	 * This array list will hold the beverages
	 */
	private ArrayList<Beverage> bevList;
	
	/*
	 * This is used to hold the order number
	 */
	private int numOfOrder;
	
	/*
	 * This will hold the order time
	 */
	private int time;
	
	
	/**
	 * This is a constructor for order
	 * that creates a new bevList
	 * @param time
	 * @param day
	 * @param c
	 */
	public Order(int time, DAY day, Customer c) {
		
		this.time = time;
		this.day = day;
		this.customer = c;
		this.numOfOrder = generateOrderNum();
		
		bevList = new ArrayList<>();
		
	}
	
	/**
	 * This is used to add alcohol to the beverage list
	 */
	public void addNewBeverage(String bevName, SIZE size) {
		
		Alcohol a = new Alcohol(bevName, size, this.isWeekend());
		
		bevList.add(a);
		
	}
	
	/**
	 * This is used to add coffee to the beverage list
	 */
	public void addNewBeverage(String bevName, SIZE size, boolean coffeeShot, boolean syrup) {
		
		Coffee c = new Coffee(bevName, size, coffeeShot, syrup);
		
		bevList.add(c);
		
	}
	
	/**
	 * This will add a smoothie to the bev order
	 */
	public void addNewBeverage(String bevName, SIZE size, int fruits, boolean protein) {
		
		Smoothie s = new Smoothie(bevName, size, fruits, protein);
		
		bevList.add(s);
		
	}
	
	/**
	 * This generates a random order number
	 * @return randNum
	 */
	public int generateOrderNum() {
		
		
		/*
		 * This will be used to get the random number
		 */
		Random genNumber = new Random();
		
		//This will hold the random number
		int randNum;
		
		//This'll give a random number from 10000 - 90000
		randNum = genNumber.nextInt(90000 - 10000) + 10000;
		
		/*
		 * This returns the random number
		 */
		return randNum;
	}
	
	/**
	 * This method here is used to compare
	 * to orders
	 */
	public int compareTo(Order o) {
		
		if(this.numOfOrder > o.getOrderNo()) {
			
			return 1;
		}
		else if(numOfOrder == o.getOrderNo()) {
			
			return 0;
		}
		else {
			
			return -1;
		}
		
	}
	
	/**
	 * This method will whether or not the alcohol was served over the weekend
	 */
	public boolean isWeekend() {
		
		if(this.day == DAY.SUNDAY || this.day == DAY.SATURDAY) {
			
			return true;
		}
		
		return false;
	}
	
	/**
	 * This is used to get the total price
	 * from the orders of the beverages
	 */
	public double calcOrderTotal() {
		
		/*
		 * This holds the price for the orders
		 */
		double totalPrice = 0.0;
		
		/*
		 * An enhanced for loop is used to go through 
		 * the array
		 */
		for(Beverage b : bevList) {
			
			totalPrice += b.calcPrice();
			
		}
		
		return totalPrice;
	}
	
	/**
	 * This is to get the amount of 
	 * beverages in bevlist
	 * @param type
	 * @return
	 */
	@Override
	public int findNumOfBeveType(TYPE type) {
		
		//This is used to hold the amount of beverages
		int totalBevs = 0;
		
		/*
		 * This enhanced loop goes through the bev list and gets
		 * each beverage
		 */
		for(Beverage b : bevList) {
			
			if(b.getType() == type) {
				
				totalBevs++;
			}
			
		}
		
		//Returns the amount of beverages
		return totalBevs;
	}
	
	
	//All the getters
	public DAY getOrderDay() {
		return this.day;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public ArrayList<Beverage> getBevList() {
		return this.bevList;
	}

	public int getOrderNo() {
		return this.numOfOrder;
	}

	public int getOrderTime() {
		return this.time;
	}
	
	public int getTotalItems() {
		
		return bevList.size();
	}
	
	public Beverage getBeverage(int itemNum) {
		
		/*
		 * This gets the beverage item number
		 */
		Beverage b = getBeverage().get(itemNum);
		
		if(bevList.get(itemNum) == null) {
			
			return null;
		}
		return b;
		
		
	}
	
	public ArrayList<Beverage> getBeverage() {
		
		return bevList;
	}
	
	
	/**
	 * This is the to String to method
	 */
	public String toString() {
		
		String str = "Order Number: " + this.numOfOrder + ", Order Day: " + this.day.toString()
					+ ", Order Time" + this.time + this.customer.toString();
		
		for(Beverage b : bevList) {
			
			str += "\n" + b.toString();
			
		}
		
		str += "\nOrder Total: " + calcOrderTotal();
		
		return str;
	}

	//Setters
	public void setDay(DAY day) {
		this.day = day;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setBevList(ArrayList<Beverage> bevList) {
		this.bevList = bevList;
	}

	public void setNumOfOrder(int numOfOrder) {
		this.numOfOrder = numOfOrder;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	
	
	

	
	
	
	
}
