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
public class Ornek4 {
    public static void main(String[] args) {
        try {
            FileReader f=new FileReader("c:\\dosyalar\\a.txt");
            System.out.println((char)f.read());
            System.out.println((char)f.read());
            System.out.println((char)f.read());
        } catch (Exception ex) {
            Logger.getLogger(Ornek4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
 
}
