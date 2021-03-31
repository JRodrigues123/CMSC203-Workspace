//Data Element

public abstract class Animal {

	private int age;
	private double weight;
	
	private String name;
	
	public Animal() {
		this.name = "";
		this.weight = 0.0;
		this.age = 0;
	}
	
	
	public Animal(int age, double weight, String name) {
		super();
		this.age = age;
		this.weight = weight;
		this.name = name;
	}
	
	/**
	 * abstract method
	 */
	public void eat() {
		
		System.out.println("Animals eat.");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Animal [age=" + age + " weight=" + weight + ", name=" + name + "]";
	}
	
	
	
	
	
	
	

}