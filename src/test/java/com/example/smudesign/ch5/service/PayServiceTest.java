package com.example.smudesign.ch5.service;

import com.example.smudesign.ch5.domain.Applepay;
import com.example.smudesign.ch5.domain.Pay;
import com.example.smudesign.ch5.domain.SamgsungPay;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PayServiceTest {

    private PayService payService;


    @BeforeEach
    void setUp() {
        payService = new PayServiceImpl();
    }

    @Test
    void PayMent() {
        Pay pay = new Applepay();
        payService.paying(pay);
        pay = new SamgsungPay();
        payService.paying(pay);
    }

    @Test
    void payMent2() {
        payService.paying();
    }
}
