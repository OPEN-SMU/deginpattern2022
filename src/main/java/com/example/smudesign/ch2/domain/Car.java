package com.example.smudesign.ch2.domain;

public class Car implements Drivable{
    @Override
    public void drive() {
        System.out.println("car drive");
    }
}
