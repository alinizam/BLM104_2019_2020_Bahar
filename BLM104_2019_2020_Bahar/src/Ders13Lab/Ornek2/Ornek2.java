/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13Lab.Ornek2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author alinizam
 */
public class Ornek2 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        personelDosya2DB();
    }
    static String dosya="c:\\dosyalar\\personelDB.obj";
    static void personelDb2Dosya() throws FileNotFoundException, IOException{
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("BLM104_2019_2020_BaharPU");
        EntityManager em=emf.createEntityManager();
        Query q=em.createQuery("select p from Personel p");
        
        ObjectOutputStream oas=new ObjectOutputStream(new FileOutputStream(dosya));
        List<Personel> personeller=q.getResultList();
        for (Personel personel : personeller) {
            oas.writeObject(personel);
        }
        oas.close();
    }
    
     static void personelDosya2DB() throws FileNotFoundException, IOException, ClassNotFoundException{
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("BLM104_2019_2020_BaharPU");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(dosya));
        try{
        while(true) {
            Personel p=(Personel)(ois.readObject());
            Query q=em.createQuery("update Personel p set p.maas=:pMaas where p.personelId=:id");
            try{
                q.setParameter("pMaas", p.getMaas()+1000);
            }catch(NullPointerException e){
                q.setParameter("pMaas", 1000);
            }
            q.setParameter("id", p.getPersonelId());
            q.executeUpdate();
        }}catch(EOFException e){
            System.out.println("Dosya bitti");
        }finally{
            ois.close();
        }
        em.getTransaction().commit();
        
    }
}
