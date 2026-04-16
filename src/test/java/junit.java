package com.agilefat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceTest {
    PaymentService service = new PaymentService();

    @Test
    void testSuccessfulValidation() {
        Transaction tx = new Transaction(100.0, "USD");
        assertTrue(service.validateTransaction(tx));
    }

    @Test
    void testFailureZeroAmount() {
        Transaction tx = new Transaction(0.0, "USD");
        assertFalse(service.validateTransaction(tx));
    }
}