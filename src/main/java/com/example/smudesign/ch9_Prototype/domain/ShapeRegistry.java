package com.example.smudesign.ch9_Prototype.domain;

import java.util.HashMap;
import java.util.Map;

public class ShapeRegistry {
    private Map<String, Shape> cache = new HashMap<>();

    public ShapeRegistry() {

    }

    public Shape put(String key, Shape shape) {
        cache.put(key, shape);
        return shape;
    }

    public Shape get(String key) {
        return cache.get(key).clone();
    }
}
