
public class Mammal extends Animal {

	private boolean warmBlooded;
	
	/**
	 * A constructor for mammal with full parameters
	 * @param age
	 * @param size
	 * @param weight
	 * @param name
	 * @param warmblood
	 */
	public Mammal(int age, double weight, String name, boolean warmblood) {
		super(age, weight, name);
		this.warmBlooded = warmblood;
	}



	public boolean isWarmBlooded() {
		return warmBlooded;
	}



	public void setWarmBlooded(boolean warmBlooded) {
		this.warmBlooded = warmBlooded;
	}
	
	
		
}
