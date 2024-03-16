package com.comrade.arrays.single_dimentional;

public class Book {
    private String bookName;
    private String bookPrice;

    public Book(String bookName, String bookPrice) {
        super();
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "Book [bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
    }

}
