package com.example.smudesign.ch18_chain.filter;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class BaseFilterTest {

    @Test
    void BaseFilterCreateTest(){
        BaseFilter baseFilter = mock(BaseFilter.class,withSettings().useConstructor().defaultAnswer(CALLS_REAL_METHODS));
        baseFilter.process(null);
    }

    @Test
    void MultiFilterCreateTest(){
        IpFilter ipFilter = new IpFilter();
        PriceFilter priceFilter = new PriceFilter();
        ipFilter.setNextfilter(priceFilter);
        ipFilter.process(null);
    }
}
