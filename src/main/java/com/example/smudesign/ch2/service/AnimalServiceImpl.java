package com.example.smudesign.ch2.service;

import com.example.smudesign.ch2.domain.Animal;

public class AnimalServiceImpl implements AnimalService {
    @Override
    public void Speak(Animal animal) {
        animal.Speak();
    }
}
