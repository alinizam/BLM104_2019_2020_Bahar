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
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author alinizam
 */
public class Ornek5 {

    public static void main(String[] args) throws IOException {
        tumunuOku();
    }

    static void dosyaTuruBelirliVeriYaz() throws FileNotFoundException, IOException {
        String dosya = "c:\\dosyalar\\sayi.dat";
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dosya)));
        dos.writeInt(2000);
        dos.writeInt(5000);
        dos.writeInt(1500);
        dos.close();
    }

    static void tumunuOku() throws FileNotFoundException, IOException {
        String dosya = "c:\\dosyalar\\sayi.dat";
        DataInputStream dos = new DataInputStream(new BufferedInputStream(new FileInputStream(dosya)));
        try {
            while (true) {
                System.out.println(dos.readInt());
            }
        } catch (EOFException e) {
            System.out.println("Dosya bitti");
        } finally {
            dos.close();
        }
    }
}
