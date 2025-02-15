package com.example.solid.ocp.interfaces;

public interface DiscountStrategy {
    double calculateDiscount(String customerType, double price);
}