package com.example.solid.srp;

public class Invoice {
    private String customer;
    private double amount;

    public Invoice(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public double calculateTotal() {
        return amount * 1.21;
    }

    public void printInvoice() {
        System.out.println("Factura para: " + customer);
        System.out.println("Total: " + calculateTotal());
    }

    public void saveToDatabase() {
        System.out.println("Guardando factura...");
    }
}