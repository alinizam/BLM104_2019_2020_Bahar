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
public class Ornek2 {
    public static void main(String[] args) {
        System.out.println("main başladı");
        try{
        a();
        }catch(Exception e){
            System.out.println("main'de bir hata yakalandı");
        }
        System.out.println("main başarılı bitti");
    }
    static void a(){
        System.out.println("a başladı");
        b();
        System.out.println("a başarılı bitti.");
    }
    static void b(){
        System.out.println("b başladı");
        
        c();
        
        System.out.println("b başarılı bitti");
    }
    static void c(){
        System.out.println("c başladı");
    //    try{
            int a = 10;
            int b = 0;
            System.out.println("Girilen iki sayının bölümü = " + a / b);
            System.out.println("Sonuç başarılı");
      /*  } catch (Exception e) {
            System.out.println("Bölen sınıf olamaz. Sonuç başarısız");    
            System.out.println(e.getClass()+" "+e.getMessage());
        }*/
        System.out.println("c başarılı bitti");
    }
}
