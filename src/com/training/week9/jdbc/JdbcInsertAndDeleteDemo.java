package com.training.week9.jdbc;

import java.sql.*;

public class JdbcInsertAndDeleteDemo {
    private static final String DB_DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static final String DB_USERNAME = "scott";
    private static final String DB_PASSWORD = "tiger";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName(DB_DRIVER_CLASS);
        Connection conn = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);

        //Delete
        Statement stmt = conn.createStatement();
        String sqlDelete = "DELETE FROM EMPLOYEE WHERE EMP_ID=2";
        int countDeleted = stmt.executeUpdate(sqlDelete);
        System.out.println(countDeleted + " records deleted.\n");

        //Insert
        String sqlInsert = "INSERT INTO EMPLOYEE VALUES (99, 'Employee99', 2)";
        int countInserted = stmt.executeUpdate(sqlInsert);
        System.out.println(countInserted + " records inserted.\n");

        //Select
        ResultSet resultSet = stmt.executeQuery("SELECT * FROM EMPLOYEE");
        while (resultSet.next()) {
            System.out.println(
                    "Employee Id: " + resultSet.getInt(1) +
                            "Employee Name: " + resultSet.getString(2) +
                            "Department Id: " + resultSet.getInt(3)
            );
        }

        resultSet.close();
        stmt.close();
        conn.close();
    }
}