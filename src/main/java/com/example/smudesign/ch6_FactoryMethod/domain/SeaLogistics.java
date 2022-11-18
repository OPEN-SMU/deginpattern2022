package com.example.smudesign.ch6_FactoryMethod.domain;

public class SeaLogistics implements Logistics{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
