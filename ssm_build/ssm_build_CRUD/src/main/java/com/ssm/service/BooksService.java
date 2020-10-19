package com.ssm.service;

import com.ssm.pojo.Books;

import java.util.List;

public interface BooksService {
    //增加一本书
    int insertBook(Books book);
    //删除一本书
    int deleteBookByBookID(int bookID);
    //修改一本书
    int updateBook(Books book);
    //通过bookID查询一本书
    Books selectBookByBookID(int bookID);
    //查询所有书
    List<Books> selectAllBook();

    //通过bookName查询书籍
    List<Books> selectBookByBookName(String bookName);
}
