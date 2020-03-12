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
public class Ornek7 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("a");
        for (int i = 0; i < 500000; i++) {
            sb.append("a");
        }
        System.out.println("Bitti");
    } 
}
