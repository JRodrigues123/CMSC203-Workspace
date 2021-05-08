
public class Customer {

	/*
	 * This string variable is used to 
	 * hold the customer's name
	 */
	private String name;
	
	/*
	 * This is to hold the customer's age
	 */
	private int age;
	
	/**
	 * 
	 * @param name
	 * @param age
	 */
	public Customer(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	/**
	 * This is a copy constructor for Customer
	 * @param c
	 */
	public Customer(Customer c) {
		
		this.name = c.name;
		this.age = c.age;
	}
	
	/*
	 * This checks the equality of the customer class instance 
	 */
	public boolean equals(Customer c) {
		
		if(this.name.contentEquals(c.name)) {
			
			if(this.age == c.age) {
				
				
				return true;
			}
		}
		
		return false;
	}
	
	//Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	 * The to string
	 */
	public String toString() {
		
		return "Name: " + this.name + ", Age: " + this.age;
	}
	
	
	
	
	
	
	
	

	
	
	
}
