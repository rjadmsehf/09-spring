package com.ohgiraffers.section03.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //필기 설정파일 표기
@ComponentScan(basePackages = "com.ohgiraffers") //필기 베이스 패키지 안에 있는 모든 빈들을 찾으라는 코드
public class ContextConfiguration {



}
