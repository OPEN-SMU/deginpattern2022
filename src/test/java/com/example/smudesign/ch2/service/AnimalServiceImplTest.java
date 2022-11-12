package com.example.smudesign.ch2.service;

import com.example.smudesign.ch2.domain.Cat;
import com.example.smudesign.ch2.domain.Dog;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnimalServiceImplTest {

    private AnimalService animalService;

    @BeforeEach
    void setUp() {
        animalService = new AnimalServiceImpl();
    }


    @Test
    void spaek() {

        Cat cat = new Cat();
        animalService.Speak(cat);

        Dog dog = new Dog();
        animalService.Speak(dog);

    }


}
