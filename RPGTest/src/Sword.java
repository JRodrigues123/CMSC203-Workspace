/*
 * This is your first weapon class
 */
public class Sword {
	
	private int damage;
	private int rank;
	
	private String name;
	
	public Sword(int rank, int damage) {
		
		this.damage = damage;
		this.rank = rank;
		
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}	
