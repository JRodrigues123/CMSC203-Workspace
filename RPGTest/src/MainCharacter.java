
public class MainCharacter {
	
	//String variables
	private String name;
	private String gender;
	private String classType;
	
	//int variables
	private int level;
	
	public MainCharacter() {
		
		this.level = 1;
		this.classType = classType;
		this.gender = gender;
		this.name = name;
	}
	
	//Sets the name and gets it
	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
	}

	//Sets the gender and gets it 
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		
		this.gender = gender;
		
		
		
	}
	
	//sets the class type and gets it
	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}
	
	//gets the level and sets it
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	
	
}
