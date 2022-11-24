package com.example.smudesign.ch9_Prototype.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Circle extends Shape{
    private int radius;

    // 일반 생성자
    public Circle() {
    }

    // 프로토타입 생성자
    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
        Circle shape2 = (Circle) object2;
        return shape2.radius == radius;
    }
}
