package com.example.smudesign.ch13_Composite;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Box implements Component{

    private List<Component> list = new ArrayList<>();
    private int price;

    @Override
    public int getPrice() {
        price = 0;
        for (Component component : list) {
            price += component.getPrice();
        }
        return price;
    }

    public void add(Component component){
        list.add(component);
    }

    public void remove(Component component){
        list.remove(component);
    }
}
