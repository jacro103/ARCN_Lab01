package com.example.solid.dip.GoodExample;

public class OrderProcessor {

    private Database database;

    public OrderProcessor() {
        this.database = new MySQLDatabase();
    }

    public void processOrder() {
        System.out.println("Procesando pedido...");
        database.saveOrder();
    }
}
