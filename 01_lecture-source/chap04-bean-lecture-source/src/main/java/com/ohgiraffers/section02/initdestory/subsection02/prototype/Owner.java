package com.ohgiraffers.section02.initdestory.subsection02.prototype;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Owner {


    /* inut-method 랑 같은 어노테이션 설정 방법이디.*/
    @PostConstruct
    public void openShop() {
        System.out.println("사장님이 가게를 열었습니다 . 이제 쇼핑을 즐겨봅시다 ");
    }
    /* destroy-method 랑 같은 어노테이션 설정 방법이다. */
    @PreDestroy
    public void closeShop() {
        System.out.println("사장님이 가게를 닫았습니다 . 이제 못즐김 ");
    }
}
