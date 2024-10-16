package com.importgoods.chainofresponsibility;

public abstract class DiscountHandler {
    protected DiscountHandler nextHandler;

    public void setNextHandler(DiscountHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void applyDiscount(double price);
}
