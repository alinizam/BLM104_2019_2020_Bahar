/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12Lab;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import Ders11Lab.Doktor;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek4 {

    public static void main(String[] args) {
        BufferedWriter bw = null;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BLM104_2019_2020_BaharPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("select d from Doktor d");
        List<Doktor> doktorlar = q.getResultList();
      
        try {
            bw = new BufferedWriter(new FileWriter("c:\\dosyalar\\doktorlar.txt"));
            for (Doktor doktor : doktorlar) {
                bw.write(doktor.getDoktorId()+" "+doktor.getAdi()+" "+doktor.getSoyadi()+" "+doktor.getMaas());
                bw.write('\n');
            }
        } catch (IOException ex) {
            Logger.getLogger(Ornek4.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bw.close();
                em.close();
                emf.close();
            } catch (IOException ex) {
                Logger.getLogger(Ornek4.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
