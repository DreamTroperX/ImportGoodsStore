package com.importgoods.chainofresponsibility;

import com.importgoods.chainofresponsibility.DiscountHandler;
import com.importgoods.chainofresponsibility.LowDiscountHandler;
import com.importgoods.chainofresponsibility.MediumDiscountHandler;
import com.importgoods.chainofresponsibility.HighDiscountHandler;

/*
NOTE:Проблема: Ви хочете передати запит через ланцюжок обробників,
 кожен із яких має шанс обробити запит або передати його наступному обробнику.
 Chain of Responsibility дозволяє це зробити.
 Обробка різних рівнів знижок у магазині.
*/

public class Main {
    public static void main(String[] args) {
        // Створюємо ланцюжок обробки знижок
        DiscountHandler low = new LowDiscountHandler();
        DiscountHandler medium = new MediumDiscountHandler();
        DiscountHandler high = new HighDiscountHandler();

        low.setNextHandler(medium);
        medium.setNextHandler(high);

        // Використання ланцюжка для різних цін
        low.applyDiscount(50);   // Low discount
        low.applyDiscount(200);  // Medium discount
        low.applyDiscount(600);  // High discount
    }
}