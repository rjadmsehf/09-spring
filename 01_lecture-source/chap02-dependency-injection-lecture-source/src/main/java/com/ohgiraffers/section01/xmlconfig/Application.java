package com.ohgiraffers.section01.xmlconfig;


import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.section02.javaconfig.ContextConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context =
                new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");

        MemberDTO member = context.getBean(MemberDTO.class);

        //       System.out.println("member = " + member);

        System.out.println("===============xml 방식 ==================");
        System.out.println(member.getPersonalAccount());            // 계좌 잔액 확인 하기
        System.out.println(member.getPersonalAccount().deposit(1000000));   // 계좌에 입금하기
        System.out.println(member.getPersonalAccount().getBalance());               // 잔고 확인
        System.out.println(member.getPersonalAccount().withDraw(15000));   // 출금하기
        System.out.println(member.getPersonalAccount().getBalance());              // 잔고 확인

    }

}
