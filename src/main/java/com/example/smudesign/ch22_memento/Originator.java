package com.example.smudesign.ch22_memento;

import com.example.smudesign.ch22_memento.domain.GameSnapShot;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Originator {

    private GameSnapShot currentGameSnapShot;

    @Builder
    public Originator(GameSnapShot currentGameSnapShot) {
        this.currentGameSnapShot = currentGameSnapShot;
    }


    public GameSnapShot createGameSnapShot(String savePointName, String level) {
        return new GameSnapShot(savePointName, level);
    }

    public void restoreGameSnapShot(GameSnapShot restoreGameSnapShot) {
        this.currentGameSnapShot = restoreGameSnapShot;
    }
}
