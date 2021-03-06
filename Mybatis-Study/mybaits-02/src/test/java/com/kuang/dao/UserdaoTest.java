package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserdaoTest {

    static Logger logger = Logger.getLogger(UserdaoTest.class);
@Test
    public void test(){

    SqlSession sqlSession =   MybatisUtils.getSqlSession();

    UserMapper mapper = sqlSession.getMapper(UserMapper.class);

    List<User> userList = mapper.getUserList();

    for (User user : userList) {
        System.out.println(user);
    }

    sqlSession.close();
}

@Test
    public void test2(){
    SqlSession sqlSession =   MybatisUtils.getSqlSession();

    UserMapper mapper = sqlSession.getMapper(UserMapper.class);

    User userById = mapper.getUserById(2);

    System.out.println(userById);

    sqlSession.close();

}


@Test
    public void insert(){

    SqlSession sqlSession =   MybatisUtils.getSqlSession();

    UserMapper mapper = sqlSession.getMapper(UserMapper.class);

    int addUser = mapper.addUser(new User(4, "wangyuqi", "1234"));

    System.out.println(addUser);

    sqlSession.commit();
    sqlSession.close();



}


    @Test
    public void getUserByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("beginIndex",0);
        map.put("pageSize",2);

        List<User> users = mapper.getUserByLimit(map);

        for (User user:users) {
            System.out.println(user);
        }



        sqlSession.close();
    }

}
