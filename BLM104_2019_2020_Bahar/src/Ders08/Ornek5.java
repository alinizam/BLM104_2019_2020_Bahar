/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek5 {
    public static void main(String[] args) {
        try {
            dosyaOku();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static void dosyaOku() throws FileNotFoundException {
        FileReader f=new FileReader("c:\\dosyalar\\a.txt");
    }
}
