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
public class Ornek5 {
    static class Personel{
        int maas;
    }
    public static void main(String[] args) {
        String isim="Ahmet";
        isim="Ahmet Ak";
        isim=isim+"AK";
        System.out.println(isim);
        Personel p=new Personel();
        p.maas=500;
        maasArttir(p, 100);
        System.out.println(p.maas);
        ismiSil(isim);
        System.out.println(isim);
    }
    static void maasArttir(Personel p, int artis){
        p.maas+=artis;
    }
    static void ismiSil(String isim){
        isim="Silindi";
    }
}
