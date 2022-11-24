package com.example.smudesign.ch9_Prototype.service;

import com.example.smudesign.ch9_Prototype.domain.Circle;
import com.example.smudesign.ch9_Prototype.domain.Person;
import com.example.smudesign.ch9_Prototype.domain.Shape;
import com.example.smudesign.ch9_Prototype.domain.ShapeRegistry;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CloneService {

    private final ShapeRegistry registry;

    public Shape cloneShape(Shape shape) {
        return shape.clone();
    }

    public Shape cloneByRegistry(String key){
        return registry.get(key);
    }

    public void addShapeRegistry(String key, Shape shape){
        registry.put(key, shape);
    }

    public Person clonePerson(Person person) throws CloneNotSupportedException {
        return person.clone();
    }
}
