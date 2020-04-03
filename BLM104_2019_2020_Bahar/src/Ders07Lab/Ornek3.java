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
public class Ornek3 {
    public static void main(String[] args) {
        String metin="2132ttt13 213213212315456 3";
        Random r=new Random();
        boolean hepsiRakkamMi=true;
        int toplam=0;
        for (int i = 0; i < 3; i++) {
            char c=metin.charAt(r.nextInt(metin.length()));
            System.out.println(c);
            if (!Character.isDigit(c)){
                hepsiRakkamMi=false;
            }else{
                toplam+=Integer.parseInt(String.valueOf(c));
            }
            
        }
        if(hepsiRakkamMi){
            System.out.println("Toplam ="+toplam);
        }else{
            System.out.println("Hepsi rakkam değil");
        }
        
      
    }
}
