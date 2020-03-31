/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

/**
 *
 * @author alinizam
 */
public class Ornek4 {
      public static void main(String[] args) {
        //Birden fazla karakter içeren desen oluşturma
        String desen="([A-z]+[0-5][5-7])";
        String arananMetin="Fatih151666add1215 Sultan2556 Mehmet399 Fatih";
        Desen.desenAra(arananMetin,desen);
    } 
}
