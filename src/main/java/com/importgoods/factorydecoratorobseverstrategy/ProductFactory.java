package com.importgoods.factorydecoratorobseverstrategy;

// NOTE: Factory Method
//  Дозволяє створювати об'єкти через фабричні методи,
//  без прямого звернення до конструктора
//  Factory Method надає спосіб створення об'єктів, дозволяючи субкласам вирішувати,
//  який тип об'єкта створити. Це полегшує додавання нових типів об'єктів без зміни
//  існуючого коду.

class ProductFactory {
    public static Product createProduct(String type) {
        return switch (type.toLowerCase()) {
            case "food" -> new FoodProduct();
            case "electronics" -> new ElectronicsProduct();
            default -> throw new IllegalArgumentException("Unknown product type");
        };
    }
}
