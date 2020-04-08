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
public class Ornek6 {
     public static void main(String[] args) {
        String sayi1=null; //jtext1.getText()
        String sayi2="0";
        try{
            System.out.println(Integer.parseInt(sayi1.toUpperCase()) / Integer.parseInt(sayi2));
            System.out.println("Başarılı bitti");
        }catch(ArithmeticException e){
            System.out.println("Sıfıra bölme hatası "+e.getMessage()+" : "+e.getClass());    
        }catch(NumberFormatException|NullPointerException e){
            System.out.println("Sayı biçimi hatası "+e.getMessage()+" : "+e.getClass());    
        }catch(Exception e){
            System.out.println("Bir hata oldu "+e.getMessage()+" : "+e.getClass());    
        }
    }
}
