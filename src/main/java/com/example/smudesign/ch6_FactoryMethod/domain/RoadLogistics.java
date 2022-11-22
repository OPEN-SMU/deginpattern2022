package com.example.smudesign.ch6_FactoryMethod.domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RoadLogistics implements Logistics{
    private final Truck truck;

    @Override
    public Transport createTransport() {
        return truck;
    }
}
