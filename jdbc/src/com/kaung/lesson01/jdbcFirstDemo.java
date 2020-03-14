package com.kaung.lesson01;

import java.sql.*;

public class jdbcFirstDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1. 加载驱动
           // DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Class.forName("com.mysql.jdbc.Driver");
        //2. 用户信息 和 url
        String url="jdbc:mysql://localhost:3306/jdbcstudy?useUnicode=true&characterEncoding=utf8&useSSL=true";
        String username = "root";
        String password = "123456";

        //3. 连接成功 , 数据库对象

        Connection connection = DriverManager.getConnection(url, username, password);
        // 4. 执行 SQL 对象
        Statement statement = connection.createStatement();
        //5. 执行 SQL 对象 执行sql
        String sql = "select * from users";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            System.out.println("id= " + resultSet.getInt("id"));
            System.out.println("name= " + resultSet.getString("name"));


        }

        // 6. 释放连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}
