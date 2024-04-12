package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = 
                new AnnotationConfigApplicationContext(ContextConfiguration.class);
        //필기 자바 형식의 설정을 가져오는 방법
//        MemberDTO member = context.getBean(MemberDTO.class);

        MemberDTO member = context.getBean("getMember", MemberDTO.class);  //필기 명시하지 않으면 같은 패키지구조의 빈들을 가져옴

        System.out.println("member = " + member);

    }

}
