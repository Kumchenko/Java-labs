package edu.ntudp.fit.contoller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbManager {
    private static Connection DbConnection;
    private DbManager() {}
    public static Connection getDbConnection() throws SQLException {
        if (DbConnection == null) {
            DbConnection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "postgres",
                    "qwerty"
            );
        }
        return DbConnection;
    }
}
