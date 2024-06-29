/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.property;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author alohomora
 */
public class JavaConnect {
    Connection conn;
    public static Connection ConnectDB(){
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/trial", "root", "870372NS");
          return conn;
    }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
          return null;
      }
  
    }
    
}
