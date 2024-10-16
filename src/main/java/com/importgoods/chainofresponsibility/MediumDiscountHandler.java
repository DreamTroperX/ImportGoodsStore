package com.importgoods.chainofresponsibility;

public class MediumDiscountHandler extends DiscountHandler {
    @Override
    public void applyDiscount(double price) {
        if (price >= 100 && price < 500) {
            System.out.println("Medium discount applied for price: $" + price);
        } else if (nextHandler != null) {
            nextHandler.applyDiscount(price);
        }
    }
}