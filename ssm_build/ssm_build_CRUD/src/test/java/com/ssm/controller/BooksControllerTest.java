package com.ssm.controller;

import com.ssm.pojo.Books;
import com.ssm.service.BooksService;
import com.ssm.service.BooksServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BooksControllerTest {
    @Test
    public void allBooksTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BooksService bookService = context.getBean("booksServiceImpl", BooksServiceImpl.class);
        for (Books book : bookService.selectAllBook()) {
            System.out.println(book);
        }
    }
}
