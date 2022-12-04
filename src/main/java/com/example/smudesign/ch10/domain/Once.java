package com.example.smudesign.ch10.domain;

import java.util.concurrent.atomic.AtomicBoolean;

public class Once {
    private final AtomicBoolean done = new AtomicBoolean();
    public void run(Runnable task) {
        if (done.get()) {
            System.out.println("이미 호출됨!!");
            return;
        }
        if (done.compareAndSet(false, true)) {
            System.out.println("done 호출");
            task.run();
        }
    }
}
