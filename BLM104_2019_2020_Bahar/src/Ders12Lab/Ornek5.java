/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12Lab;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author alinizam
 */
public class Ornek5 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BLM104_2019_2020_BaharPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        BufferedReader br=null;
        try {
            br = new BufferedReader(new FileReader("c:\\dosyalar\\doktorlar.txt"));
            String satir=null;
            while ((satir=br.readLine())!=null){
                String doktorBilgi[]=satir.split(" ");
                Query q = em.createQuery("update Doktor d set d.maas=:pMaas+1000 where d.doktorId=:pDoktorId");
                q.setParameter("pMaas", Integer.parseInt(doktorBilgi[3]));
                q.setParameter("pDoktorId", Integer.parseInt(doktorBilgi[0]));
                q.executeUpdate();
            }
            em.getTransaction().commit();
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek5.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Ornek5.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
