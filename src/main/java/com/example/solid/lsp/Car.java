package com.example.solid.lsp;

public class Car {
    public void drive() {
        System.out.println("Conduciendo...");
    }

    public void refuel() {
        System.out.println("Repostando...");
    }
}

class ElectricCar extends Car {
    @Override
    public void refuel() {
        throw new UnsupportedOperationException("Los coches eléctricos no usan combustible.");
    }
}