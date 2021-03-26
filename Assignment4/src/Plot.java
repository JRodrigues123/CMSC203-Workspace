
public class Plot {
	
	/**
	 * These are used to hold the parameters for 
	 * x, y, width, and depth, 
	 */
	private int x = 0;
	private int y = 0;
	private int width = 0;
	private int depth = 0;
	
	/**
	 * A constructor with no args
	 */
	public Plot() {
		
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
		
	}
	
	/**
	 * This a constructor with only the 
	 * Plot in it's constructor
	 * @param p
	 */
	public Plot(Plot p) {
		
		this.x = p.x;
		this.y = p.y;
		this.width = p.width;
		this.depth = p.depth;
		
		
	}
	
	/**
	 * This a constructor with multiple parameters
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
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
		
		/*
		 * This checks whether or not the parameters
		 * overlaps with one another
		 */
		if(rightX <= x1P2 || leftX >= x1P2) {
			
			overLap = 1;
		}
		if(downY <= y1P2 || upY >= y1P2) {
			overLap = 1;
		}
		
		//It'll return false if overlap equals to 1
		if(overLap == 0) {
			
			return false;
		}
		else {
			
			return true;
		}
	}
	
	public boolean encompasses(Plot p) {
		
		/*
		 * This is to get the x parameters
		 */
		int leftX = this.getX();
		int rightX = (this.getWidth() + this.getX());
		/*
		 * This is to get the second parameter from the copy constructor
		 */
		int xP2 = p.getX();
		
		/*
		 * This is to get the y parameters
		 */
		int upY = this.getY();
		int downY = (this.getWidth() + this.getY());
		//Second param from the copy constructor
		int yP2 = p.getY();
		
		/*
		 * This will be used to hold the flag for the boolean
		 * to see if the parameters encompasses with one another
		 */
		int enc = 0;
		
		/*
		 * This is used to check whether the parameters
		 * encompasses
		 */
		if(leftX + this.getWidth() > xP2) {
			
			enc = 1;
		}
		if(yP2 < upY + this.getDepth()) {
			
			enc = 1;
		}
		if(leftX >= xP2 || rightX >= xP2) {
			
			enc = 1;
		}
		if(upY >= yP2 || downY >= yP2) {
			
			enc = 1;
		}
		
		/*
		 * This will return a boolean
		 * if enc = 1, it'll be true
		 */
		
		if(enc == 0) {
			
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
	
	//This is the toString method for the plot class
	@Override
	public String toString() {
		return "Upper left: (" + x + "," + y + "); Width: " + width + " Depth: " + depth;
	}
	
	

}
