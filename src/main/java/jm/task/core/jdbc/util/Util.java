package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
     private static final String URL = "jdbc:mysql://localhost:3306/baza1";
     private static final String USER = "root";
     private static final String PWORD = "root";

     private Util() {}
     public static Connection getConnection() throws SQLException {
         return DriverManager.getConnection(URL, USER, PWORD);
     }
}
