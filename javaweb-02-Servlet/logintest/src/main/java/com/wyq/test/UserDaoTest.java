package com.wyq.test;

import com.wyq.dao.UserDao;
import com.wyq.domain.user;
import org.junit.jupiter.api.Test;


public class UserDaoTest {
    @Test
    public void test(){
        user user = new user();
        user.setName("hanxue");
        user.setPassword("123456");

        UserDao userDao = new UserDao();
        user login = userDao.login(user);

        System.out.println(user);


    }
}
