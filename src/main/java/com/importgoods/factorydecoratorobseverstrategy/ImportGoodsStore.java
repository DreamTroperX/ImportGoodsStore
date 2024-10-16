package com.importgoods.factorydecoratorobseverstrategy;

// NOTE:Singleton: Гарантує, що об'єкт класу буде створений лише один раз
public class ImportGoodsStore {
    private static ImportGoodsStore instance;

    private ImportGoodsStore() {
        // приватний конструктор запобігає створенню об'єктів ззовні
    }

    // Метод getInstance() перевіряє, чи вже існує екземпляр класу.
    // Якщо ні, то створює його і повертає. Якщо екземпляр вже є, він просто повертається.
    public static ImportGoodsStore getInstance() {
        if (instance == null) {
            instance = new ImportGoodsStore();
        }
        return instance;
    }

    public void sellItem(String item) {
        System.out.println("Selling " + item);
    }
}
