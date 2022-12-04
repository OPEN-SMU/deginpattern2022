package com.example.smudesign.ch13_Composite;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class OrderService {

    private final Box box;

    public void orderProduct(Component component){
        box.add(component);
        log.info("현재 총 " + box.getPrice() + "원이 주문되었습니다.");
    }

    public void cancelProduct(Component component){
        box.remove(component);
        log.info("현재 총 " + box.getPrice() + "원이 주문되었습니다.");
    }
}
