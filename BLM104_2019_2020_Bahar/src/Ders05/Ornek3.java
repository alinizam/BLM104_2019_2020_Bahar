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
public class Ornek3 {
    public static void main(String[] args) {
        Long l=0L;
        for (long i = 0L; i < 100000000; i++) {
            l+=i;
        }
        System.out.println(l);
    }
}
