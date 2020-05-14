/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author alinizam
 */
public class Ornek3 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream out=new FileOutputStream("c:\\dosyalar\\personelMaas.txt");
        PrintWriter pw=new PrintWriter(out);
        pw.printf("%10s %10s %10.02f %n", "Ahmet","Ak",20000.0);
        pw.printf("%10s %10s %10.02f %n", "Mehmet","Beyaz",5000.2131);
        pw.close();
    }
}
