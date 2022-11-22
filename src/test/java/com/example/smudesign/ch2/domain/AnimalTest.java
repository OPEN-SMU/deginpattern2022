package com.example.smudesign.ch2.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnimalTest {
    private Animal animal;

    @BeforeEach
    void setUp() {
        animal = new Cat();
    }

    @Test
    void speak() {
        animal.Speak();
    }

    @Test
    void 강아지() {
        animal = new Dog();
        animal.Speak();
    }

}
