package fr.ensai.elevator;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ElevatorTest {

	/**
	 * 
	 */
	@Test
	void addDestination(){
		//GIVEN
		int floor = 4;
		Elevator elevator = new Elevator(1, 1, 10);


		//WHEN
		elevator.addDestination(floor);

		//THEN
        assertEquals(1, elevator.getDestinationQueueSize());
		assertTrue(elevator.containDestination(floor));
	}

}
