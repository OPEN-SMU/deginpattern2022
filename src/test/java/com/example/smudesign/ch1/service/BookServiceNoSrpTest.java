package com.example.smudesign.ch1.service;

import com.example.smudesign.ch1.domain.Book;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class BookServiceNoSrpTest {
    private ArrayList<Book> books;
    private BookServiceNoSrp bookServiceNoSrp;

    @BeforeAll
    void Setup(){
        bookServiceNoSrp = new BookServiceNoSrp();
    }


    @Test
    void load() {
        bookServiceNoSrp.Load();
    }

    @Test
    void save() {
        bookServiceNoSrp.Show();
    }
}
