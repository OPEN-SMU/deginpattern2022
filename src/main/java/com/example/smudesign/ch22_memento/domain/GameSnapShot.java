package com.example.smudesign.ch22_memento.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class GameSnapShot {

    private String savePointName;
    private LocalDateTime savedTime;
    private String level;

    @Builder
    public GameSnapShot(String savePointName,  String level) {
        this.savePointName = savePointName;
        this.savedTime = LocalDateTime.now();
        this.level = level;
    }

}
