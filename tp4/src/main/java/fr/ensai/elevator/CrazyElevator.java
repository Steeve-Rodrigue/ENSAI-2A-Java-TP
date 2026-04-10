package fr.ensai.elevator;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import fr.ensai.elevator.Elevator;
import fr.ensai.elevator.Floor;
import fr.ensai.elevator.Person;


public class CrazyElevator extends Elevator {

    public CrazyElevator (int id, int startFloor, int capacity){
        super(id, startFloor, capacity);
    }
 
    @Override
    public void move() {

        Random random = new Random();
        int cas = random.nextInt(3);

        switch (cas) {
            case 0:
                this.currentFloor = this.destinationQueue.removeFirst();
                break;
            case 1:
                this.currentFloor = this.destinationQueue.remove(1);
                break;
            default:
                break;
        }
    }

    @Override
    public int unloadPassengers(Floor floor) {

        
        Random random = new Random();
        int cas = random.nextInt(2);

        switch (cas) {
            case 0:
                this.lastUnloaded.clear();
                List<Person> remaining = new ArrayList<>();
                for (Person p : this.passengers) {
                    if (p.getTargetFloor() == floor.getNumber()) {
                        this.lastUnloaded.add(p);
                        logger.info("Floor {}: {}{} leaves Elevator {}",
                                floor.getNumber(),
                                p.getNickname(),
                                p.getTargetFloor(),
                                this.id);
                    } else {
                        remaining.add(p);
                    }
                }
                this.passengers = remaining;
                return this.lastUnloaded.size();
            default:
                return 0;

        }
    }
}
