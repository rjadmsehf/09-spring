package com.ohgiraffers.section02.annotation.subsection01.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgiraffers.section02");

        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames){
            System.out.println(beanName);
        }

        AnimalService animalService = context.getBean("animalPrimary",AnimalService.class);

        animalService.animalEat(); // 필기 animalPrimary 등록한놈 출력하는 구문


    }


}
