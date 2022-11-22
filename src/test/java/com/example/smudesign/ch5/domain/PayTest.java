package com.example.smudesign.ch5.domain;

import org.junit.jupiter.api.Test;

public class PayTest {

    private Pay pay;

    @Test
    void samgsungPayPayment() {
        pay = new SamgsungPay();
        pay.payment();
    }

    @Test
    void applePayPayment() {
        pay = new Applepay();
        pay.payment();
    }
}
