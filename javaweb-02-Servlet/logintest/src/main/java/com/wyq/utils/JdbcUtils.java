package com.wyq.utils;


import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {

    private static DataSource ds;

    static {

        try {

        Properties pro = new Properties();

        InputStream in = JdbcUtils.class.getClassLoader().getResourceAsStream("druid.properties");


         pro.load(in);

            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }



    }


    public static DataSource getDs(){
        return ds;
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
