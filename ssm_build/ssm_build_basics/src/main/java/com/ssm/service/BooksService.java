package com.ssm.service;

import com.ssm.pojo.Books;

import java.util.List;

public interface BooksService {
    int insertBook(Books book);
    int deleteBookByBookID(int bookID);
    int updateBook(Books book);
    Books selectByBookID(int bookID);
    List<Books> selectAllBooks();
}
