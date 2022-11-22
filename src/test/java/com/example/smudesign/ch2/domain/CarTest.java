package com.example.smudesign.ch2.domain;

import org.junit.jupiter.api.Test;

class CarTest {
    Car car;
    @Test
    void Car생성하기() {
        car = new Car();

        if (car != null ){
            System.out.println("car is creatd");
            car.drive();
        }
    }


    @Test
    void sonata생성하기() {
         car = new Sonata();
         car.drive();
    }
}
