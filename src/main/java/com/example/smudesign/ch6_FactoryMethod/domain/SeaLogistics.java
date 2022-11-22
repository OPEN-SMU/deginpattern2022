package com.example.smudesign.ch6_FactoryMethod.domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SeaLogistics implements Logistics{
    private final Ship ship;
    @Override
    public Transport createTransport() {
        return new Ship();
    }

}
