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
public class Ornek8 {
    public static void main(String[] args) {
        String aranan="0212 521 81 00";
       // String desen="\\b[0-9][A-z]+[0-9]+\\b";
        String desen="[0-9]{4}\\s[0-9]{3}\\s[0-9]{2}\\s[0-9]{2}";
        
        Desen.desenAra(aranan, desen);
        String s="Ahmet";
        System.out.println(s.matches("[A-z]+[0-9]+"));
        System.out.print("Ahmet \n Mehmet\n");
        System.out.println("FSM\n".matches("FSM\\z\n"));
    }
}
