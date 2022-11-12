package com.example.smudesign.ch2.domain;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Animal  implements  Speakable{

    @Override
    public void Speak() {
        log.info("ch2 !!!!");
    }

}
