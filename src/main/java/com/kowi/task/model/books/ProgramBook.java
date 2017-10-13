package com.kowi.task.model.books;

public class ProgramBook extends Book {

    private String language;

    public ProgramBook(String name, double price, String barcode, int pages, String language) {
        super(name, price, barcode, pages);
        this.language = language;
    }

    public ProgramBook(Integer id, String name, double price, String barcode, int pages, String language) {
        super(id, name, price, barcode, pages);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
