package com.example.smudesign.ch18_chain.filter;

import com.example.smudesign.ch18_chain.domain.Order;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PriceFilter extends BaseFilter{
    @Override
    public void handle(Order order) {
        if (order == null){
            log.info("order.price is null");
        }else{
            if(order.getPrice() > 5){
                log.info("order is very expensive");
            }else{
                log.info("order is very cheap");
            }
        }
    }
}
