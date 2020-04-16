/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09.Ornek1;

/**
 *
 * @author alinizam
 */
public class StokException extends RuntimeException{
    int kalan;
    public StokException(int kalan) {
        this.kalan=kalan;
        System.out.println("Eksik miktar = "+kalan);
    }
    
}
