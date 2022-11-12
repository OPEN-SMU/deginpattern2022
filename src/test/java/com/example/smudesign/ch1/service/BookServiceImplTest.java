package com.example.smudesign.ch1.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// BookService 역할 테스트
class BookServiceImplTest {

    private BookService bookService;

    private Loadable loadable;

    @BeforeEach
    void setUp() {
        loadable = new FileLoadImpl();
        bookService = new BookServiceImpl(loadable);
    }

    @Test
    void loadTest() {
        bookService.Load();
    }
}
