package com.ohgiraffers.section01.aop;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MemberDTO {                //필기 값을 불러와서 읽는역할

    private  Long id;
    private  String name;
}
