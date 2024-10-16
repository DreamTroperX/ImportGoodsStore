package com.importgoods.builder;

import com.importgoods.builder.Product;

/*
NOTE:Проблема: Коли клас має багато параметрів для налаштування,
 стандартний конструктор може стати перевантаженим і складним для використання.
 Патерн Builder вирішує цю проблему, дозволяючи пошагово створювати об'єкти.
 Cтворення складного об'єкта продукту.
*/

public class Main {
    public static void main(String[] args) {
        // Використання Builder для створення об'єкта Product
        Product product = new Product.ProductBuilder()
                .setName("Imported Chocolate")
                .setCategory("Food")
                .setPrice(15.99)
                .setManufacturer("Belgium Ltd.")
                .build();

        product.info();
    }
}