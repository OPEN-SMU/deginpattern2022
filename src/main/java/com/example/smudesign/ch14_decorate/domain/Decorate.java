package com.example.smudesign.ch14_decorate.domain;

abstract public class Decorate implements Bakable {
    private Bakable bakable;
    public Decorate(Bakable bakable) {
        this.bakable = bakable;
    }

    @Override
    public void bake() {
        bakable.bake();
    }
}
