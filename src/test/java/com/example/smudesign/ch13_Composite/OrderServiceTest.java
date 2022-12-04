package com.example.smudesign.ch13_Composite;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderServiceTest {

    private OrderService orderService;

    @BeforeEach
    void before(){
        orderService = new OrderService(new Box());
    }

    @Test
    void 주문(){
        Product earphone = new Product();
        earphone.setPrice(20000);

        orderService.orderProduct(earphone);
    }

    @Test
    void 여러개주문(){
        Product earphone = new Product();
        earphone.setPrice(20000);

        Product snack = new Product();
        snack.setPrice(1500);

        orderService.orderProduct(earphone);
        orderService.orderProduct(snack);
    }

    @Test
    void 주문취소(){
        Product earphone = new Product();
        earphone.setPrice(20000);
        Product snack = new Product();
        snack.setPrice(1500);

        orderService.orderProduct(earphone);
        orderService.orderProduct(snack);


        orderService.cancelProduct(earphone);
    }
}