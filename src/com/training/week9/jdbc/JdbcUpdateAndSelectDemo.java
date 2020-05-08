package com.training.week9.jdbc;

import java.sql.*;

public class JdbcUpdateAndSelectDemo {
    private static final String DB_DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static final String DB_USERNAME = "scott";
    private static final String DB_PASSWORD = "tiger";

    public static void main(String[] args) throws Exception {
        Class.forName(DB_DRIVER_CLASS);
        Connection conn = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);

        //Update
        Statement stmt = conn.createStatement();
        String strUpdate = "UPDATE EMPLOYEE SET EMP_NAME = 'EMP2' WHERE EMP_NAME = 'EMP2'";
        int countUpdated = stmt.executeUpdate(strUpdate);
        System.out.println(countUpdated + " records affected.\n");

        //Select
        String strSelect = "SELECT * FROM EMPLOYEE";
        ResultSet resultSet = stmt.executeQuery(strSelect);
        while (resultSet.next()) {
            System.out.println(
                    "Employee Id: " + resultSet.getInt(1) +
                            "Employee Name: " + resultSet.getString(2) +
                            "Department Id: " + resultSet.getInt(3)
            );
        }
    }
}