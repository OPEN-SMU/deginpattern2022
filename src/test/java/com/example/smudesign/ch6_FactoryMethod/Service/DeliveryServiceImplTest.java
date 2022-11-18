package com.example.smudesign.ch6_FactoryMethod.Service;

import com.example.smudesign.ch6_FactoryMethod.domain.RoadLogistics;
import com.example.smudesign.ch6_FactoryMethod.domain.SeaLogistics;
import org.junit.jupiter.api.Test;


class DeliveryServiceImplTest {
    private DeliveryService deliveryService;


    @Test
    public void truckDeliverTest(){
        deliveryService = new DeliveryServiceImpl(new RoadLogistics());
        deliveryService.doDeliver();
     }

     @Test
     public void shipDeliverTest(){
         deliveryService = new DeliveryServiceImpl(new SeaLogistics());
         deliveryService.doDeliver();

      }
}