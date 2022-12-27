/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chudi;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author chudi
 */
public class Connectionz {
    static Connection con;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
        } catch (Exception e) {
            System.out.println(""+e);
        }
        return con;
    }
    
}
