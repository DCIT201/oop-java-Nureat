package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//testing for car class
class CarTest {

    //testing the calculations of the rental cost of car
    @Test
    void testCalculateRentalCost() {
        Vehicle car = new Car("C1", "Toyota ", 50.0, true);

        // verify if rental cost for 4 days is correctly calculated
        assertEquals(250.0, car.calculateRentalCost(4));
    }

    // checking the availability of cars
    @Test
    void testAvailability() {
        Vehicle car = new Car("C1", "Camry", 30.0, false);
        assertTrue(car.getIsAvailable());
        car.setIsAvailable(false);
        assertFalse(car.getIsAvailable());
    }
}
