package com.ohgiraffers.common;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
// @Data <- x
public class MemberDTO {

    private int sequence;   // 회원 번호
    private String id;      // 아이디
    private String pwd;     // 비밀번호
    private String name;    // 이름

}
