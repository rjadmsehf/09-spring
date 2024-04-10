package com.ohgiraffers.section02.initdestory.subsection02.annotation;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration                                  // 필기 나는 설정 파일입니다.
public class ContextConfiguration {

    @Bean
    public Product carpBread(){
        return new Bread("붕어빵",1000 ,new Date());
    }

    @Bean
    public Product milk(){
        return new Beverage("초코우유",1200,500);
    }
    @Bean
    public Product water() {
        return new Beverage("에비앙",10000,500);
    }

    /* 필기 기본적인 스코프는 싱글톤 !!
        하나의 인스턴만을 생성을 하고, 모든 빈이 해당 인스턴스를 공유한다.
     */
    @Bean
//    @Scope("singleton")
    /* prototype : getBean() 시에 매번 새로운 인스턴스를 생성해준다.  */

    @Scope("prototype")
    public ShoppingCart cart(){
        return new ShoppingCart();
    }

    @Bean(initMethod = "openShop" , destroyMethod = "closeShop")
    public Owner owner(){
        return new Owner();
    }




}
