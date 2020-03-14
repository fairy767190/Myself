package com.kuang.lesson02.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert_DBCP {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement  state = null;
        ResultSet  resultSet = null;

        try {
           conn = jdbcUtils_dbcp.getConnection();
           state = conn.createStatement();
           String sql = "delete  from users where id=2";

            int i = state.executeUpdate(sql);
            System.out.println(i);

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            jdbcUtils_dbcp.release(conn,state,resultSet);

        }
    }
}
