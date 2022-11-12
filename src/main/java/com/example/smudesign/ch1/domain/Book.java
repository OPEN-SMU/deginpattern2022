package com.example.smudesign.ch1.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Book {
    private String author;
    private int publishedYear;
    private double price;
    private String isbn;

    @Builder
    public Book(String author, int publishedYear, double price, String isbn) {
        this.author = author;
        this.publishedYear = publishedYear;
        this.price = price;
        this.isbn = isbn;
    }
}
