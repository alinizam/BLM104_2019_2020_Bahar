/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author alinizam
 */
public class Ornek4 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       dosyadanTuruBelirliVeriOku();
    }
    static void dosyaTuruBelirliVeriYaz() throws FileNotFoundException, IOException{
         String dosya="c:\\dosyalar\\veri.data";
        DataOutputStream dos=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dosya)));
        dos.writeUTF("Ahmet Ak");
        dos.writeInt(2000);
        dos.writeInt(5000);
        dos.writeInt(1500);
        dos.close(); 
    }
    static void dosyadanTuruBelirliVeriOku() throws FileNotFoundException, IOException{
        String dosya="c:\\dosyalar\\veri.data";
        DataInputStream dos=new DataInputStream(new BufferedInputStream(new FileInputStream(dosya)));
        System.out.println(dos.readUTF());
        System.out.println(dos.readInt());
        dos.close(); 
    }
    
    
}
