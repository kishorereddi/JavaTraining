package com.training.week9.jdbc;

import java.sql.*;

public class JDBCFirstExample {
    private static final String DB_DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static final String DB_USERNAME = "scott";
    private static final String DB_PASSWORD = "tiger";

    public static void main(String[] args) throws Exception {
        Class.forName(DB_DRIVER_CLASS);
        Connection connection = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM EMPLOYEE");
        while (resultSet.next()) {
            System.out.println(
                    "Employee Id: " + resultSet.getInt(1) + "Employee Name: " + resultSet.getString(2) +
                            "Department Id: " + resultSet.getInt(3)
            );
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
}
