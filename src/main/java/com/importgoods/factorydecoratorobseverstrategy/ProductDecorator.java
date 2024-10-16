package com.importgoods.factorydecoratorobseverstrategy;

// NOTE:Decorator: Додає нову функціональність об'єкту динамічно,
//  без зміни його структури
abstract class ProductDecorator extends Product {
    protected Product decoratedProduct;

    public ProductDecorator(Product product) {
        this.decoratedProduct = product;
    }

    @Override
    public void info() {
        decoratedProduct.info();
    }
}
