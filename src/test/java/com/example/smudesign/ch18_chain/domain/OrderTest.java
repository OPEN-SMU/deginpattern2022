package com.example.smudesign.ch18_chain.domain;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OrderTest {

    @Test
    void TestCreateOrder(){
        Order order = new Order("127.0.0.1","test1",1);
        assertThat(order.getIp()).isEqualTo("127.0.0.1");
    }

}
