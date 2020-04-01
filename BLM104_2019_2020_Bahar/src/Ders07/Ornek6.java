/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

import java.util.Random;

/**
 *
 * @author alinizam
 */
public class Ornek6 {
    public static void main(String[] args) {
        Random r=new Random();
        int sayilar[]=new int[3];
        for (int i = 0; i < 1000000; i++) {
            sayilar[r.nextInt(3)]++;
        }
        System.out.println(sayilar[0]+" "+sayilar[1]+" "+sayilar[2]);
    }
}
