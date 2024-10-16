package com.importgoods.factorydecoratorobseverstrategy;
// NOTE:Strategy: Дозволяє визначити різні стратегії і динамічно вибирати між ними

class PaymentContext {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void checkout(double amount) {
        strategy.pay(amount);
    }
}
