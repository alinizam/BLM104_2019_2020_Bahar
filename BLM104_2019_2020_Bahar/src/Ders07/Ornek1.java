/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        Number n=10;
        ArrayList<Integer> sayilar=new ArrayList();
        sayilar.add(12);
        int j=10;
        Integer i=j;
        j=i;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(i.compareTo(52));
    }
 
}
