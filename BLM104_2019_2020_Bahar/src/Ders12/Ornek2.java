/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek2 {

    //Byte stream InputStream
    public static void main(String[] args) {
        dosyayaYaz();
    }

    static void dosyaOku() {
        FileInputStream fis=null;
        try {
            fis = new FileInputStream("c:\\dosyalar\\Merhaba.txt");
            int b = fis.read();
            while (b != -1) {
                System.out.print((char) b);
                b = fis.read();
            }
            System.out.println("");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        }

    }

    static void dosyaOku1() {
        try {
            FileInputStream fis = new FileInputStream("c:\\dosyalar\\Merhaba.txt");
            int b;
            while ((b = fis.read()) != -1) {
                System.out.print((char) b);
            }
            System.out.println("");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    static void dosyayaYaz(){
        try(FileOutputStream fos=new FileOutputStream("c:\\dosyalar\\Merhaba.txt",true)){
            fos.write(77);
            fos.write('e');
            fos.write('r');
            fos.write('h');
            fos.write('a');
            fos.write('b');
            fos.write('a');
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }

}
