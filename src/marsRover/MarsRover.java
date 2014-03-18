package marsRover;

public class MarsRover {

	private static final String NORTH = "North";
	private static final String SOUTH = "South";
	private static final String EAST = "East";
	private static final String WEST = "West";

	private Grid grid;
	private String CompassPoint;
	private Coordinate coordinates;

	public void setCoordinates(Coordinate coordinate) {
		coordinates = coordinate;
	}

	public void setGrid(Grid grid) {
		this.grid = grid;
	}

	public Coordinate getCoordinates() {
		return coordinates;
	}

	public void setCompassPoint(String CompassPoint) {
		this.CompassPoint = CompassPoint;
	}

	public String getCompassPoint() {
		return CompassPoint;
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
				turnLeft();
				break;
			case 'R':
				turnRight();
				break;
			default:
				break;
			}
		}
	}

	private void turnLeft() {
		switch (getCompassPoint()) {
		case NORTH:
			setCompassPoint(WEST);
			break;
		case EAST:
			setCompassPoint(NORTH);
			break;
		case SOUTH:
			setCompassPoint(EAST);
			break;
		case WEST:
			setCompassPoint(SOUTH);
			break;
		default:
			break;
		}
	}

	private void turnRight() {
		switch (getCompassPoint()) {
		case NORTH:
			setCompassPoint(EAST);
			break;
		case EAST:
			setCompassPoint(SOUTH);
			break;
		case SOUTH:
			setCompassPoint(WEST);
			break;
		case WEST:
			setCompassPoint(NORTH);
			break;
		default:
			break;
		}
	}

	private void moveBackward() throws Exception {
		switch (getCompassPoint()) {
		case NORTH:
			setCoordinates(grid.moveSouth(getCoordinates()));
			break;
		case EAST:
			setCoordinates(grid.moveWest(getCoordinates()));
			break;
		case SOUTH:
			setCoordinates(grid.moveNorth(getCoordinates()));
			break;
		case WEST:
			setCoordinates(grid.moveEast(getCoordinates()));
			break;
		}
	}

	private void moveForward() throws Exception {
		switch (getCompassPoint()) {
		case NORTH:
			setCoordinates(grid.moveNorth(getCoordinates()));
			break;
		case EAST:
			setCoordinates(grid.moveEast(getCoordinates()));
			break;
		case SOUTH:
			setCoordinates(grid.moveSouth(getCoordinates()));
			break;
		case WEST:
			setCoordinates(grid.moveWest(getCoordinates()));
			break;
		}
	}

}
