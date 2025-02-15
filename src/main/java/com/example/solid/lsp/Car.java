package com.example.solid.lsp;
import com.example.solid.lsp.interfaces.*;
public class Car implements Driveble, Refuelable{
    @Override
    public void drive() {
        System.out.println("Conduciendo...");
    }

    @Override
    public void refuel() {
        System.out.println("Repostando...");
    }
}

class ElectricCar implements Refuelable {
    @Override
    public void refuel() {
        throw new UnsupportedOperationException("Los coches eléctricos no usan combustible.");
    }
}