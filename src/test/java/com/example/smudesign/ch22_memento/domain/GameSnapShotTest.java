package com.example.smudesign.ch22_memento.domain;

import org.junit.jupiter.api.Test;

class GameSnapShotTest {

    @Test
    void CreateGameSnapShot() {
        GameSnapShot gameSnapShot = new GameSnapShot();
        System.out.println(gameSnapShot.getSavedTime());
    }


}
