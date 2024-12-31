package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TruckTest {
    @Test
    void testCalculateRentalCost() {
        Vehicle truck = new Truck("C1", "Toyota", 50.0);
        assertEquals(2250.0, truck.calculateRentalCost(5));
    }

    @Test
    void testAvailability() {
        Vehicle truck = new Truck("T1", "Toyota Tundra", 90.0);
        assertTrue(truck.getIsAvailable());
        truck.setIsAvailable(false);
        assertFalse(truck.getIsAvailable());
    }
}
