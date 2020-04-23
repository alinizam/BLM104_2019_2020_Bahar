/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek4 {
    public static void main(String[] args) {
        Connection con=null;
        PreparedStatement s=null;
        ResultSet rs=null;
        try {
            //Insert
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
            int id=8;
            int maas=5000;
            String sql="UPDATE calisan SET maas=? WHERE calisan_id=?";
            s=con.prepareStatement(sql);
            s.setInt(1, maas);
            s.setInt(2, id);
            System.out.println(sql);
            s.executeUpdate();
         } catch (SQLException ex) {
            Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
