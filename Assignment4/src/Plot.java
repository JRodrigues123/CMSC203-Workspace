
public class Plot {
	
	private int x = 0;
	private int y = 0;
	private int width = 0;
	private int depth = 0;
	
	public Plot() {
		
		this.x = x;
		this.y = y;
		this.width = 1;
		this.depth = 1;
		
	}
	
	public Plot(Plot p) {
		
		Plot copy = new Plot(p.x, p.y, p.width, p.depth);
		
	}
	
	public Plot(int x, int y, int width, int depth) {
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	/*
	 * These are the getters and setters for 
	 * int x, int y, int width, int depth
	 */
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	

}
