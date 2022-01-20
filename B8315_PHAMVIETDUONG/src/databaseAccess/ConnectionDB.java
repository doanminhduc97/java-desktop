/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class ConnectionDB {
    static String url = "jdbc:sqlserver://localhost\\MSSQLSERVER02:1434;databaseName=DB_JDAD_Exam01";
    //jdbc:sqlserver://localhost\\MSSQLSERVER02
    static String use = "duong";
    static String pass = "duong1234$";
    public static Connection getConnet() throws ClassNotFoundException, SQLException{
        //load driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection(url, use, pass);
        return con;
    }
}
