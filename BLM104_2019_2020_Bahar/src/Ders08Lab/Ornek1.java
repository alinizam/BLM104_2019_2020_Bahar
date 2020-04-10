/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08Lab;

/**
 *
 * @author alinizam
 */
public class Ornek1 {

    public static void main(String[] args) {
        String[] sayilar = {"1", "6", "1g", "5", "d"};
        for (int i = 0; i < sayilar.length; i++) {
            try {
                Integer.parseInt(sayilar[i]);
            } catch (Exception e) {
                System.out.println("Hatalı eleman " + sayilar[i]);
            }
        }
    }
}
