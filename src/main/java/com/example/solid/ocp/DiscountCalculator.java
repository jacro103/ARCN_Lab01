package com.example.solid.ocp;
import com.example.solid.ocp.interfaces.DiscountStrategy;

public class DiscountCalculator implements DiscountStrategy{
    @Override
    public double calculateDiscount(String customerType, double price) {
        if (customerType.equals("Regular")) {
            return price * 0.10;
        } else if (customerType.equals("VIP")) {
            return price * 0.20;
        }
        return 0;
    }
}
