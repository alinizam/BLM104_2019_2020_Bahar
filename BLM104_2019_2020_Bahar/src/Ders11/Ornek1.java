/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11;

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
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            con.setAutoCommit(false);
            Statement sCalisan=con.createStatement();
            int sonucCalisan=sCalisan.executeUpdate("INSERT INTO calisan (calisan_id,adi,soyadi,unvan_id) VALUES (26,'AYŞE','YEŞİL',3)");
            Statement sUnvan=con.createStatement();
            int sonucUnvan=sCalisan.executeUpdate("INSERT INTO unvan(unvan_id,unvan_adi) VALUES (3,'MEMUR')");
            con.commit();
        } catch (SQLException ex) {
            Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
