package com.example.smudesign.ch2.service;

import com.example.smudesign.ch2.domain.Car;
import com.example.smudesign.ch2.domain.Sonata;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarServiceImplTest {
    private CarService carService;

    @BeforeEach
    void setUp() {
        carService = new CarServiceImpl();
    }

    @Test
    void sonata운전하기() {
        Sonata sonata = new Sonata();
        carService.drive(sonata);
        // OCP 어긋나는 케이스라고 볼 수 있음
        Truck truck = new Truck();
        carService.drive(truck);

        Car car = new Car();
        carService.drive(car);
    }
}
