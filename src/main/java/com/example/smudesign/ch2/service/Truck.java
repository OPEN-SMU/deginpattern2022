package com.example.smudesign.ch2.service;

import com.example.smudesign.ch2.domain.Car;

public class Truck extends Car {
    @Override
    public void drive() {
        System.out.println("truck drive");
    }
}
