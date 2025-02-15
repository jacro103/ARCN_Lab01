package com.example.solid.srp.Resulltado;

// Clase InvoicePrinter: Responsabilidad de imprimir
public class InvoicePrinter {
    public void print(Invoice invoice) {
        System.out.println("Factura para: " + invoice.getCustomer());
        System.out.println("Total: " + invoice.calculateTotal());
    }
}
