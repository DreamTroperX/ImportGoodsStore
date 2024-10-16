package com.importgoods.factorydecoratorobseverstrategy;

// NOTE:Factory Method: Дозволяє створювати об'єкти через фабричні методи,
//  без прямого звернення до конструктора

class FoodProduct extends Product {
    @Override
    void info() {
        System.out.println("This is a food product.");
    }
}