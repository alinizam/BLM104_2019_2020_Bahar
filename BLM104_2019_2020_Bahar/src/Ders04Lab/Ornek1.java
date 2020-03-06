/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04Lab;

/**
 *
 * @author alinizam
 */
public class Ornek1 {

    public static void main(String[] args) {
        String mesaj = "Fatih Sultan Mehmet Vakıf Üniversitesi";
        kelimelerineAyir(mesaj);
        
        String[] kelimeler = {"Fatih", "Sultan", "Mehmet"};
        System.out.println(cumleyeCevir(kelimeler));
        
        char[] karakterler = karakterler(mesaj);
        for (char c : karakterler) {
            System.out.println(c);
        }
    }

    static void kelimelerineAyir(String mesaj) {
        String kelime = "";
        for (int i = 0; i < mesaj.length(); i++) {
            char c = mesaj.charAt(i);

            if (c != ' ') {
                kelime += c;
            } else {
                System.out.println(kelime);
                kelime = "";
            }
        }

        System.out.println(kelime);
    }

    static String cumleyeCevir(String[] kelimeler) {
        String cumle = "";

        for (int i = 0; i < kelimeler.length - 1; i++) {
            cumle += kelimeler[i] + " ";
        }

        cumle += kelimeler[kelimeler.length - 1] + ".";

        return cumle;
    }
    
    static char[] karakterler(String mesaj){
        char[] karakterDizisi = new char[mesaj.length()];
        
        for (int i = 0; i < mesaj.length(); i++) {
            karakterDizisi[i] = mesaj.charAt(i);
        }
        
        return karakterDizisi;
    }
}
