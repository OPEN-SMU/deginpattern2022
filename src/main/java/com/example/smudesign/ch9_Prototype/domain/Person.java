package com.example.smudesign.ch9_Prototype.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Person implements Cloneable{

    private String name;
    private int age;

    // 일반 생성자
    public Person() {
    }

    // 복제 생성자
    public Person(Person target) {
        this.name = target.name;
        this.age = target.age;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        return new Person(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false;

        Person person = (Person) obj;
        return (person.age == age) && (person.name.equals(name));
    }
}
