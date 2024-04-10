package com.ohgiraffers.section01.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration      // 필기 설정파일 표기용도
@ComponentScan("com.ohgiraffers.section01.aop")     // 필기 설정파일 기준
@EnableAspectJAutoProxy(proxyTargetClass = true)   //필기  이유모름
public class ContextConfiguration {

}