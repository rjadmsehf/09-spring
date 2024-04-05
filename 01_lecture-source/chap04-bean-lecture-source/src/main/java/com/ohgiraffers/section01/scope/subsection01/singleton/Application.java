package com.ohgiraffers.section01.scope.subsection01.singleton;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] beanNAme = context.getBeanDefinitionNames();
        for (String bean : beanNAme){
            System.out.println("bean = " + bean);
        }

        Product carpBread = context.getBean("carpBread", Bread.class);           //필기. 빈 등록하기
        Product milk = context.getBean("milk", Beverage.class);
        Product water = context.getBean("water", Beverage.class);

        ShoppingCart cart1 = context.getBean("cart" , ShoppingCart.class);

        cart1.addItem(carpBread);           //필기. addItem 으로 cart1 에 넣어주기
        cart1.addItem(milk);
//        cart1.addItem(water);
        System.out.println("cart1 가지고 있는 상품 : " + cart1.getItems());

        ShoppingCart cart2 = context.getBean("cart",ShoppingCart.class);
        cart2.addItem(water);
//        cart2.addItem(milk);                                                       //필기. 해본겨
        System.out.println("cart2 가지고 있는 상품 : " + cart2.getItems());            //필기. 카트 1 에서 가지고있던 값도 포함하고 있다. !

        System.out.println("cart1 의 hashcode : " + cart1.hashCode());               //필기. hashCode 상으로도 동일한 위치라는것을 알수있다. 싯팔
        System.out.println("cart2 의 hashcode : " + cart2.hashCode());
    }

}
