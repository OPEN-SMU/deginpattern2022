package com.example.smudesign.ch6_FactoryMethod.Service;

import com.example.smudesign.ch6_FactoryMethod.domain.Logistics;
import com.example.smudesign.ch6_FactoryMethod.domain.SeaLogistics;
import com.example.smudesign.ch6_FactoryMethod.domain.Transport;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
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
