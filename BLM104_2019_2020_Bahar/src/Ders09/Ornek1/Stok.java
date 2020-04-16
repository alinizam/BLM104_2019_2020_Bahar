/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09.Ornek1;

import java.io.IOException;

/**
 *
 * @author alinizam
 */
public class Stok {
    private int kalanMiktar;

    public int getKalanMiktar() {
        return kalanMiktar;
    }

    public void setKalanMiktar(int kalanMiktar) {
        this.kalanMiktar = kalanMiktar;
    }
    
    void cikisYap(int cikis) {
        if (kalanMiktar-cikis<0){
            throw new StokException(kalanMiktar-cikis);
        }
        kalanMiktar-=cikis;       
    }
    
}
