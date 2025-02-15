package com.example.solid.ocp;

public interface DiscountStrategy {
    double calculateDiscount(String customerType, double price);
}