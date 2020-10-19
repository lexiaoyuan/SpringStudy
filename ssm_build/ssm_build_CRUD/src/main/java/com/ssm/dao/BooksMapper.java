package com.ssm.dao;

import com.ssm.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksMapper {
    //增加一本书
    int insertBook(Books book);
    //删除一本书
    int deleteBookByBookID(@Param("bookID") int bookID);
    //修改一本书
    int updateBook(Books book);
    //通过bookID查询一本书
    Books selectBookByBookID(@Param("bookID") int bookID);
    //查询所有书
    List<Books> selectAllBook();

    //通过bookName查询书籍
    List<Books> selectBookByBookName(@Param("bookName") String bookName);
}
