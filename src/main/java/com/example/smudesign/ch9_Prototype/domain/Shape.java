package com.example.smudesign.ch9_Prototype.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter @Setter
public abstract class Shape {
    public int x;
    public int y;
    public String color;

    // 일반 생성자
    public Shape() {
    }

    // 프로토타입 생성자 : 전달받은 객체의 내용을 그대로 복사하는 역할
    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    // 복제 메서드
    public abstract Shape clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) return false;
        Shape shape2 = (Shape) object2;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}