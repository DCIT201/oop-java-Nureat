package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// for testing customer class
class CustomerTest {

    //checking the eligibility of customers
    @Test
    void testCheckAgeEligibility() {
        Customer customer = new Customer("Dede Mawu", 20);
        assertTrue(customer.checkAgeEligibility());

        Customer underageCustomer = new Customer("Jullie", 16);
        assertFalse(underageCustomer.checkAgeEligibility());
    }
}
