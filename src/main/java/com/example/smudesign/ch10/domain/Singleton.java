package com.example.smudesign.ch10.domain;

public class Singleton {
    // private 생성자 new 를 통한 인스턴스 생성 방지
    private static Singleton instance;
    private Singleton() {
        System.out.println("싱글톤 인스턴스 생성");
    }
    public static Singleton getInstance() {
        System.out.println("index ! " );
        if(instance == null) { // 1번 : 쓰레드가 동시 접근시 문제
            instance = new Singleton(); // 2번 : 쓰레드가 동시 접근시 인스턴스 여러번 생성
        }
        return instance;
    }
//    // 정적 메서드를 통해 내부 클래스 로딩
//    public static Singleton getInstance() {
//        return LazyHolder.INSTANCE;
//    }
//
//    // 내부 클래스가 로딩될때 초기화 수행 - 싱글톤 인스턴스 생성
//    private static class LazyHolder {
//        private static final Singleton INSTANCE = new Singleton();
//    }
}
