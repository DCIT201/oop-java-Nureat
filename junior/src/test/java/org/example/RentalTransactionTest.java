package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//unit to test rental transaction class
class RentalTransactionTest {
    private RentalTransaction transaction;
    private Customer customer;
    private Vehicle vehicle;

    //Sets up common test objects before each test.
    @BeforeEach
    void setUp() {
        // Create a customer and a vehicle for testing
        customer = new Customer("Nureat", 27);
        vehicle = new Car("C1", "Toyota Camry", 100.0, true);
        transaction = new RentalTransaction("TX1", customer, vehicle);
    }

    //Tests the initialization of a rental transaction.
    @Test
    void testTransactionInitialization() {
        assertEquals("TX1", transaction.getTransactionId());
        assertEquals(customer, transaction.getCustomer());
        assertEquals(vehicle, transaction.getVehicle());
        assertFalse(transaction.isCompleted(), "Transaction should initially not be completed");
    }

    //Tests the completion of a rental transaction.
    @Test
    void testSetIsCompleted() {
        // Mark transaction as completed
        transaction.setIsCompleted();
        assertTrue(transaction.isCompleted(), "Transaction should be marked as completed");
        assertTrue(vehicle.getIsAvailable(), "Vehicle should be available after transaction is completed");
    }
}
