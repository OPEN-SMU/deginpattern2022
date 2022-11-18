package com.example.smudesign.ch6_FactoryMethod.domain;

public class RoadLogistics implements Logistics{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
