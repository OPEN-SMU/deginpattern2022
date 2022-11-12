package com.example.smudesign.ch1.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BookTest {

    @Test
    void 생성해보기(){
        Book testBook = Book.builder().build();
        assertNotNull(testBook);
    }



}
