package com.importgoods.factorydecoratorobseverstrategy;
// NOTE:Strategy: Дозволяє визначити різні стратегії і динамічно вибирати між ними

class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
