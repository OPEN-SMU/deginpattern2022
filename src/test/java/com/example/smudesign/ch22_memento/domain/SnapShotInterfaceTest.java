package com.example.smudesign.ch22_memento.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SnapShotInterfaceTest {

    private SnapShotInterface snapShotInterface;


    @Test
    void createGameSnapshotImpl() {
        snapShotInterface = new GameSnapShotInterface("",null);
    }

    @Test
    void getNameAboutGameSnapShot() {
        snapShotInterface = new GameSnapShotInterface("testing",null);
        String name = snapShotInterface.getName();
        assertThat(name).isEqualTo("testing");
    }


    @Test
    void getDataAboutGameSnapShot(){
        snapShotInterface = new GameSnapShotInterface("testing",new GameSnapShot("abc","1"));
        GameSnapShot data = (GameSnapShot) snapShotInterface.getSnapshotData();
        assertThat(data.getLevel()).isEqualTo("1");
    }
}
