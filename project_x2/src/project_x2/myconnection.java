/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_x2;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Cyril M Rudy
 */
public class myconnection {
   Connection con = null;
   public static Connection ConnectDb(){
   try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/game", "root", "");
             return con;
       } 
    catch (Exception ex) {
           JOptionPane.showMessageDialog(null,"Server not connected!");
           return null;
       }
       
   }
    
}
