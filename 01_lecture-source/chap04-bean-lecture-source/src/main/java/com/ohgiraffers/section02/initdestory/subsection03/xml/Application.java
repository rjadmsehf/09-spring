package com.ohgiraffers.section02.initdestory.subsection03.xml;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import com.ohgiraffers.section02.initdestory.subsection02.prototype.ContextConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context =
                new GenericGroovyApplicationContext("section02/initdestory/subsection03/xml/spring-context.xml");

        String[] beanNAme = context.getBeanDefinitionNames();
        for (String bean : beanNAme){
            System.out.println("bean = " + bean);
        }

        Product carpBread = context.getBean("carpBread", Bread.class);      //필기 빈 등록하기
        Product milk = context.getBean("milk", Beverage.class);
        Product water = context.getBean("water", Beverage.class);

        ShoppingCart cart1 = context.getBean("cart" , ShoppingCart.class);

        cart1.addItem(carpBread);           //필기 addItem 으로 cart1 에 넣어주기
        cart1.addItem(milk);
//        cart1.addItem(water);
        System.out.println("cart1 가지고 있는 상품 : " + cart1.getItems());

        ShoppingCart cart2 = context.getBean("cart",ShoppingCart.class);
        cart2.addItem(water);
//        cart2.addItem(milk);                                      //필기 해본겨
        System.out.println("cart2 가지고 있는 상품 : " + cart2.getItems());            //필기 카트 1 에서 가지고있던 값도 포함하고 있다. !

        System.out.println("cart1 의 hashcode : " + cart1.hashCode());               //필기 hashCode 상으로도 동일한 위치라는것을 알수있다. 싯팔
        System.out.println("cart2 의 hashcode : " + cart2.hashCode());


        /* 필기.
            init 메소드는 bean 객체 생성 시점에 동작하므로 바로 확인할 수 있지만,
            destory 메소드는 bean 객체 소멸 시점에 동작하므로 컨테이너가 종료 되지
            않을 경우 확인할 수 없다.
            가비지 컬렉터가 해당 빈을 메모리에서 지월 때 destory 메소드가 동작하게 되는데
            메모리에서 지우기 전에 프로페스는 종료되기 때문이다.
            따라서 close() 메소드로 컨테이너를 강제로 종료시키면 destory 메소드가
            동작하게 되는 것이다.
         */

        ((GenericGroovyApplicationContext)context).close();

    }



}
