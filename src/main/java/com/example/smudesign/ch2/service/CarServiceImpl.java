package com.example.smudesign.ch2.service;

import com.example.smudesign.ch2.domain.Drivable;

public class CarServiceImpl implements CarService {
    @Override
    public void drive(Drivable car) {
        car.drive();
    }
}
