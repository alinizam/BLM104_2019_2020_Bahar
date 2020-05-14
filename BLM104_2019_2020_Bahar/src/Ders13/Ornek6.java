/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
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
public class Ornek6 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        tumunuOku();
    }

    public static void dosyayaNesneYaz() throws FileNotFoundException, IOException {
        String dosya = "c:\\dosyalar\\nesne.obj";
        ObjectOutputStream oas = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dosya)));
        oas.writeObject(new Personel("Ahmet", "AK"));
        oas.writeObject(new Personel("Mehmet", "Beyaz"));
        oas.close();
    }

    public static void dosyadanNesneyiOku() throws FileNotFoundException, IOException, ClassNotFoundException {
        String dosya = "c:\\dosyalar\\nesne.obj";
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dosya)));
        Personel p = (Personel) (ois.readObject());
        System.out.println(p.adi + " " + p.soyadi);
        ois.close();
    }

    public static void tumunuOku() throws FileNotFoundException, IOException, ClassNotFoundException {
        String dosya = "c:\\dosyalar\\nesne.obj";
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dosya)));
        try {
            while (true) {
                Personel p = (Personel) (ois.readObject());
                System.out.println(p.adi + " " + p.soyadi);
            }
        } catch (EOFException e) {
            System.out.println("Dosya bitti");
        } finally {
            ois.close();
        }
    }

}
