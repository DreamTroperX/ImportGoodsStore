package com.importgoods.chainofresponsibility;

public class HighDiscountHandler extends DiscountHandler {
    @Override
    public void applyDiscount(double price) {
        if (price >= 500) {
            System.out.println("High discount applied for price: $" + price);
        } else if (nextHandler != null) {
            nextHandler.applyDiscount(price);
        }
    }
}
