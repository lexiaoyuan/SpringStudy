package com.ssm.controller;

import com.ssm.pojo.Books;
import com.ssm.service.BooksService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BooksController {
    // controller层调service层
    private BooksService booksService;

    public BooksController(@Qualifier("booksServiceImpl") BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping("/allBook")
    public String allBook(Model model){
        model.addAttribute("booksList", booksService.selectAllBook());
        return "allBook";  //allBook.jsp
    }

    //跳转到增加书籍页面
    @GetMapping("/toInsertBook")
    public String toInsertBook(){
        return "insertBook";  //insertBook.jsp
    }

    @PostMapping("/insertBook")
    public String insertBook(Books book){
        System.out.println("insertBook===>"+book);
        booksService.insertBook(book);
        return "redirect:/books/allBook"; //重定向到/books/allBook请求
    }

    //跳转到修改书籍页面
    @GetMapping("/toUpdateBook/{bookID}")
    public String toUpdateBook(@PathVariable("bookID") int bookID, Model model){
        model.addAttribute("updateBook", booksService.selectBookByBookID(bookID));
        return "updateBook";  //updateBook.jsp
    }

    @PostMapping("/updateBook/{bookID}")
    public String updateBook(@PathVariable("bookID") int bookID, Books book){
        book.setBookID(bookID);
        System.out.println("updateBook===>"+book);
        booksService.updateBook(book);
        return "redirect:/books/allBook"; //重定向到/books/allBook请求
    }

    @GetMapping("/deleteBook/{bookID}")
    public String deleteBook(@PathVariable("bookID") int bookID){
        booksService.deleteBookByBookID(bookID);
        return "redirect:/books/allBook"; //重定向到/books/allBook请求
    }

    @PostMapping("/searchBook")
    public String searchBook(String bookName, Model model){
        System.out.println("searchBook==>bookName:"+bookName);
        List<Books> booksList = booksService.selectBookByBookName("%"+bookName+"%"); //like语句不能再xml中拼接，要在这里拼接
        for (Books books : booksList) {
            System.out.println(books);
        }
        model.addAttribute("booksList", booksList);
        return "allBook";
    }

}
