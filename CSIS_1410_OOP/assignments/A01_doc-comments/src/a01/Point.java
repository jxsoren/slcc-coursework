package a01;

// = = = = = = =   D O   N O T   M O D I F Y   = = = = = = =

/**
 * Two-dimensional Point in the Cartesian Coordinate System.
 *  
 * @author CSIS 1410 Starter Code
 *
 */
public class Point {
	private int x;
	private int y;
	public static Point ORIGIN = new Point(0,0);
	
	/**
	 * Creates and initializes a two-dimensional Point (x,y).
	 * 
	 * @param x x-coordinate
	 * @param y y-coordinate
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Returns the x-coordinate of this point.
	 * 
	 * @return value of the x-coordinate
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Returns the y-coordinate of this point.
	 * 
	 * @return value of y-coordinate
	 */
	public int getY() {
		return y;
	}

	/**
	 * Calculates the distance of this point to a 
	 * second point called <code>other</code>.
	 * 
	 * @param other the other point to compare with
	 * @return distance between this point and the other point.
	 */
	public double distance(Point other) {
		return Math.hypot(this.x - other.x, this.y - other.y);
	}
	
	/**
	 * Calculates the distance of this point to the origin
	 * which is the point (0,0).
	 * 
	 * @return distance between this point and the origin.
	 */
	public double distance() {
		return distance(new Point(0,0));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	
}
