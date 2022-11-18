package com.example.smudesign.ch6_FactoryMethod.domain;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Truck implements Transport{

    @Override
    public void prepareStuff() {
        log.info("01_Truck으로 보낼 물건을 준비합니다!");
    }

    @Override
    public void packageStuff() {
        log.info("02_Truck에 물건들을 포장합니다!");
    }

    public void deliver(){
        log.info("03_Truck을 통해 배달해드립니다!!");
    }
}
