package com.training.week9.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDemo {
    private static final String DB_DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static final String DB_USERNAME = "scott";
    private static final String DB_PASSWORD = "tiger";

    public static void main(String[] args) throws Exception {
        Class.forName(DB_DRIVER_CLASS);
        Connection connection = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);

        String SQL = "UPDATE EMPLOYEE SET DEPT_ID = ? WHERE EMP_ID = ?";
        PreparedStatement pstmt = connection.prepareStatement(SQL);
        boolean updateStatus = pstmt.execute();
        if(updateStatus) {
            System.out.println("UPDATE COMPLETED!!");
        } else {
            System.out.println("UPDATE FAILED!!");
        }

        pstmt.close();
        connection.close();
    }
}
