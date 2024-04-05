package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration                  //필기.  << 나는 설정파일이야 이런느낌의 표식
public class ContextConfiguration {

    @Bean               //필기 << bean 에 이름을 정해줄수 있다
    public MemberDTO getMember() {

        return new MemberDTO(1,"user01","pass01","전준규");

    }






}
