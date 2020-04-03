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
public class Ornek2 {
    public static void main(String[] args) {
        String metin="Fatih1 Sultan 144542 Mehmet 3";
        Random r=new Random();
        boolean tumMetinSecilmemisMi=true;
        boolean[] secilenler=new boolean[metin.length()];
        int sayac=0;
        while(tumMetinSecilmemisMi){ 
              secilenler[r.nextInt(metin.length())]=true;
              tumMetinSecilmemisMi=false;
              for (int i = 0; i < metin.length(); i++) {
                if(!secilenler[i]){
                    tumMetinSecilmemisMi=true;
                }
              }
            sayac++;  
        }
        System.out.println("Toplam seçim sayısı ="+sayac);
        
    }
}
