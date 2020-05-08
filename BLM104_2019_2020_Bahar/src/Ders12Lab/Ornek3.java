/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12Lab;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek3 {

    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("c:\\dosyalar\\Fatihkelime.txt");
            int c;
            while ((c = fr.read()) != -1) {
                if (Character.isUpperCase((char)c)) {
                    System.out.print((char)c);
                }
            }
            System.out.println("");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek3.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Ornek3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
