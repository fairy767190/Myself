package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from mybatis.user")
    List<User> getUserList();
    @Select("select * from user where id =#{id} and name = #{name}")
    List<User> getUserByIdAndName(@Param("id") int id , @Param("name") String name );

}
