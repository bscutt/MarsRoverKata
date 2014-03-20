package marRoverTests;

import static org.junit.Assert.*;
import marsRover.CardinalDirection;

import org.junit.Test;

public class CardinalDirectionTests {

    @Test
    public void test_create_Cardinal_Direction() {
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.NORTH);
    	assertTrue("CardinalDirection was null", cardinalDirection != null);
    }
    
    @Test
    public void test_create_Cardinal_Direction_and_then_get_direction_equals_north() {
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.NORTH);
    	assertTrue("CardinalDirection was incorrect", cardinalDirection.getCurrentDirection() == CardinalDirection.NORTH);
    }
    
    @Test
    public void test_create_Cardinal_Direction_and_then_get_direction_equals_south() {
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.SOUTH);
    	assertTrue("CardinalDirection was incorrect", cardinalDirection.getCurrentDirection() == CardinalDirection.SOUTH);
    }
    
    @Test
    public void test_create_Cardinal_Direction_and_then_get_direction_equals_east() {
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.EAST);
    	assertTrue("CardinalDirection was incorrect", cardinalDirection.getCurrentDirection() == CardinalDirection.EAST);
    }
    
    @Test
    public void test_create_Cardinal_Direction_and_then_get_direction_equals_west() {
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.WEST);
    	assertTrue("CardinalDirection was incorrect", cardinalDirection.getCurrentDirection() == CardinalDirection.WEST);
    }
    
    @Test
    public void test_create_north_Cardinal_Direction_turn_left_returns_new_west_cardinal_direction() {
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.NORTH);
    	cardinalDirection = cardinalDirection.turnLeft();
    	assertTrue("CardinalDirection was incorrect", cardinalDirection.getCurrentDirection() == CardinalDirection.WEST);
    }
    
    @Test
    public void test_create_east_Cardinal_Direction_turn_left_returns_new_north_cardinal_direction() {
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.EAST);
    	cardinalDirection = cardinalDirection.turnLeft();
    	assertTrue("CardinalDirection was incorrect", cardinalDirection.getCurrentDirection() == CardinalDirection.NORTH);
    }
    
    @Test
    public void test_create_south_Cardinal_Direction_turn_left_returns_new_east_cardinal_direction() {
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.SOUTH);
    	cardinalDirection = cardinalDirection.turnLeft();
    	assertTrue("CardinalDirection was incorrect", cardinalDirection.getCurrentDirection() == CardinalDirection.EAST);
    }
    
    @Test
    public void test_create_west_Cardinal_Direction_turn_left_returns_new_south_cardinal_direction() {
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.WEST);
    	cardinalDirection = cardinalDirection.turnLeft();
    	assertTrue("CardinalDirection was incorrect", cardinalDirection.getCurrentDirection() == CardinalDirection.SOUTH);
    }
	
    @Test
    public void test_create_north_Cardinal_Direction_turn_right_returns_new_east_cardinal_direction() {
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.NORTH);
    	cardinalDirection = cardinalDirection.turnRight();
    	assertTrue("CardinalDirection was incorrect", cardinalDirection.getCurrentDirection() == CardinalDirection.EAST);
    }
    
    @Test
    public void test_create_east_Cardinal_Direction_turn_right_returns_new_south_cardinal_direction() {
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.EAST);
    	cardinalDirection = cardinalDirection.turnRight();
    	assertTrue("CardinalDirection was incorrect", cardinalDirection.getCurrentDirection() == CardinalDirection.SOUTH);
    }
    
    @Test
    public void test_create_south_Cardinal_Direction_turn_right_returns_new_west_cardinal_direction() {
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.SOUTH);
    	cardinalDirection = cardinalDirection.turnRight();
    	assertTrue("CardinalDirection was incorrect", cardinalDirection.getCurrentDirection() == CardinalDirection.WEST);
    }
    
    @Test
    public void test_create_west_Cardinal_Direction_turn_right_returns_new_north_cardinal_direction() {
    	CardinalDirection cardinalDirection = new CardinalDirection(CardinalDirection.WEST);
    	cardinalDirection = cardinalDirection.turnRight();
    	assertTrue("CardinalDirection was incorrect", cardinalDirection.getCurrentDirection() == CardinalDirection.NORTH);
    }
}
