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
public class Ornek5 {
    public static void main(String[] args) {
        System.out.printf("Evrak numarası 2017%7d'dir %n",555);
        System.out.printf("Evrak numarası 2017%07d'dir %n",1);
        System.out.printf("Evrak numarası 2017%07d'dir %n",1123);
        
        String sonuc=String.format("Evrak numarası 2017%07d'dir %n",1123);
        
    }
}
