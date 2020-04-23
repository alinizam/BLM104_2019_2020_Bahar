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
public class Ornek6 {
    public static void main(String[] args) {
        Connection con=null;
        PreparedStatement sUpdate=null;
        PreparedStatement sInsert=null;
        
        try {
            //Insert
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
            con.setAutoCommit(false);
            String id="KALEM";
            int satilanMiktar=1000;
            String sqlUpdate="UPDATE urun SET toplam_adet=toplam_adet-? WHERE urun_id=?";
            sUpdate=con.prepareStatement(sqlUpdate);
            sUpdate.setInt(1, satilanMiktar);
            sUpdate.setString(2, id);
            System.out.println(sqlUpdate);
            sUpdate.executeUpdate();
            
            int faturaId=1;
            String sqlInsert="INSERT INTO fatura (f_id,u_id,adet) VALUES (?,?,?)";
            sInsert=con.prepareStatement(sqlInsert);
            sInsert.setInt(1, faturaId);
            sInsert.setString(2, id);
            sInsert.setInt(3, satilanMiktar);
            System.out.println(sInsert);
            sInsert.executeUpdate();
         
            con.commit();
        } catch (SQLException ex) {
            Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
