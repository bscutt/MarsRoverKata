package marRoverTests;

import static org.junit.Assert.*;
import marsRover.CardinalDirection;
import marsRover.Coordinate;
import marsRover.Grid;
import marsRover.MarsRover;
import marsRover.Obstacle;

import org.junit.Test;

public class MarsRoverTests {

    @Test
    public void test_create_Mars_Rover() {
    	MarsRover rover = new MarsRover();
    	assertTrue("Rover was null", rover != null);
    }
    
    @Test
    public void test_set_Mars_Rover_coordinates_x0_y0() {
    	MarsRover rover = new MarsRover();
    	rover.setCoordinates(new Coordinate(0,0));
    	assertTrue("X coordinate was wrong", rover.getCoordinates().getXCoordinate() == 0);
    	assertTrue("Y coordinate was wrong", rover.getCoordinates().getYCoordinate() == 0);
    }
    
    @Test
    public void test_set_Mars_Rover_grid_x100_y100() {
    	MarsRover rover = new MarsRover();
    	rover.setGrid(new Grid(100,100));
    }
	
    @Test
    public void test_set_Mars_Rover_coordinates_x30_y30() {
    	MarsRover rover = new MarsRover();
    	rover.setCoordinates(new Coordinate(30,30));
    	assertTrue("X coordinate was wrong", rover.getCoordinates().getXCoordinate() == 30);
    	assertTrue("Y coordinate was wrong", rover.getCoordinates().getYCoordinate() == 30);
    }
    
