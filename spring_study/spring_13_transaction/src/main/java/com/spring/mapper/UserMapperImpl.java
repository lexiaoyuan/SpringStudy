package com.spring.mapper;

import com.spring.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {

    public List<User> selectUserAll() {

        User user = new User(8, "事务", "transaction");

        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);

        mapper.insertUser(user);
        mapper.deleteUser(4);

        return mapper.selectUserAll();
    }

    public int insertUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).insertUser(user);
    }

    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
