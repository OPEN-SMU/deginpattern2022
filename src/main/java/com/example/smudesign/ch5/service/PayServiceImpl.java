package com.example.smudesign.ch5.service;

import com.example.smudesign.ch5.domain.Pay;
import com.example.smudesign.ch5.domain.SamgsungPay;

public class PayServiceImpl implements PayService {
    @Override
    public void paying(Pay pay) {
        pay.payment();
    }

    @Override
    public void paying() {
        SamgsungPay samgsungPay = new SamgsungPay();
        samgsungPay.payment();
    }
}
