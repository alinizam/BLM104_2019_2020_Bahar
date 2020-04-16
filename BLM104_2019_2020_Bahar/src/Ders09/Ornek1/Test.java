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
public class Test {

    public static void main(String[] args) {
        Stok s = new Stok();
        s.setKalanMiktar(10);

        try {
            s.cikisYap(5);
            s.cikisYap(3);
            s.cikisYap(15);
        } catch (StokException e) {
            System.out.println("Stok çıkışından bir oldu "+e.kalan+" yetersiz");
        }
    }
}
