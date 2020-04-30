/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek3;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author alinizam
 */
public class CalisanTest {
    public static void main(String[] args) {
        sil(25);
    }
    static void ekle(){
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("BLM104_2019_2020_BaharPU");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        Calisan c=new Calisan();
        c.setCalisanId(30);
        c.setAdi("Musa");
        c.setSoyadi("Mavi");
        em.persist(c);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
    static void sorgula(){
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("BLM104_2019_2020_BaharPU");
        EntityManager em=emf.createEntityManager();
        Query q=em.createQuery("select c from Calisan c");
        List<Calisan> calisanlar=q.getResultList();
        for (Calisan calisan : calisanlar) {
            System.out.println(calisan.getCalisanId()+" : " +calisan.getAdi()+" "+calisan.getSoyadi());
        }
        em.close();
        emf.close();
    }
    static void paramatrikSorgula(int calisanId){
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("BLM104_2019_2020_BaharPU");
        EntityManager em=emf.createEntityManager();
        Query q=em.createQuery("select c from Calisan c where c.calisanId=:pCalisanId");
        q.setParameter("pCalisanId", calisanId);
        List<Calisan> calisanlar=q.getResultList();
        for (Calisan calisan : calisanlar) {
            System.out.println(calisan.getCalisanId()+" : " +calisan.getAdi()+" "+calisan.getSoyadi());
        }
        em.close();
        emf.close();
    }
    
    
    static void sil(int calisanId){
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("BLM104_2019_2020_BaharPU");
        EntityManager em=emf.createEntityManager();
        Query q=em.createQuery("delete from Calisan c where c.calisanId=:pCalisanId");
        q.setParameter("pCalisanId", calisanId);
        em.getTransaction().begin();
        q.executeUpdate();
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}
