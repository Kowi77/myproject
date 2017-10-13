package com.kowi.task.model;

public abstract class Product {

    private Integer id;

    private String name;

    private double price;

    private String barcode;

    public Product(String name, double price, String barcode) {
        this.name = name;
        this.price = price;
        this.barcode = barcode;
    }

    public Product(Integer id, String name, double price, String barcode) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.barcode = barcode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
