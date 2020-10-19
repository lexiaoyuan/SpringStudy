package com.spring.mapper;

import com.spring.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUserAll();

    int insertUser(User user);

    int deleteUser(int id);
}
