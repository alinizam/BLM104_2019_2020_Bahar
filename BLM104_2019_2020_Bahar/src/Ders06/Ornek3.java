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
public class Ornek3 {
    public static void main(String[] args) {
        //Belirsiz tekrar sayısı örneği
        String desen="[0-9]{3}+"; //3'er 3'er tekrar eden rakamları bulma
        String arananMetin="Fatih151666 Sultan2556 Mehmet399 Fatih";
        Desen.desenAra(arananMetin,desen);
    } 
}
