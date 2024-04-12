package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //필기 설정파일라는 걸 표시하는 어노테이션
public class ContextConfiguration {

    @Bean
    public MemberDTO getMember() {

        return new MemberDTO(1, "user01", "pass01", "전준규");
    }

}
