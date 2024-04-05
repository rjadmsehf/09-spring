package com.ohgiraffers.section01.autowired.subsection03.setter;

import com.ohgiraffers.section01.autowired.subsection03.setter.BookService;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {


    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        com.ohgiraffers.section01.autowired.subsection02.constructor.BookService bookService = context.getBean("ServiceSetter", com.ohgiraffers.section01.autowired.subsection02.constructor.BookService.class);

        List<BookDTO> books = bookService.selectAllBooks();
        for (BookDTO book : books){
            System.out.println("book = " + book);
        }

        System.out.println(bookService.searchBookBySequence(1));


    }
}
