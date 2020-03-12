/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

/**
 *
 * @author alinizam
 */
public class Ornek8 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.append("Ahmet");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        
        sb.append(" eve geldi mi acaba ");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        
        sb.append("cok merak ettim ");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb);
        sb.insert(5," AK");
        System.out.println(sb);
        
        sb.replace(0, 10, "Bir soru: ");
        System.out.println(sb);   
        
        String s="Ahmet Ak";
        System.out.println(s.replaceAll("A","E")); 
        
        
    }
}
