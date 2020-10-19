package com.spring.mapper;

import com.spring.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {

    //MyBatis使用SqlSession，在MyBatis-Spring中改为SqlSessionTemplate替代
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUserAll() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUserAll();
    }
}
