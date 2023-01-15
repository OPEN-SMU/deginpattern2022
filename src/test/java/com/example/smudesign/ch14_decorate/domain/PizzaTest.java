package com.example.smudesign.ch14_decorate.domain;

import org.junit.jupiter.api.Test;

public class PizzaTest {
        private Bakable pizza;

    @Test
    void createPizza() {
        pizza = new Pizza();
        pizza.bake();
    }
}
