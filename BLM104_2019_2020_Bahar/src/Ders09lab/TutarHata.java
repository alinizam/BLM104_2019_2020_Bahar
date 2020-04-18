/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09lab;

/**
 *
 * @author alinizam
 */
public class TutarHata extends ArithmeticException {
    int tutar;

    public TutarHata(int tutar) {
        this.tutar = tutar;
    }
    
}
