/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12Lab;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek1b {
     public static void main(String[] args) {
        FileWriter fr=null;
        try {
            String s="Fatih Sultan Mehmet";
            fr = new FileWriter("c:\\dosyalar\\FatihChar.txt");
            for (int i = 0; i < s.length(); i++) {
                fr.write(s.charAt(i));
                fr.write('\n');
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek1b.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek1b.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Ornek1b.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
