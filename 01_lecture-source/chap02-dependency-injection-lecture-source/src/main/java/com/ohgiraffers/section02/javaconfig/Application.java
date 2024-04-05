package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        // 필기 자바 설정 파일  GenericXmlApplicationContext >>AnnotationConfigApplicationContext 으로바꿈
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);

        MemberDTO member = context.getBean(MemberDTO.class);

//        System.out.println("member = " + member);

        System.out.println("================자바=================");
        System.out.println(member.getPersonalAccount());                           // 계좌 잔액 확인 하기
        System.out.println(member.getPersonalAccount().deposit(1000000));   // 계좌에 입금하기
        System.out.println(member.getPersonalAccount().getBalance());              // 잔고 확인
        System.out.println(member.getPersonalAccount().withDraw(15000));    // 출금하기
        System.out.println(member.getPersonalAccount().getBalance());              // 잔고 확인

    }
}
