package com.importgoods.builder;

// Factory Method: Дозволяє створювати об'єкти через фабричні методи, без прямого звернення до конструктора

public class Product {
    private final String name;
    private final String category;
    private final double price;
    private final String manufacturer;

    private Product(ProductBuilder builder) {
        this.name = builder.name;
        this.category = builder.category;
        this.price = builder.price;
        this.manufacturer = builder.manufacturer;
    }

    public static class ProductBuilder {
        private String name;
        private String category;
        private double price;
        private String manufacturer;

        public ProductBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder setCategory(String category) {
            this.category = category;
            return this;
        }

        public ProductBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public ProductBuilder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Product build() {
            return new com.importgoods.builder.Product(this);
        }
    }

    public void info() {
        System.out.println("Product Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Manufacturer: " + manufacturer);
    }
}

