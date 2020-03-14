package com.wyq.dao;

import com.wyq.domain.user;
import com.wyq.utils.JdbcUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JdbcUtils.getDs());




    public user login(user loginuser){
        String sql = "select * from user where username = ? and password = ?";

        user user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<user>(user.class),
                loginuser.getName(), loginuser.getPassword()
        );
        return user;
    }
}
