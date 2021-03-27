
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
	
	/**
	 * This will check whether or not the cooridinates will overlap
	 * with one another
	 * @param p
	 * @return
	 */
	public boolean overlaps(Plot p) {
		
		/*
		 * These are the boolean variables that will 
		 * determine if they pass the test in plot test
		 * using the coordinates from plot
		 */
		
		//These are for the first overlap test
		boolean overlaps1XY1;
		boolean overlaps1XY2;
		
		//Second overlap test variables
		boolean overlaps2XY1;
		boolean overlaps2XY2;
		
		//Third overlap test variables
		boolean overlaps3XY1;
		boolean overlaps3XY2;
		
		//Fourth overlap tests variables
		boolean overlaps4XY1;
		boolean overlaps4XY2;
		
		/*
		 * This'll check if the first coordinates overlap with one another, then the second 
		 * coordinates
		 */
		overlaps1XY1 = (p.x >= x && p.x < (x+width)) && (p.y >= y && p.y < (y+depth));
		
		overlaps1XY2 = (x >= p.x && x < (p.x + width)) && (y >= p.y && y < (p.depth + p.y));
		
		/*
		 * This'll check the second test, first coordinates and second
		 */
		overlaps2XY1 = (p.width + p.x) > x && (p.x + p.width) < (x + width) && p.y >= y && p.y <= (y+depth);
		
		overlaps2XY2 = (x + width) > p.x && (x + width) < (p.x + p.width) && y >= p.y && y <= (p.depth + p.y);
		
		/*
		 * This is the third test
		 */
		overlaps3XY1 = p.x >= x && p.x < (width + x) && (p.depth + p.y) > y && (p.depth + p.y) <= (y + depth);
		
		overlaps3XY2 = x >= p.x && x < (p.width + p.x) && (depth + y) > p.y && (y + depth) <= (p.depth + p.y);
		
		/*
		 * Final test
		 */
		overlaps4XY1 = (p.width + p.x) > x && (p.width + p.x) <= (width + x) && (p.depth + p.y) > y && (p.depth + p.y) <= (depth + y);
		
		overlaps4XY2 = (width + x) > p.x && (width + x) <= (p.width + p.x) && (depth + y) > p.y && (y + depth) <= (p.y + p.depth);
		
		return overlaps1XY1 || overlaps1XY2 || overlaps2XY1 || overlaps2XY2|| overlaps2XY1
							|| overlaps3XY1 || overlaps3XY2 || overlaps4XY1 || overlaps4XY2;
	}
	
	/**
	 * For this method, we will need to find out if the 
	 * given coordinates are encompassing on each other
	 * @param p
	 * @return
	 */
	public boolean encompasses(Plot p) {
		
		/*
		 * These variables determine whether or not the 
		 * coordinate encompasses each other
		 */
		
		/*
		 * New x and y variables used to check if it is
		 * encompassing
		 */
		boolean encX;
		boolean encY;
		
		/*
		 * These variables check if the 
		 * width and depth are in check
		 */
		boolean encDepth;
		boolean encWidth;
		
		/*
		 * First are the x and y coordinates
		 */
		encX = p.x >= x;
		encY = p.y >= y;
		
		/*
		 * This is now for width and length
		 */
		encDepth = (p.depth + p.y) <= (depth + y);
		encWidth = (p.width + p.x) <= (width + x);
		
		//Returns all these booleans
		return encX && encY && encDepth && encWidth;
		
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
