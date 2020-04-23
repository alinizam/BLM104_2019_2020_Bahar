/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        Connection con=null;
        Statement s=null;
        ResultSet rs=null;
        try {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
            s=con.createStatement();
            rs=s.executeQuery("select * from calisan");
            while (rs.next()){
                System.out.println(rs.getString("adi")+" "+rs.getString("soyadi")+" "+rs.getInt("maas"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                con.close();
                s.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
