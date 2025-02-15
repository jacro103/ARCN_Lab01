package com.example.solid.srp.Resulltado;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Cliente A", 100.0);
        InvoicePrinter printer = new InvoicePrinter();
        InvoiceRepository repository = new InvoiceRepository();

        printer.print(invoice);
        repository.save(invoice);
    }
}
