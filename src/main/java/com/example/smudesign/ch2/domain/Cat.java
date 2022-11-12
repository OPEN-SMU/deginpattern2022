package com.example.smudesign.ch2.domain;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cat extends Animal {

    @Override
    public void Speak() {
        log.info("냐옹~~~~");
    }

}
