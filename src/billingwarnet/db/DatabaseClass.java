/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billingwarnet.db;

import java.sql.Connection;

/**
 *
 * @author zak
 */
public class DatabaseClass {
    Connection con1;
    
    public DatabaseClass(String filename) {
        con1 = new SQLiteJDBCDriverConnection(filename).getConnection();
    }
}
