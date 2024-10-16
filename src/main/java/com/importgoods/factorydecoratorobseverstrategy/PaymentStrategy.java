package com.importgoods.factorydecoratorobseverstrategy;
// NOTE:Strategy: Дозволяє визначити різні стратегії і динамічно вибирати між ними

interface PaymentStrategy {
    void pay(double amount);
}