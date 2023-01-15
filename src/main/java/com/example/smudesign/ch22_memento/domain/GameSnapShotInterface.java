package com.example.smudesign.ch22_memento.domain;

import lombok.Builder;

public class GameSnapShotInterface implements SnapShotInterface {

    private String name;
    private Object data;

    @Builder
    public GameSnapShotInterface(String name, Object data) {
        this.name = name;
        this.data = data;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Object getSnapshotData() {
        return this.data;
    }

}
