/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13Lab;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author alinizam
 */
public class Ornek1 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        personelDizisiOku(); 
    }
    static String dosya = "c:\\dosyalar\\personeller.obj";
    static void personelDizisiYaz() throws FileNotFoundException, IOException {
        
        ObjectOutputStream oas = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dosya)));
        Personel personeller[] = new Personel[3];
        personeller[0] = new Personel("Ahmet", "Ak", 20000);
        personeller[1] = new Personel("Mehmet", "Beyaz", 20000);
        personeller[2] = new Personel("Ayşe", "Ak", 20000);
        oas.writeObject(personeller);
        oas.close();
    }
     static void personelDizisiOku() throws FileNotFoundException, IOException, ClassNotFoundException {
         ObjectInputStream ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream(dosya)));
         Personel calisanlar[]=(Personel[])(ois.readObject());
         int toplamMaas=0;
         for (Personel personel : calisanlar) {
             System.out.println(personel.adi+" "+personel.soyadi+" "+personel.maas);
             toplamMaas+=personel.maas;
         }
         System.out.println("Toplam maaş = "+toplamMaas);
     }
    
}
