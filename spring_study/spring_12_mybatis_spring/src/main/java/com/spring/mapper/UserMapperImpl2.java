package com.spring.mapper;

import com.spring.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * SqlSessionDaoSupport 是一个抽象的支持类，用来为你提供 SqlSession。
 * 调用 getSqlSession() 方法你会得到一个 SqlSessionTemplate，之后可以用于执行 SQL 方法.
 * 可以不用私有声明private SqlSessionTemplate sqlSession;
 */

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper
{
    public List<User> selectUserAll() {
        return getSqlSession().getMapper(UserMapper.class).selectUserAll();
    }
}
