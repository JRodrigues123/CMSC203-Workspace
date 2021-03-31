
public class Dog extends Animal{

	
	private String breed = "";
	private String color = "";
	
	/**
	 * Constructor for dog
	 * @param age
	 * @param size
	 * @param weight
	 * @param name
	 * @param breed
	 * @param color
	 */
	public Dog(int age, double weight, String name, String breed, String color) {
		super(age, weight, name);
		this.setAge(age);
		this.setName(name);
		this.setWeight(weight);
		this.breed = breed;
		this.color = color;
	}
	
	public Dog() {
		super();
		this.color = "";
		this.breed = "";
		
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString() + ", Fur color " + this.color + ", Breed " + this.breed;
	}
	
	
	
	
}
