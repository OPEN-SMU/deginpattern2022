package com.example.smudesign.ch18_chain.filter;

import com.example.smudesign.ch18_chain.domain.Order;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IpFilter extends  BaseFilter{
    @Override
    public void handle(Order order) {
        if (order == null){
            log.info("order.ip is null");
            return;
        }

       if (order.getIp().equals("127.0.0.1")) {
           log.info("ip same");
       }else{
           log.info("ip not same");
       }
    }
}
