package com.importgoods.factorydecoratorobseverstrategy;

// NOTE:Decorator: Додає нову функціональність об'єкту динамічно,
//  без зміни його структури
class DiscountedProduct extends ProductDecorator {
    public DiscountedProduct(Product product) {
        super(product);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("This product has a discount.");
    }
}
