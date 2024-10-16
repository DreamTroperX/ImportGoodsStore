package com.importgoods.factorydecoratorobseverstrategy;
import java.util.ArrayList;
import java.util.List;
// NOTE:Observer: Дозволяє об'єктам підписуватися на повідомлення про зміни в іншому об'єкті

class ProductItem {
    private List<Observer> observers = new ArrayList<>();
    private double price;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }
}
