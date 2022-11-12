package com.example.smudesign.ch1.service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final Loadable loadable;

    @Override
    public void Load() {
        loadable.Load();
    }

}
