package com.example.smudesign.ch9_Prototype.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Rectangle extends Shape {
    private int width;
    private int height;

    // 일반 생성자
    public Rectangle() {
    }

    // 복제 생성자
    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    // 복제 메서드를 override
    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle) || !super.equals(object2))
            return false;

        Rectangle shape2 = (Rectangle) object2;
        return shape2.width == width && shape2.height == height;
    }
}
