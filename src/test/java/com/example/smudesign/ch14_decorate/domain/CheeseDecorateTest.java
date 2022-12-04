package com.example.smudesign.ch14_decorate.domain;

import org.junit.jupiter.api.Test;

public class CheeseDecorateTest {
    public Decorate cheeseDecorate;

    @Test
    void createCheese() {
        cheeseDecorate = new CheeseDecorate(new Pizza());
        cheeseDecorate.bake();
    }
}
