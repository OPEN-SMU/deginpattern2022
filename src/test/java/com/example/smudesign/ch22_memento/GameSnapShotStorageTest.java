package com.example.smudesign.ch22_memento;


import com.example.smudesign.ch22_memento.domain.GameSnapShot;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameSnapShotStorageTest {

    @Test
    void createGameSnapShotStorageTest() {
        GameSnapShotStorage gameSnapShotStorage = new GameSnapShotStorage();
        assertThat(gameSnapShotStorage.getGameSnapShots()).hasSize(0);
    }


    @Test
    void createBackupGameSnapShot(){
        GameSnapShotStorage gameSnapShotStorage = new GameSnapShotStorage();
        Originator originator = new Originator();
        String savePointName = "testing-point";
        String level = "1";
        gameSnapShotStorage.createBackupGameSnapShot(originator.createGameSnapShot(savePointName,level));
        assertThat(gameSnapShotStorage.getGameSnapShots()).hasSize(1);
    }


    @Test
    void getGameSnapShotByIndex(){
        GameSnapShotStorage gameSnapShotStorage = new GameSnapShotStorage();
        Originator originator = new Originator();
        String savePointName = "testing-point";
        String level = "1";
        gameSnapShotStorage.createBackupGameSnapShot(originator.createGameSnapShot(savePointName,level));
        int index = 0;
        GameSnapShot gameSnapShot = gameSnapShotStorage.getGameSnapShotByIndex(index);
        assertThat(gameSnapShot.getSavePointName()).isEqualTo(savePointName);
    }


    @Test
    void getRecentGameSnapShot(){
        GameSnapShotStorage gameSnapShotStorage = new GameSnapShotStorage();
        Originator originator = new Originator();
        String savePointName = "testing-point";
        String level = "1";
        gameSnapShotStorage.createBackupGameSnapShot(originator.createGameSnapShot(savePointName,level));
        GameSnapShot gameSnapShot = gameSnapShotStorage.getRecentGameSnapShot();
        assertThat(gameSnapShot.getSavePointName()).isEqualTo(savePointName);
    }

}
