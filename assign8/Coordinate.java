package assign8;

public class Coordinate {
	public int centery, centerx;
	public Coordinate newpoint;
	public TicTacToe temp;
	public Coordinate(int x, int y) {
		this.centerx = x;
		this.centery = y;
	}
	public int getY() {
		return centery;
	}

	public int getX() {
		return centerx;
	}

}
