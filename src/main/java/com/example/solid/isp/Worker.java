package com.example.solid.isp;

public interface Worker {
    void work();
    void eat();
}

class Developer implements Worker {
    @Override
    public void work() {
        System.out.println("Escribiendo código...");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Sin horario fijo de almuerzo.");
    }
}