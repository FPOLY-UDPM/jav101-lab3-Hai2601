package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String URL =
            "jdbc:sqlserver://localhost:1433;databaseName=QLSV;encrypt=false";

    private static final String USER = "sa"; // đổi theo máy bạn
    private static final String PASS = "1234"; // đổi theo máy bạn

    public static Connection getConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
