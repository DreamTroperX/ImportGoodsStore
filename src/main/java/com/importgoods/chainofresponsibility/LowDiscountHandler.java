package com.importgoods.chainofresponsibility;

public class LowDiscountHandler extends DiscountHandler {
    @Override
    public void applyDiscount(double price) {
        if (price < 100) {
            System.out.println("Low discount applied for price: $" + price);
        } else if (nextHandler != null) {
            nextHandler.applyDiscount(price);
        }
    }
}