package com.kuang.lesson02.utils;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class jdbcUtils {
    private static String driver   = null;
    private static String url      = null;
    private static String username = null;
    private static String password = null;

    static {
        try {
            InputStream in = jdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            Properties pro = new Properties();
            pro.load(in);

            driver = pro.getProperty("driver");
            url    = pro.getProperty("url");
            username = pro.getProperty("username");
            password = pro.getProperty("password");

            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,username,password);
    }

    public static void release(Connection connection, Statement state, ResultSet result) throws SQLException {
        if (result!=null){
            result.close();
        }
        if (state!=null){
            state.close();
        }
        if (connection!=null){
            connection.close();
        }

    }
}