    @Test
    public void test_set_Mars_Rover_direction_north() {
    	MarsRover rover = new MarsRover();
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.NORTH);
    	rover.setCardinalDirection(cardinalDirection);
    	assertTrue("Compass Point was wrong", rover.getCardinalDirection().equals(cardinalDirection));
    }
    
    @Test
    public void test_set_Mars_Rover_direction_south() {
    	MarsRover rover = new MarsRover();
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.SOUTH);
    	rover.setCardinalDirection(cardinalDirection);
    	assertTrue("Compass Point was wrong", rover.getCardinalDirection().equals(cardinalDirection));
    }
    
    
    @Test
    public void test_move_Mars_Rover_forward_once() throws Exception {
    	MarsRover rover = new MarsRover();
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.NORTH);
    	rover.setCardinalDirection(cardinalDirection);
    	rover.setCoordinates(new Coordinate(0,0));
    	rover.setGrid(new Grid(100,100));
    	rover.issueCommand("F");
    	assertTrue("X coordinate was wrong", rover.getCoordinates().getXCoordinate() == 0);
    	assertTrue("Y coordinate was wrong", rover.getCoordinates().getYCoordinate() == 1);
    }
    
    @Test
    public void test_move_Mars_Rover_forward_twice() throws Exception {
    	MarsRover rover = new MarsRover();
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.NORTH);
    	rover.setCardinalDirection(cardinalDirection);
    	rover.setCoordinates(new Coordinate(0,0));
    	rover.setGrid(new Grid(100,100));
    	rover.issueCommand("FF");
    	assertTrue("X coordinate was wrong", rover.getCoordinates().getXCoordinate() == 0);
    	assertTrue("Y coordinate was wrong", rover.getCoordinates().getYCoordinate() == 2);
    }
    
    @Test
    public void test_turn_Mars_Rover_left_points_west() throws Exception {
    	MarsRover rover = new MarsRover();
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.NORTH);
    	rover.setCardinalDirection(cardinalDirection);
    	rover.setCoordinates(new Coordinate(0,0));
    	rover.setGrid(new Grid(100,100));
    	rover.issueCommand("L");
    	assertTrue("CompassPoint was wrong", rover.getCardinalDirection().equals(new CardinalDirection(CardinalDirection.WEST)));
    }
    
    @Test
    public void test_starting_west_turn_Mars_Rover_left_points_south() throws Exception {
    	MarsRover rover = new MarsRover();
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.NORTH);
    	rover.setCardinalDirection(cardinalDirection);
    	rover.setCoordinates(new Coordinate(0,0));
    	rover.setGrid(new Grid(100,100));
    	rover.issueCommand("L");
    	assertTrue("CompassPoint was wrong", rover.getCardinalDirection().equals(new CardinalDirection(CardinalDirection.SOUTH)));
    }
    
    @Test
    public void test_turn_Mars_Rover_right_points_east() throws Exception {
    	MarsRover rover = new MarsRover();
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.NORTH);
    	rover.setCardinalDirection(cardinalDirection);
    	rover.setCoordinates(new Coordinate(0,0));
    	rover.setGrid(new Grid(100,100));
    	rover.issueCommand("R");
    	assertTrue("CompassPoint was wrong", rover.getCardinalDirection().equals(new CardinalDirection(CardinalDirection.EAST)));
    }
    
    @Test
    public void test_starting_east_turn_Mars_Rover_right_points_south() throws Exception {
    	MarsRover rover = new MarsRover();
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.EAST);
    	rover.setCardinalDirection(cardinalDirection);
    	rover.setCoordinates(new Coordinate(0,0));
    	rover.setGrid(new Grid(100,100));
    	rover.issueCommand("R");
    	assertTrue("CompassPoint was wrong", rover.getCardinalDirection().equals(new CardinalDirection(CardinalDirection.SOUTH)));
    }
    
    @Test
    public void test_move_Mars_Rover_forward_twice_back_once() throws Exception {
    	MarsRover rover = new MarsRover();
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.NORTH);
    	rover.setCardinalDirection(cardinalDirection);
    	rover.setCoordinates(new Coordinate(0,0));
    	rover.setGrid(new Grid(100,100));
    	rover.issueCommand("FFB");
    	assertTrue("X coordinate was wrong", rover.getCoordinates().getXCoordinate() == 0);
    	assertTrue("Y coordinate was wrong", rover.getCoordinates().getYCoordinate() == 1);
    }
    
    @Test
    public void test_move_Mars_Rover_forward_twice_turn_right_move_forward_once() throws Exception {
    	MarsRover rover = new MarsRover();
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.NORTH);
    	rover.setCardinalDirection(cardinalDirection);
    	rover.setCoordinates(new Coordinate(0,2));
    	rover.setGrid(new Grid(100,100));
    	rover.issueCommand("FFRF");
    	assertTrue("X coordinate was wrong", rover.getCoordinates().getXCoordinate() == 1);
    	assertTrue("Y coordinate was wrong", rover.getCoordinates().getYCoordinate() == 4);
    }
    
    @Test
    public void test_move_Mars_Rover_forward_twice_turn_right_move_forward_twice() throws Exception {
    	MarsRover rover = new MarsRover();
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.NORTH);
    	rover.setCardinalDirection(cardinalDirection);
    	rover.setCoordinates(new Coordinate(0,0));
    	rover.setGrid(new Grid(100,100));
    	rover.issueCommand("FFRFF");
    	assertTrue("X coordinate was wrong", rover.getCoordinates().getXCoordinate() == 2);
    	assertTrue("Y coordinate was wrong", rover.getCoordinates().getYCoordinate() == 2);
    }
    
    @Test
    public void test_move_Mars_Rover_forward_twice_turn_right_move_forward_three_times() throws Exception {
    	MarsRover rover = new MarsRover();
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.NORTH);
    	rover.setCardinalDirection(cardinalDirection);
    	rover.setCoordinates(new Coordinate(0,0));
    	rover.setGrid(new Grid(100,100));
    	rover.issueCommand("FFRFFF");
    	assertTrue("X coordinate was wrong", rover.getCoordinates().getXCoordinate() == 3);
    	assertTrue("Y coordinate was wrong", rover.getCoordinates().getYCoordinate() == 2);
    }
    
    @Test
    public void test_starting_facing_east_move_Mars_Rover_forward_twice_turn_left_move_forward_once() throws Exception {
    	MarsRover rover = new MarsRover();
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.EAST);
    	rover.setCardinalDirection(cardinalDirection);
    	rover.setCoordinates(new Coordinate(0,0));
    	rover.setGrid(new Grid(100,100));
    	rover.issueCommand("FFLF");
    	assertTrue("X coordinate was wrong", rover.getCoordinates().getXCoordinate() == 2);
    	assertTrue("Y coordinate was wrong", rover.getCoordinates().getYCoordinate() == 1);
    }
    
    @Test
    public void test_starting_facing_east_move_Mars_Rover_forward_twice_turn_right_move_forward_once() throws Exception {
    	MarsRover rover = new MarsRover();
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.EAST);
    	rover.setCardinalDirection(cardinalDirection);
    	rover.setCoordinates(new Coordinate(0,2));
    	rover.setGrid(new Grid(100,100));
    	rover.issueCommand("FFRF");
    	assertTrue("X coordinate was wrong", rover.getCoordinates().getXCoordinate() == 2);
    	assertTrue("Y coordinate was wrong", rover.getCoordinates().getYCoordinate() == 1);
    }
    
    @Test
    public void test_starting_facing_south_move_Mars_Rover_backwards_twice() throws Exception {
    	MarsRover rover = new MarsRover();
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.SOUTH);
    	rover.setCardinalDirection(cardinalDirection);
    	rover.setCoordinates(new Coordinate(0,0));
    	rover.setGrid(new Grid(100,100));
    	rover.issueCommand("BB");
    	assertTrue("X coordinate was wrong", rover.getCoordinates().getXCoordinate() == 0);
    	assertTrue("Y coordinate was wrong", rover.getCoordinates().getYCoordinate() == 2);
    }
    
    
    @Test
    public void test_move_Mars_Rover_forward_twice_turn_left_move_backward_three_times() throws Exception {
    	MarsRover rover = new MarsRover();
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.NORTH);
    	rover.setCardinalDirection(cardinalDirection);
    	rover.setCoordinates(new Coordinate(0,0));
    	rover.setGrid(new Grid(100,100));
    	rover.issueCommand("FFLBBB");
    	assertTrue("X coordinate was wrong", rover.getCoordinates().getXCoordinate() == 3);
    	assertTrue("Y coordinate was wrong", rover.getCoordinates().getYCoordinate() == 2);
    }
    
    @Test
    public void test_move_Mars_Rover_turn_left_move_forward_twice_wraps_edge() throws Exception {
    	MarsRover rover = new MarsRover();
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.NORTH);
    	rover.setCardinalDirection(cardinalDirection);
    	rover.setCoordinates(new Coordinate(0,0));
    	rover.setGrid(new Grid(100,100));
    	rover.issueCommand("LFF");
    	assertTrue("X coordinate was wrong", rover.getCoordinates().getXCoordinate() == 99);
    	assertTrue("Y coordinate was wrong", rover.getCoordinates().getYCoordinate() == 0);
    }
    
    @Test
    public void test_move_Mars_Rover_move_forward_once_wraps_edge() throws Exception {
    	MarsRover rover = new MarsRover();
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.NORTH);
    	rover.setCardinalDirection(cardinalDirection);
    	rover.setCoordinates(new Coordinate(0,100));
    	rover.setGrid(new Grid(100,100));
    	rover.issueCommand("F");
    	assertTrue("X coordinate was wrong", rover.getCoordinates().getXCoordinate() == 0);
    	assertTrue("Y coordinate was wrong", rover.getCoordinates().getYCoordinate() == 0);
    }
    
    @Test
    public void test_facing_east_move_Mars_Rover_move_forward_once_wraps_edge() throws Exception {
    	MarsRover rover = new MarsRover();
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.EAST);
    	rover.setCardinalDirection(cardinalDirection);
    	rover.setCoordinates(new Coordinate(100,0));
    	rover.setGrid(new Grid(100,100));
    	rover.issueCommand("F");
    	assertTrue("X coordinate was wrong", rover.getCoordinates().getXCoordinate() == 0);
    	assertTrue("Y coordinate was wrong", rover.getCoordinates().getYCoordinate() == 0);
    }
    
    @Test
    public void test_facing_south_move_Mars_Rover_move_forward_once_wraps_edge() throws Exception {
    	MarsRover rover = new MarsRover();
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.SOUTH);
    	rover.setCardinalDirection(cardinalDirection);
    	rover.setCoordinates(new Coordinate(0,0));
    	rover.setGrid(new Grid(100,100));
    	rover.issueCommand("F");
    	assertTrue("X coordinate was wrong", rover.getCoordinates().getXCoordinate() == 0);
    	assertTrue("Y coordinate was wrong", rover.getCoordinates().getYCoordinate() == 100);
    }
    
    @Test
    public void test_Grid_set_obstacle() {
    	Grid grid = new Grid(100,100);
    	Obstacle obstacle = new Obstacle(1,1, "A Rock");
    	grid.setObstacle(obstacle);
    	assertTrue("Obstacle was null", grid.getObstacle(1,1).equals(obstacle));
    }
    
    @Test
    public void test_move_Mars_Rover_into_obstacle_stops_movement() {
    	Grid grid = new Grid(100,100);
    	Obstacle obstacle = new Obstacle(0,2, "A Rock");
    	grid.setObstacle(obstacle);
    	MarsRover rover = new MarsRover();
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.NORTH);
    	rover.setCardinalDirection(cardinalDirection);
    	rover.setCoordinates(new Coordinate(0,0));
    	rover.setGrid(grid);
    	
    	try {
			rover.issueCommand("FFFFF");
		} catch (Exception e) {
			assertTrue("Exception not thrown", e.getMessage().equals("Found Obstacle: A Rock"));
		}
    	
    	assertTrue("X coordinate was wrong", rover.getCoordinates().getXCoordinate() == 0);
    	assertTrue("Y coordinate was wrong", rover.getCoordinates().getYCoordinate() == 1);
    }

    @Test
    public void test_move_Mars_Rover_east_into_obstacle_stops_movement() {
    	Grid grid = new Grid(100,100);
    	Obstacle obstacle = new Obstacle(2,0, "A Rock");
    	grid.setObstacle(obstacle);
    	MarsRover rover = new MarsRover();
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.EAST);
    	rover.setCardinalDirection(cardinalDirection);
    	rover.setCoordinates(new Coordinate(0,0));
    	rover.setGrid(grid);
    	
    	try {
			rover.issueCommand("FFFFF");
		} catch (Exception e) {
			assertTrue("Exception not thrown", e.getMessage().equals("Found Obstacle: A Rock"));
		}
    	
    	assertTrue("X coordinate was wrong", rover.getCoordinates().getXCoordinate() == 1);
    	assertTrue("Y coordinate was wrong", rover.getCoordinates().getYCoordinate() == 0);
    }
    
}
