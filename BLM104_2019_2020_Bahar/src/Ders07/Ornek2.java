/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

import java.util.Locale;

/**
 *
 * @author alinizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        System.out.format("Maaş = %f\n",10.6);
        System.out.format("Maaş = %f\n",10000.6);
        System.out.format(Locale.GERMAN,"Maaş = %,011.2f\n",23.0);
        System.out.format(Locale.GERMAN,"Maaş = %,011.2f\n",-231399.213213);
        System.out.format(Locale.GERMAN,"Maaş = %,011.2f\n",2399.213213);
    }
}
