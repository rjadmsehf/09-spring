package test.tests2.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.common.DTO;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);
        DTO meber = context.getBean(DTO.class);

        System.out.println(meber.getPersonalAccount());
        System.out.println(meber.getPersonalAccount().deposit(100000));
        System.out.println(meber.getPersonalAccount().getBalance());
        System.out.println(meber.getPersonalAccount().withDraw(50000));
        System.out.println(meber.getPersonalAccount().getBalance());
    }
}
