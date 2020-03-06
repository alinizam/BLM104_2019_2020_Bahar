/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

/**
 *
 * @author alinizam
 */
public class Ornek7 {
    public static void main(String[] args) {
        String s="Ahmet";
        s=s.concat(" Akoğlu");
        System.out.println(s.concat(s));
        System.out.println(s);
        
        System.out.println(s.substring(3,7));
        System.out.println(s.substring(3));  
        String metin="Fatih_Sultan Mehmet Vakıf Üniversitesi";
        String kelimeler[]=metin.split(" ");
        System.out.println(kelimeler[1]);
        
        System.out.println(metin.toLowerCase());
        System.out.println(metin.indexOf("mehmet"));
    }
}
