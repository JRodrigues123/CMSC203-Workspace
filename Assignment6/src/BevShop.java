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
	 * This 
	 */
	@Override
	public void processCoffeeOrder(String bevName, SIZE size, boolean coffeeShot, boolean syrup) {
		
		
	}

	@Override
	public void processAlcoholOrder(String bevName, SIZE size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSmoothieOrder(String bevName, SIZE size, int numOfFruits, boolean addProtien) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int findOrder(int orderNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double totalOrderPrice(int orderNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double totalMonthlySale() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void sortOrders() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Order getOrderAtIndex(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
}
