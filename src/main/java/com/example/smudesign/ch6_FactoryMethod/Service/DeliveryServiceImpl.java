package com.example.smudesign.ch6_FactoryMethod.Service;

import com.example.smudesign.ch6_FactoryMethod.domain.Logistics;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DeliveryServiceImpl implements DeliveryService{
    private final Logistics logistics;

    /** @RequiredArgsConstructor 에 의해 생략된 코드
     * public DeliveryServiceImpl(Logistics logistics) {
        this.logistics = logistics;
    }*/

    @Override
    public void doDeliver() {
        logistics.doDeliver();
    }
}
