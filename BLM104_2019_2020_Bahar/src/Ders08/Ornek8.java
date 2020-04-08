/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek8 {
    public static void main(String[] args) {
        try(FileWriter f = new FileWriter("c:\\dosyalar\\a.txt")) {  
            f.write("Merhaba Dünya");
        } catch (IOException ex) {
            Logger.getLogger(Ornek7.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
