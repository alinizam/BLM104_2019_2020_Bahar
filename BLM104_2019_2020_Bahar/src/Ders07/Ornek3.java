/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

import java.text.DecimalFormat;

/**
 *
 * @author alinizam
 */
public class Ornek3 {
    public static void main(String[] args) {
        System.out.println(bicimle("00,00,00.00",10550.9));
    }
 
    static String bicimle(String bicimTanim, Double value ){
        DecimalFormat bicimlendirici=new DecimalFormat(bicimTanim);
        String sonuc=bicimlendirici.format(value);
        return sonuc;
    }
}
