package com.ssm.dao;

import com.ssm.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksMapper {
    int insertBook(Books book);
    int deleteBookByBookID(@Param("bookID") int bookID);
    int updateBook(Books book);
    Books selectByBookID(@Param("bookID") int bookID);
    List<Books> selectAllBooks();
}
