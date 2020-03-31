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
public class Ornek5 {
    public static void main(String[] args) {
        //Sınır değerlerde arama
        String desen="\\b[0-9][A-z]+[0-9]\\b"; // Başında ve sonunda rakam olan kelimeler
        String arananMetin="1Fatih 2Sultan 3Mehmet9 6";
        Desen.desenAra(arananMetin,desen);
    } 
}
