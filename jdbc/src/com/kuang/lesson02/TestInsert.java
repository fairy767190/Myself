package com.kuang.lesson02;

import com.kuang.lesson02.utils.jdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement  state = null;
        ResultSet  resultSet = null;

        try {
           conn = jdbcUtils.getConnection();
           state = conn.createStatement();
           String sql = "delete  from users where id=1";

            int i = state.executeUpdate(sql);
            System.out.println(i);

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            jdbcUtils.release(conn,state,resultSet);

        }
    }
}
