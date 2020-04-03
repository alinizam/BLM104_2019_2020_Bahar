/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07Lab;

import java.util.Random;

/**
 *
 * @author alinizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        String metin="FAtih1 Sultan 144542 Mehmet 3";
        Random r=new Random();
        char c=metin.charAt(r.nextInt(metin.length()));
        System.out.println(c);
        if (Character.isDigit(c)){
            System.out.println("Bir sayı seçildi.");
        }
    }
}
