package com.example.smudesign.ch10;

import com.example.smudesign.ch10.domain.Once;
import com.example.smudesign.ch10.domain.Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args){
//        // 1. 스레드 풀 생성
        ExecutorService service = Executors.newCachedThreadPool();
        Once singleTonOnce = new Once();
//        // 2. 반복문을 통해 - 10개의 스레드가 동시에 인스턴스 생성
        for (int i = 0; i < 100; i++) {
            service.submit(() -> {
                singleTonOnce.run(() -> Singleton.getInstance());
            });
        }
//        // 3. 종료
        service.shutdown();
    }
}
