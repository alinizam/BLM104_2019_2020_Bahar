/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08;

import java.util.Scanner;

/**
 *
 * @author alinizam
 */
public class Ornek1 {

    public static void main(String[] args) {
        System.out.println("İki sayı giriniz.");
        try {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println("Girilen iki sayının bölümü = " + a / b);
            System.out.println("Sonuç başarılı");
        } catch (Exception e) {
            System.out.println("Bölen sınıf olamaz. Sonuç başarısız");    
            System.out.println(e.getClass()+" "+e.getMessage());
        }
    }
}
