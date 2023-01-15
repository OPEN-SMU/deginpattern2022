package com.example.smudesign.ch18_chain.filter;

import org.junit.jupiter.api.Test;

public class PriceFilterTest {


    @Test
    void PriceFilterCreate() {
        PriceFilter priceFilter = new PriceFilter();
        priceFilter.process(null);
    }
}
