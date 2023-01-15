package com.example.smudesign.ch22_memento;

import com.example.smudesign.ch22_memento.domain.GameSnapShot;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Slf4j
public class GameSnapShotStorage {

    private List<GameSnapShot> gameSnapShots = new ArrayList<>();

    public void createBackupGameSnapShot(GameSnapShot gameSnapShot) {
        log.info("createBackupGameSnapShot start");
        gameSnapShots.add(gameSnapShot);
        log.info("createBackupGameSnapShot end");
    }

    public GameSnapShot getGameSnapShotByIndex(int index) {
        return this.gameSnapShots.get(index);
    }

    public GameSnapShot getRecentGameSnapShot() {
        int index = this.gameSnapShots.size() - 1;
        return this.gameSnapShots.get(index);
    }


//    public void restoreBackup(GameSnapShot gameSnapShot) {
//
//    }

}
