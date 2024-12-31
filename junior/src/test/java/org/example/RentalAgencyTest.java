package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//unit test for rental agency class
class RentalAgencyTest {

    //test to ensure addition of vehicles to rental agency
    @Test
    void testAddVehicle() {
        RentalAgency agency = new RentalAgency();
        Vehicle car = new Car("C1", "Toyota", 50.0, true);
        agency.addVehicle(car);

        assertEquals(1, agency.getVehicles());
    }

    //test renting a vehicle to a customer
    @Test
    void testRentVehicle() {
        RentalAgency agency = new RentalAgency();
        Vehicle car = new Car("C1", "Toyota", 50.0, true);
        agency.addVehicle(car);

        Customer customer = new Customer("Nureat", 27);
        agency.rentVehicle("C1", customer, 3);

        assertFalse(car.getIsAvailable());
    }
}