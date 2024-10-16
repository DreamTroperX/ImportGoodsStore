package com.importgoods.factorydecoratorobseverstrategy;

public class Main {
    public static void main(String[] args) {
        // Singleton
        ImportGoodsStore store = ImportGoodsStore.getInstance();
        store.sellItem("Laptop");

        // Factory Method
        Product food = ProductFactory.createProduct("food");
        food.info();

        Product electronics = ProductFactory.createProduct("electronics");
        electronics.info();

        // Decorator
        Product discountedFood = new DiscountedProduct(food);
        discountedFood.info();

        // Observer
        ProductItem productItem = new ProductItem();
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");
        productItem.addObserver(customer1);
        productItem.addObserver(customer2);

        productItem.setPrice(299.99);

        // Strategy
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.setStrategy(new CreditCardPayment());
        paymentContext.checkout(100);

        paymentContext.setStrategy(new PayPalPayment());
        paymentContext.checkout(200);
    }
}
