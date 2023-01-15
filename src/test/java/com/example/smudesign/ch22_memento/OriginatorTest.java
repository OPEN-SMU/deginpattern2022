package com.example.smudesign.ch22_memento;

import com.example.smudesign.ch22_memento.domain.GameSnapShot;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OriginatorTest {

    @Test
    void createOriginator() {
        Originator originator = new Originator();
        assertThat(originator.getCurrentGameSnapShot()).isNull();
    }

    @Test
    void savedCurrentSnapShot() {
        Originator originator = new Originator();
        String savePointName = "testing-point";
        String level = "1";
        GameSnapShot gameSnapShot  = originator.createGameSnapShot(savePointName,level);
        assertThat(gameSnapShot.getLevel()).isEqualTo("1");
    }

    @Test
    void restoreGameSnapShot() {
        Originator originator = new Originator();
        originator.setCurrentGameSnapShot(new GameSnapShot());
        originator.restoreGameSnapShot(new GameSnapShot("testing", "2"));
        assertThat(originator.getCurrentGameSnapShot().getLevel()).isEqualTo("2");
    }


}
