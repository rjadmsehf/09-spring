package com.ohgiraffers.common;

import lombok.*;

//    @NoArgsConstructor
//    @AllArgsConstructor
//    @Getter
//    @Setter
//    @ToString
@Data    // 필기 윗놈들 5개 합친겨 오류나면 하나씩 입력하는거 추천!

public class MemberDTO {

    private int sequence;   // 코드
    private String name;    // 이름
    private String phone;   //전화번호
    private String email;   // 이메일

    private  Account personalAccount;            // 개인 계좌

}
