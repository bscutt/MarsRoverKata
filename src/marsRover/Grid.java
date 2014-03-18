package marsRover;

import java.util.HashMap;
import java.util.Map;

public class Grid {

	private static final int MOVEMENT_UNIT = 1;

	private int x, y;
	private Map<String, Obstacle> obstacles = new HashMap<String, Obstacle>();

	public Grid(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setObstacle(Obstacle obstacle) {
		obstacles.put(obstacle.getX() + "," + obstacle.getY(), obstacle);
	}

	public Obstacle getObstacle(int x, int y) {
		return obstacles.get(x + "," + y);
	}

	public Obstacle getObstacle(Coordinate coordinate) {
		return obstacles.get(coordinate.getXCoordinate() + ","
				+ coordinate.getYCoordinate());
	}

	private void checkForObstacles(Coordinate coordinate) throws Exception {
		Obstacle obstacle = getObstacle(coordinate);
		if (obstacle != null) {
			throw new Exception("Found Obstacle: " + obstacle.getDescription());
		}
	}

	public Coordinate moveNorth(Coordinate coordinate) throws Exception {
		Coordinate newCoordinate = null;
		if (coordinate.getYCoordinate() == y) {
			newCoordinate = new Coordinate(coordinate.getXCoordinate(), 0);
		} else {
			newCoordinate = new Coordinate(coordinate.getXCoordinate(),
					coordinate.getYCoordinate() + MOVEMENT_UNIT);
		}
		checkForObstacles(newCoordinate);
		return newCoordinate;
	}

	public Coordinate moveEast(Coordinate coordinate) throws Exception {
		Coordinate newCoordinate = null;
		if (coordinate.getXCoordinate() == x) {
			newCoordinate =  new Coordinate(0, coordinate.getYCoordinate());
		} else {
			newCoordinate =  new Coordinate(coordinate.getXCoordinate() + MOVEMENT_UNIT,
					coordinate.getYCoordinate());
		}
		checkForObstacles(newCoordinate);
		return newCoordinate;
	}

	public Coordinate moveSouth(Coordinate coordinate) throws Exception {
		Coordinate newCoordinate = null;
		if (coordinate.getYCoordinate() == 0) {
			newCoordinate =  new Coordinate(coordinate.getXCoordinate(), y);
		} else {
			newCoordinate =  new Coordinate(coordinate.getXCoordinate(),
					coordinate.getYCoordinate() - MOVEMENT_UNIT);
		}
		checkForObstacles(newCoordinate);
		return newCoordinate;
	}
	
	public Coordinate moveWest(Coordinate coordinate) throws Exception {
		Coordinate newCoordinate = null;
		if (coordinate.getXCoordinate() == 0) {
			newCoordinate =  new Coordinate(x, coordinate.getYCoordinate());
		} else {
			newCoordinate =  new Coordinate(coordinate.getXCoordinate() - MOVEMENT_UNIT,
					coordinate.getYCoordinate());
		}
		checkForObstacles(newCoordinate);
		return newCoordinate;
	}

}
