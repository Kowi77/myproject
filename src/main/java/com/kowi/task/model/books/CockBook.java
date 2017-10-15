package com.kowi.task.model.books;

public class CockBook extends Book {

    private String ingridient;

    public CockBook(String name, double price, String barcode, int pages, String ingridient) {
        super(name, price, barcode, pages);
        this.ingridient = ingridient;
    }

    public CockBook(Integer id, String name, double price, String barcode, int pages, String ingridient) {
        super(id, name, price, barcode, pages);
        this.ingridient = ingridient;
    }

    public String getIngridient() {
        return ingridient;
    }

    public void setIngridient(String ingridient) {
        this.ingridient = ingridient;
    }
}
