/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billingwarnet.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class SQLiteJDBCDriverConnection {
     /**
     * Connect to a sample database
     * @param filename
     */
    
    private Connection conn = null;
    
    public SQLiteJDBCDriverConnection(String filename) {
        try {
            // db parameters
            String url = "jdbc:sqlite:"+filename;
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public Connection getConnection() {
        return conn;
    }
}
