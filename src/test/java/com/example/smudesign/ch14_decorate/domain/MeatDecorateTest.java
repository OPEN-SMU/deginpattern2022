package com.example.smudesign.ch14_decorate.domain;

import org.junit.jupiter.api.Test;

public class MeatDecorateTest {
    private Decorate meatDecorate;

    @Test
    void meatDecorateCreate() {
        meatDecorate = new MeatDecorate(new Pizza());
        meatDecorate.bake();
    }
}
