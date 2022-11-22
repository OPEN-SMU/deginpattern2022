package com.example.smudesign.ch5.domain;

public class Applepay implements Pay {
    @Override
    public void payment() {
        System.out.println("Apple Pay !!!");
    }
}
