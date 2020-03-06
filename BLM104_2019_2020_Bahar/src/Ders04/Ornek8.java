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
public class Ornek8 {
    public static void main(String[] args) {
        //substr ve indexof
        String isim="Ahmet Ak";
        System.out.println("İsim =" + isim.substring(0, isim.indexOf(" ")));
        System.out.println("Soy isim=" + isim.substring(isim.indexOf(" ")+1));
        
        System.out.println(isim.startsWith("Ahme"));
        
        System.out.println("Ahmet".compareTo("Ahseni Tahvim"));
    }
    
}
