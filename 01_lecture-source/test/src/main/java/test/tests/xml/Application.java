package test.tests.xml;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import test.common.DTO;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context =
                new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");

        DTO member = context.getBean(DTO.class);

        //       System.out.println("member = " + member);

        System.out.println("===============xml 방식 ==================");
        System.out.println(member.getPersonalAccount());            // 계좌 잔액 확인 하기
        System.out.println(member.getPersonalAccount().deposit(1000000));   // 계좌에 입금하기
        System.out.println(member.getPersonalAccount().getBalance());               // 잔고 확인
        System.out.println(member.getPersonalAccount().withDraw(15000));   // 출금하기
        System.out.println(member.getPersonalAccount().getBalance());              // 잔고 확인

    }

}
