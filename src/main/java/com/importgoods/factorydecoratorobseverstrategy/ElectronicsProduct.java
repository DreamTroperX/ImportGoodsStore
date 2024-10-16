package com.importgoods.factorydecoratorobseverstrategy;

// NOTE:Factory Method: Дозволяє створювати об'єкти через фабричні методи,
//  без прямого звернення до конструктора
class ElectronicsProduct extends Product {
    @Override
    void info() {
        System.out.println("This is an electronics product.");
    }
}