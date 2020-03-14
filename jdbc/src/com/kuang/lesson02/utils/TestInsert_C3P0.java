package com.kuang.lesson02.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert_C3P0 {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement  state = null;
        ResultSet  resultSet = null;

        try {
           conn = jdbcUtils_c3p0.getConnection();
           state = conn.createStatement();
           String sql = "select *   from users where id=5";

            ResultSet result = state.executeQuery(sql);

            while(result.next()){
                String name = result.getString("name");
                System.out.println(name);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            jdbcUtils_c3p0.release(conn,state,resultSet);

        }
    }
}
