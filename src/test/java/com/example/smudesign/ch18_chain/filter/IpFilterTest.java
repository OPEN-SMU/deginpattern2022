package com.example.smudesign.ch18_chain.filter;

import org.junit.jupiter.api.Test;

public class IpFilterTest {

    @Test
    void IpFilterCreateTest(){
        IpFilter ipFilter = new IpFilter();
        ipFilter.process(null);
    }
}
