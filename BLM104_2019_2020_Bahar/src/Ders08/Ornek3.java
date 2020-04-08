/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08;

/**
 *
 * @author alinizam
 */
public class Ornek3 {
    public static void main(String[] args) {
        String sayi1="10"; //jtext1.getText()
        String sayi2="15";
        try{
            System.out.println(Integer.parseInt(sayi1)+Integer.parseInt(sayi2));
            System.out.println("Başarılı bitti");
        }catch(Exception e){
            System.out.println("Bir hata oldu "+e.getMessage()+" : "+e.getClass());    
        }
    }
}
