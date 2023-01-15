package com.example.smudesign.ch18_chain.filter;

import com.example.smudesign.ch18_chain.domain.Order;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class BaseFilter {
    private BaseFilter nextfilter;


    public final void process(Order order) {
        handle(order);
        if (nextfilter != null){
            nextfilter.process(order);
        }else{
            log.info("nextFilter not exist");
        }
    }

    public abstract void handle(Order order);

    public final BaseFilter setNextfilter(BaseFilter nextfilter) {
        this.nextfilter = nextfilter;
        return nextfilter;
    }


}
