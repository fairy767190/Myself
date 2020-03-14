package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<User> getUserList();

    User getUserById(int id);

    int addUser(User user);

    List<User> getUserByLimit(Map<String, Integer> map);
}
