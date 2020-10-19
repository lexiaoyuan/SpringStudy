package com.ssm.service;

import com.ssm.dao.BooksMapper;
import com.ssm.pojo.Books;

import java.util.List;

public class BooksServiceImpl implements BooksService {
    //service层调用dao层
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

    public Books selectBookByBookID(int bookID) {
        return booksMapper.selectBookByBookID(bookID);
    }

    public List<Books> selectAllBook() {
        return booksMapper.selectAllBook();
    }

    public List<Books> selectBookByBookName(String bookName) {
        return booksMapper.selectBookByBookName(bookName);
    }
}
