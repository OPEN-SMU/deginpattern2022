package com.example.smudesign.ch1.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// interface
class LoadableImplTest {

    private Loadable loadable;

    @BeforeEach
    void setUp() {
        loadable = new FileLoadImpl();
    }

    @Test
    void FileLoad() {
        loadable.Load();
    }

    @Test
    void DbLoad() {
        loadable = new DbLoadImpl();
        loadable.Load();
    }
}
