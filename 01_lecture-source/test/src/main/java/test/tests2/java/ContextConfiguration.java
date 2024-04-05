package test.tests2.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import test.common.Account;
import test.common.DTO;
import test.common.perAccount;

@Configuration
public class ContextConfiguration {
    @Bean
    public Account account() {

        return new perAccount(10, "123-5678-91011");
    }


    @Bean
    public DTO member() {
//        // 필기 생성자를 통한 주입
//        return new MemberDTO(1,"전준규","010-2495-8782","jjg524@naver.com", account());
//    }

        //필기  setter 주입
        DTO member = new DTO();
        member.setSequence(1);
        member.setName("전준규");
        member.setPhone("010");
        member.setEmail("123");
        member.setPersonalAccount(account());

        return member;
    }
}
