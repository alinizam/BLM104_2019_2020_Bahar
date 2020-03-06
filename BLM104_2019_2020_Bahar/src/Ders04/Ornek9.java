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
public class Ornek9 {
    public static void main(String[] args) {
        String s1,s2;
        s1="Ahmet";
        s2="Ahmet";
        System.out.println(s1==s2);
        s1=new String("Ahmet");
        System.out.println(s1==s2);
        
        s2=new String("Ahmet");
        System.out.println(s1==s2);
        
    }
}
