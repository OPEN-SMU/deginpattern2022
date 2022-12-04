package com.example.smudesign.ch14_decorate.domain;

public class CheeseDecorate extends Decorate {
    public CheeseDecorate(Bakable pizza) {
        super(pizza);
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("cheese 추가!!");
    }
}
