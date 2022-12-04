package com.example.smudesign.ch13_Composite;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter @Setter
public class Product implements Component{
    private int price = 0;


    @Override
    public int getPrice() {
        return price;
    }
}
