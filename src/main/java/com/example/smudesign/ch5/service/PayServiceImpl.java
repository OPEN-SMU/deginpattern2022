package com.example.smudesign.ch5.service;

import com.example.smudesign.ch5.domain.Pay;

public class PayServiceImpl implements PayService {
    @Override
    public void paying(Pay pay) {
        pay.payment();
    }
}
