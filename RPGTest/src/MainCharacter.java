
public class MainCharacter {
	
	//String variables
	private String name;
	private String gender;
	private String classType;
	
	//int variables
	private int level;
	private int HP;
	private int exp;
	private int expThres;
	private int i = 0;
	
	/**
	 * An empty constructor
	 */
	public MainCharacter() {
		
		this.level = 1;
		this.HP = 1250;
		this.exp = 0;
		this.expThres = 100;
		
	}
	
	/*
	 * This will be for the experience points
	 */
	public String levelUp(int expShit) {
		
		this.exp = expShit;
		
		
		if(this.exp > this.expThres) {
			
			expThres = 10 * (this.i + 1);
			
			this.i++;
			
			while(this.exp > this.expThres) {
				
				this.i++;
				
				expThres =  10 * this.i;
				
			}
			
			
			
		}
		else {
			
			
		}
		
		return "";
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
