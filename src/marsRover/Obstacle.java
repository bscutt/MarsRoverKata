package marsRover;

public class Obstacle {

	private int x, y;
	private String description;

	public Obstacle(int x, int y, String description) {
		this.x = x;
		this.y = y;
		this.description = description;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Obstacle)) {
			return false;
		}

		if (((Obstacle) obj).getX() == x && ((Obstacle) obj).getY() == y
				&& ((Obstacle) obj).getDescription().equals(description)) {
			return true;
		} else {
			return false;
		}
	}

}
