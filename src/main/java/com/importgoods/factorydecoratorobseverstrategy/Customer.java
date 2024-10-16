package com.importgoods.factorydecoratorobseverstrategy;
// NOTE:Observer: Дозволяє об'єктам підписуватися на повідомлення про зміни в іншому об'єкті

class Customer implements Observer {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println(name + " has been notified about price change: " + price);
    }
}
