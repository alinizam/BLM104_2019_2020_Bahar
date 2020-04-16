/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09;

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
public class Ornek2 {

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM calisan");
            while (rs.next()) {
                System.out.println(rs.getInt("calisan_id") + " " + rs.getString("adi"));
            }
            System.out.println("Bağlandı");
        } catch (SQLException ex) {
            Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
