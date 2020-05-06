/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek3 {
    public static void main(String[] args) {
        dosyaYaz();
    }
    
    static void dosyaOku(){
        try(FileReader fr=new FileReader("c:\\dosyalar\\Merhaba.txt")){
            int c;
            while((c=fr.read())!=-1){
                System.out.print((char)c);
            }
            System.out.println("");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     static void dosyaYaz(){
        try(FileWriter fr=new FileWriter("c:\\dosyalar\\Merhaba.txt")){
            fr.write("Merhaba Dünya");
            System.out.println("");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
