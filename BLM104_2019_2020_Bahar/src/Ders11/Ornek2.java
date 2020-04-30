/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            DatabaseMetaData dmd=con.getMetaData();
            System.out.println(dmd.getDatabaseProductName()+" "+dmd.getDatabaseProductVersion());
            
            Statement sCalisan=con.createStatement();
            ResultSet rsCalisan=sCalisan.executeQuery("SELECT  * FROM calisan");
            ResultSetMetaData rmd=rsCalisan.getMetaData();
            System.out.println(rmd.getTableName(1));
            for (int i = 1; i <= rmd.getColumnCount(); i++) {
                System.out.println(rmd.getColumnName(i)+" "+rmd.getColumnTypeName(i));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
}
