package lab8;

public class Coordinate {
	public int centery, centerx;
	public Coordinate newpoint;
	public Rectangle2 temp;
	public Coordinate(int x, int y) {
		this.centerx = x;
		this.centery = y;
	}

	public double distance(Coordinate point) {
		int xpointclicked, ypointclicked, xlength, ylength;
		xpointclicked = point.getX();
		ypointclicked = point.getY();
		xlength = centerx - xpointclicked;
		ylength = centery - ypointclicked;
		return (Math.sqrt(xlength*xlength + ylength*ylength));
	}

	public Coordinate newCoordinate(Coordinate point) {
		int xpointclicked, ypointclicked, xlength, ylength;
		xpointclicked = point.getX();
		ypointclicked = point.getY();
		xlength = centerx - xpointclicked;
		ylength = centery - ypointclicked;
		newpoint = new Coordinate(xlength, ylength);
		return newpoint;
	}
	
	public double distancetop(Coordinate point) {
		int ypointclicked;
		ypointclicked = point.getY();
		return centery - ypointclicked;
	}
	
	public double distanceside(Coordinate point) {
		int xpointclicked;
		xpointclicked = point.getX();
		return centerx - xpointclicked;
	}
	
	public int getY() {
		return centery;
	}

	public int getX() {
		return centerx;
	}

}
