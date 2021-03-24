//Data Element

public class Animal {

	private int age;
	private String size;
	private double weight;
	
	private String name;
	
	//Dog subclass
	public class Dog{
		
			private String breed;
			private String furColor;
			
			
			public String getBreed() {
				return breed;
			}
			public void setBreed(String breed) {
				this.breed = breed;
			}
			public String getFurColor() {
				return furColor;
			}
			public void setFurColor(String furColor) {
				this.furColor = furColor;
			}
			
			
		
		
	}
	
	
	public Animal(int age, String size, double weight, String name) {
		super();
		this.age = age;
		this.size = size;
		this.weight = weight;
		this.name = name;
	}
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
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
	
	
	
	
	
	
	

}