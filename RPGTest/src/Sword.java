/*
 * This is your first weapon class
 */
public class Sword extends Weapons {
	
	private int rank;
	
	private String name;
	
	public Sword(String n, String m,int rank) {
		
		super(n, m);
		this.rank = rank;
		
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

	@Override
	public int damage() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}	
