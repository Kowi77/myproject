package com.kowi.task.model.books;

public class EsotericBook extends Book {

    private int minAge;

    public EsotericBook(String name, double price, String barcode, int pages, int minAge) {
        super(name, price, barcode, pages);
        this.minAge = minAge;
    }

    public EsotericBook(Integer id, String name, double price, String barcode, int pages, int minAge) {
        super(id, name, price, barcode, pages);
        this.minAge = minAge;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }
}
