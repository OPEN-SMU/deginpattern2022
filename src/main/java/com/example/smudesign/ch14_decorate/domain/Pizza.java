package com.example.smudesign.ch14_decorate.domain;

public class Pizza implements Bakable {
    @Override
    public void bake() {
        System.out.println("피자를 굽다");
    }
}
