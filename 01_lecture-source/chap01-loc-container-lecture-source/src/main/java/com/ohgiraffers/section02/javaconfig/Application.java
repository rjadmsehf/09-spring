package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);   // 필기 자바 방식

        MemberDTO member = context.getBean(MemberDTO.class);

//        MemberDTO

        System.out.println("member = " + member);
    }
}
