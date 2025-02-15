package com.example.solid.srp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class InvoiceTest {
    @Test
    void testCalculateTotal() {
        Invoice invoice = new Invoice("Cliente 1", 100.0);
        double expectedTotal = 100.0 * 1.21; // Aplicando el 21% de IVA
        assertEquals(expectedTotal, invoice.calculateTotal(), 0.01);
        
    }

    @Test
    void testCalculateTotalWithZeroAmount() {
        Invoice invoice = new Invoice("Cliente 2", 0.0);
        assertEquals(0.0, invoice.calculateTotal(), 0.01);
    }
    
    @Test
    void testCalculateTotalWithNegativeAmount() {
        Invoice invoice = new Invoice("Cliente 3", -50.0);
        double expectedTotal = -50.0 * 1.21;
        assertEquals(expectedTotal, invoice.calculateTotal(), 0.01);
    }

    @Test
    void testCalculateTotalWithLargeAmount() {
        Invoice invoice = new Invoice("Cliente 4", 1000000.0);
        double expectedTotal = 1000000.0 * 1.21;
        assertEquals(expectedTotal, invoice.calculateTotal(), 0.01);
    }


    

}
