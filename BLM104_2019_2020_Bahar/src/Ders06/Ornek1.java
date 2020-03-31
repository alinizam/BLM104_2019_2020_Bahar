/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author alinizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        String desen="[\\d]";
        String arananMetin="Fatih11 Sultan2 Mehmet3 Fatih";
        Desen.desenAra(arananMetin,desen);
    } 
}
