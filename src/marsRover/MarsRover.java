package marsRover;

public class MarsRover {

	private Grid grid;
	private CardinalDirection direction;
	private Coordinate coordinates;

	public void setCoordinates(Coordinate coordinate) {
		coordinates = coordinate;
	}

	public Coordinate getCoordinates() {
		return coordinates;
	}
	
	public void setGrid(Grid grid) {
		this.grid = grid;
	}

	public void setCardinalDirection(CardinalDirection direction) {
		this.direction = direction;
	}

	public CardinalDirection getCardinalDirection() {
		return direction;
	}

	public void issueCommand(String command) throws Exception {
		char[] commands = command.toCharArray();
		for (int i = 0; i < commands.length; i++) {
			switch (commands[i]) {
			case 'F':
				moveForward();
				break;
			case 'B':
				moveBackward();
				break;
			case 'L':
				setCardinalDirection(getCardinalDirection().turnLeft());
				break;
			case 'R':
				setCardinalDirection(getCardinalDirection().turnRight());
				break;
			default:
				break;
			}
		}
	}

	private void moveBackward() throws Exception {
		switch (getCardinalDirection().getCurrentDirection()) {
		case CardinalDirection.NORTH:
			setCoordinates(grid.moveSouth(getCoordinates()));
			break;
		case CardinalDirection.EAST:
			setCoordinates(grid.moveWest(getCoordinates()));
			break;
		case CardinalDirection.SOUTH:
			setCoordinates(grid.moveNorth(getCoordinates()));
			break;
		case CardinalDirection.WEST:
			setCoordinates(grid.moveEast(getCoordinates()));
			break;
		}
	}

	private void moveForward() throws Exception {
		switch (getCardinalDirection().getCurrentDirection()) {
		case CardinalDirection.NORTH:
			setCoordinates(grid.moveNorth(getCoordinates()));
			break;
		case CardinalDirection.EAST:
			setCoordinates(grid.moveEast(getCoordinates()));
			break;
		case CardinalDirection.SOUTH:
			setCoordinates(grid.moveSouth(getCoordinates()));
			break;
		case CardinalDirection.WEST:
			setCoordinates(grid.moveWest(getCoordinates()));
			break;
		}
	}

}
