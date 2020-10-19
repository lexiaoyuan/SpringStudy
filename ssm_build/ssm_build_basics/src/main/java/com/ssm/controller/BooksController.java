package com.ssm.controller;

import com.ssm.pojo.Books;
import com.ssm.service.BooksService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BooksController {

    private final BooksService booksService;

    public BooksController(@Qualifier("bookServiceImpl") BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping("/allBooks")
    public String allBooks(Model model){
        List<Books> booksList = booksService.selectAllBooks();
        model.addAttribute("booksList", booksList);
        return "allBooks";
    }

}
