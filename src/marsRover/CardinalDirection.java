package marsRover;

public class CardinalDirection {
	
	public static final int NORTH = 0;
	public static final int EAST = 1;
	public static final int SOUTH = 2;
	public static final int WEST = 3;
	
	
	private int direction;
	
	public CardinalDirection (int direction) {
		this.direction = direction;
	}
	
	public int getCurrentDirection() {
		return direction;
	}
	
	public CardinalDirection turnLeft() {
		CardinalDirection newDirection = null;
		switch (direction) {
		case NORTH:
			newDirection = new CardinalDirection(WEST);
			break;
		case EAST:
			newDirection = new CardinalDirection(NORTH);
			break;
		case SOUTH:
			newDirection = new CardinalDirection(EAST);
			break;
		case WEST:
			newDirection = new CardinalDirection(SOUTH);
			break;
		}
		return newDirection;
	}
		
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof CardinalDirection)) {
			return false;
		}

		if (((CardinalDirection) obj).getCurrentDirection() == direction) {
			return true;
		} else {
			return false;
		}
	}

	public CardinalDirection turnRight() {
		CardinalDirection newDirection = null;
		switch (direction) {
		case NORTH:
			newDirection = new CardinalDirection(EAST);
			break;
		case EAST:
			newDirection = new CardinalDirection(SOUTH);
			break;
		case SOUTH:
			newDirection = new CardinalDirection(WEST);
			break;
		case WEST:
			newDirection = new CardinalDirection(NORTH);
			break;
		}
		return newDirection;
	}

}
