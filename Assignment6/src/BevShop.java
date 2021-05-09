import java.util.ArrayList;
public class BevShop implements BevShopInterfce{
	
	/*
	 * This here is to hold the orders in a array list
	 */
	private ArrayList<Order> orders;
	
	/*
	 * This is to keep track of the current order
	 */
	private int curOrder;
	
	/*
	 * This is to keep track of the 
	 * amount of alcohol in the orders
	 */
	private int alcoholOrder;
	
	/**
	 * This is a constructor for bev shop that 
	 * will create and hold orders
	 */
	public BevShop() {
		
		orders = new ArrayList<Order>();
	}
	
	
	/**
	 * This method here is to show whether or not the order
	 * is within a certain amount of time
	 */
	@Override
	public boolean validTime(int time) {
		
		
		if(time <= MAX_TIME && time >= MIN_TIME) {
			
			return true;
			
		}
		
		return false;
	}
	
	/**
	 * This method here is to return 
	 * true if the number of alcohol ordered is 
	 * less than three, false otherwise
	 */
	@Override
	public boolean eligibleForMore() {
		
		if(this.alcoholOrder < 3) {
			
			return true;
			
		}
		
		return false;
	}
	
	/**
	 * This method will check 
	 * whether or not the customer 
	 * is under age for drinking
	 */
	@Override
	public boolean validAge(int age) {
		
		if(age > this.MIN_AGE_FOR_ALCOHOL) {
			
			return true;
		}
		
		return false;
	}
	
	/**
	 * This starts up a new order overall
	 */
	@Override
	public void startNewOrder(int time, DAY day, String name, int age) {
		
		Customer c = new Customer(name, age);
		Order o = new Order(time, day, c);
		orders.add(o);
		this.alcoholOrder = 0;
		this.curOrder = orders.indexOf(o);
		
	}
	
	/**
	 * This is used to get a new coffee order
	 */
	@Override
	public void processCoffeeOrder(String bevName, SIZE size, boolean coffeeShot, boolean syrup) {
		
		orders.get(curOrder).addNewBeverage(bevName, size, coffeeShot, syrup);
		
	}
	
	/**
	 * This adds a new alcohol order
	 */
	@Override
	public void processAlcoholOrder(String bevName, SIZE size) {
		
		orders.get(curOrder).addNewBeverage(bevName, size);
		
		
	}
	
	/**
	 * This adds a new smoothie order
	 */
	@Override
	public void processSmoothieOrder(String bevName, SIZE size, int numOfFruits, boolean addProtien) {
		
		orders.get(curOrder).addNewBeverage(bevName, size, numOfFruits, addProtien);
		
		
	}
	
	/**
	 * This is used to find the order number
	 */
	@Override
	public int findOrder(int orderNo) {
		
		/*
		 * This is used to get into the orders list 
		 * and go through each order
		 */
		for(int b = 0; b < orders.size(); b++) {
			
			if(orders.get(b).getOrderNo() == orderNo) {
				
				return b;
				
			}
			
		}
		
		return -1;
	}
	
	/**
	 * This method is used to get the total order
	 * price
	 */
	@Override
	public double totalOrderPrice(int orderNo) {
		
		//This is used to hold the order price total
		double orderPrice = 0.0;
		
		for(Order o : orders) {
			
			if(o.getOrderNo() == orderNo) {
				
				for(Beverage b : o.getBevList()) {
					
					orderPrice += b.calcPrice();
				}
				
			}
			
		}
		
		
		return orderPrice;
	}
	
	/**
	 * This method here is to get the 
	 * total monthly sale of each beverage from the 
	 * bev list
	 */
	@Override
	public double totalMonthlySale() {
		
		/*
		 * This will hold the monthly price
		 */
		double monthlyPrice = 0.0;
		
		/*
		 * Enhanced loops that go through order and the 
		 * beverages
		 */
		for(Order o : orders) {
			
			for(Beverage b : o.getBevList()) {
				
				
				monthlyPrice += b.calcPrice();
			}
			
		}
		return monthlyPrice;
	}

	@Override
	public void sortOrders() {
		
		for(int a = 0; a < orders.size(); a++) {
			
			/*
			 * This will be used to try and get the first order
			 */
			int minOrder = a;
			
			for(int b = a + 1; b < orders.size(); b++) {
				
				if(orders.get(b).getOrderNo() < orders.get(minOrder).getOrderNo()) {
					
					minOrder = b;
				}
			}
			
			/*
			 * These will set the minimum index in order
			 */
			Order temp = orders.get(minOrder);
			
			orders.set(minOrder, orders.get(a));
			
			orders.set(a, temp);
			
		}
		
	}
	
	/*
	 * Getters
	 */
	@Override
	public Order getOrderAtIndex(int index) {
		
		return orders.get(index);
	}
	
	public int getNumOfAlcoholDrink() {
		
		return this.alcoholOrder;
	}
	
	public int totalNumOfMonthlyOrders() {
		
		return orders.size();
	}
	
	public boolean isMaxFruit(int f) {
		
		if(f > MAX_FRUIT)
			return true;
		
		return false;
		
	}
	
	public int getMaxOrderForAlcohol() {
		
		return 3;
	}
	
	public int getMinAgeForAlcohol() {
		
		return 21;
	}
	
	public Order getCurrentOrder() {
		
		return this.getCurrentOrder();
		
	}
	
	
	
	
	
	
	
	
}
