package com.example.smudesign.ch14_decorate.domain;

public class MeatDecorate extends Decorate {

    public MeatDecorate(Bakable bakable) {
        super(bakable);
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("고기 추가");
    }
}
