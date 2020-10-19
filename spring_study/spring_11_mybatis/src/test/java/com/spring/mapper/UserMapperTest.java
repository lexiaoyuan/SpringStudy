package com.spring.mapper;

import com.spring.pojo.User;
import com.spring.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void selectUserAllTest(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> users = mapper.selectUserAll();
        for (User user : users) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
