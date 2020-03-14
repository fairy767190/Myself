package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void getUserList(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

//        List<User> userList = mapper.getUserList();

        List<User> users = mapper.getUserByIdAndName(1, "狂神");

        for (User user : users) {
            System.out.println(user);
        }


        sqlSession.close();


    }
}
