package com.kuang.lesson02.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcUtils_c3p0 {

    private static ComboPooledDataSource dataSource;

    static {
        try {
            
            // 创建数据源
             dataSource = new ComboPooledDataSource();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();//从数据源中获取链接
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
