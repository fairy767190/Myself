package com.kuang.lesson02.utils;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class jdbcUtils_dbcp {

    private static DataSource dataSource;

    static {
        try {
            InputStream in = jdbcUtils_dbcp.class.getClassLoader().getResourceAsStream("jdbc.properties");
            Properties pro = new Properties();
            pro.load(in);
            
            // 创建数据源
             dataSource = BasicDataSourceFactory.createDataSource(pro);
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
