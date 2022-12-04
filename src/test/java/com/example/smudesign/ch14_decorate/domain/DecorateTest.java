package com.example.smudesign.ch14_decorate.domain;

import org.junit.jupiter.api.Test;

public class DecorateTest {

    @Test
    void decorateTesting() {
        Pizza pizza = new Pizza();
        CheeseDecorate cheeseDecorate = new CheeseDecorate(pizza);
        MeatDecorate meatDecorate = new MeatDecorate(cheeseDecorate);
        meatDecorate.bake();
    }
}
