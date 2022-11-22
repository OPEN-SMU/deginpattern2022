package com.example.smudesign.ch6_FactoryMethod.domain;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VolvoTruck extends Truck{
    @Override
    public void prepareStuff() {
        log.info("01_VolvoTruck으로 보낼 물건을 준비합니다!");
    }

    @Override
    public void packageStuff() {
        log.info("02_VolvoTruck에 물건들을 포장합니다!");
    }

    public void deliver(){
        log.info("03_VolvoTruck을 통해 배달해드립니다!!");
    }
}
