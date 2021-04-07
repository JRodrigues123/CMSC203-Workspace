/*
 * Abstract weapon class
 */
public abstract class Weapons {

	private String name;
	private String material;
	
	public Weapons(String n, String m) {
		
		this.name = n;
		this.name = m;
		
	}
	
	/*
	 * Abstract Method
	 */
	public abstract int damage();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	
}
