package com.ohgiraffers.section01.autowired.subsection02.constructor;

import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        BookService bookService = context.getBean("ServiceConstructor", BookService.class);

        List<BookDTO> books = bookService.selectAllBooks();
        for (BookDTO book : books){
            System.out.println("book = " + book);
        }                                                           // 필기 bookDTO 에 등록된 모든 정보 출력하기

        System.out.println("하나씩 = " + bookService.searchBookBySequence(1));    //필기 bookDTO 가져올 정보 1번을 출력하기


    }
}