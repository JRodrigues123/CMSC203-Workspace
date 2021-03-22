
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
	
	public boolean overlaps(Plot p) {
		
		/*
		 * This is to get the x parameters for x, left and right side
		 */
		int leftX = this.getX();
		int rightX = (this.getWidth() + this.getX());
		//This is to get the second parameter from the copy constructor
		int x1P2 = p.getX();
		
		/**
		 * This is to get the y parameters for y , top and bottom
		 */
		int upY = this.getY();
		int downY = (this.getDepth() + this.getY());
		//This'll get the second parameter
		int y1P2 = p.getY();
		
		//This will be used to determine the boolean to return
		int overLap = 0;
		
		if(rightX <= x1P2 || leftX >= x1P2) {
			
			overLap = 1;
		}
		if(downY <= y1P2 || upY >= y1P2) {
			overLap = 1;
		}
		
		if(overLap == 0) {
			
			return false;
		}
		else {
			
			return true;
		}
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

	@Override
	public String toString() {
		return "Upper left: (" + x + "," + y + "); Width: " + width + " Depth: " + depth;
	}
	
	

}
