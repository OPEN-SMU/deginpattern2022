package com.example.smudesign.ch18_chain.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Order {
    private String ip;
    private String name;
    private int price;


    @Builder
    public Order(String ip, String name, int price) {
        this.ip = ip;
        this.name = name;
        this.price = price;
    }

}
