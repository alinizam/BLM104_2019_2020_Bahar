/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12Lab;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        BufferedWriter br=null;
        try {
            String s="Fatih Sultan Mehmet";
            String kelimeler[]=s.split(" ");
            br = new BufferedWriter(new FileWriter("c:\\dosyalar\\Fatihkelime.txt"));
            for (String kelime : kelimeler) {
                br.write(kelime);
                br.write('\n');
            }
        } catch (IOException ex) {
            Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
