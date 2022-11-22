package com.example.smudesign.ch6_FactoryMethod.Service;

import com.example.smudesign.ch6_FactoryMethod.domain.*;
import org.junit.jupiter.api.Test;


class DeliveryServiceImplTest {
    private DeliveryService deliveryService;


    @Test
    public void truckDeliverTest(){
        Truck truck = new Truck();

        deliveryService = new DeliveryServiceImpl(new RoadLogistics(truck));
        deliveryService.doDeliver();
    }

    @Test
    public void volvoTruckTest(){
        Truck volvoTruck = new VolvoTruck();

        deliveryService = new DeliveryServiceImpl(new RoadLogistics(volvoTruck));
        deliveryService.doDeliver();

     }

    @Test
    public void shipDeliverTest(){
        Ship ship = new Ship();
        deliveryService = new DeliveryServiceImpl(new SeaLogistics(ship));
        deliveryService.doDeliver();
    }
}