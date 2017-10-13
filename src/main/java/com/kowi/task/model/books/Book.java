package com.kowi.task.model.books;


import com.kowi.task.model.Product;

public abstract class Book extends Product {

    private int pages;

    public Book(String name, double price, String barcode, int pages) {
        super(name, price, barcode);
        this.pages = pages;
    }

    public Book(Integer id, String name, double price, String barcode, int pages) {
        super(id, name, price, barcode);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
