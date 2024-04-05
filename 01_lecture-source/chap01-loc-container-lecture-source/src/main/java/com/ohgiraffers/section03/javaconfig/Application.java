package com.ohgiraffers.section03.javaconfig;

import com.ohgiraffers.common.MemberDAO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        /* 필기
            ComponentScan 이란?
            base package 로 설정 된 하위 경로에 특정 어노테이션을 가지고 있는
            클래스를 bean 으로 등록해주는 기능이다.
            @Component 어노테이션이 작성 된 클래스를 인식하여 bean 으로 등록해준다.
            목적에 따라서 세부 기능을 제공하는
            @Controller, @Service , @Repository, @Configuration 등을 사용한다. Component 안에 포함(이뜻1)
         */

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);
        
        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames){
            System.out.println("beanName = " + beanName);   // 필기. Component 를 통해(이뜻1)  beanName = dao  으로 출력되는 것은 정상적으로 등록 되어있기 때문이다.
        }

        MemberDAO memberDAO = context.getBean("dao", MemberDAO.class);

        System.out.println(memberDAO.findMemberBySequence(1));
        System.out.println(memberDAO.save(new MemberDTO(3,"user03", "pass03", "전준규")));
        System.out.println(memberDAO.findMemberBySequence(3));

    }
}
