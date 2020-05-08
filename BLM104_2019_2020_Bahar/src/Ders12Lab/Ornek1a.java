/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12Lab;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek1a {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try {
            String s="Fatih Sultan Mehmet";
            fos = new FileOutputStream("c:\\dosyalar\\Fatih.txt");
            for (int i = 0; i < s.length(); i++) {
                fos.write(s.charAt(i));
                fos.write('\n');
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek1a.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek1a.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Ornek1a.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
