/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author alinizam
 */
public class Ornek2 {

    public static void main(String[] args) throws FileNotFoundException {
        String dosya = "c:\\dosyalar\\sayilar.txt";
        Scanner s = new Scanner(new BufferedInputStream(new FileInputStream(dosya)));
        //Scanner s=new Scanner(new FileInputStream(dosya));
        s.useDelimiter("-");
        while (s.hasNext()) {
            if (s.hasNextInt()) {
                System.out.println(s.nextInt());
            } else {
                System.out.println(s.next());
            }
        }
    }
}
