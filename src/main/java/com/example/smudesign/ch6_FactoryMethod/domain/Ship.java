package com.example.smudesign.ch6_FactoryMethod.domain;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Ship implements Transport{
    @Override
    public void prepareStuff() {
        log.info("01_Ship으로 보낼 물건을 준비합니다!");
    }

    @Override
    public void packageStuff() {
        log.info("02_Ship에 물건들을 포장합니다!");
    }

    public void deliver(){
        log.info("03_Ship을 통해 배달해드립니다!!");
    }
}
