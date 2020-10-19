package com.ssm.service;

import com.ssm.dao.BooksMapper;
import com.ssm.pojo.Books;

import java.util.List;

public class BooksServiceImpl implements BooksService {

    private BooksMapper booksMapper;

    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    public int insertBook(Books book) {
        return booksMapper.insertBook(book);
    }

    public int deleteBookByBookID(int bookID) {
        return booksMapper.deleteBookByBookID(bookID);
    }

    public int updateBook(Books book) {
        return booksMapper.updateBook(book);
    }

    public Books selectByBookID(int bookID) {
        return booksMapper.selectByBookID(bookID);
    }

    public List<Books> selectAllBooks() {
        return booksMapper.selectAllBooks();
    }
}
