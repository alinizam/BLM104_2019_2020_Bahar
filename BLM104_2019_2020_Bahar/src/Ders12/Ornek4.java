/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alinizam
 */
public class Ornek4 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        dosyaYaz();
    }
    
    static void dosyaOku() throws FileNotFoundException, IOException{
        BufferedReader br=new BufferedReader(new FileReader("c:\\dosyalar\\Merhaba.txt"));
        String s;
        while((s=br.readLine())!=null){
            System.out.println(s);
        }
       
    }
    
     static void dosyaYaz() throws FileNotFoundException, IOException{
        BufferedWriter br=new BufferedWriter(new FileWriter("c:\\dosyalar\\Merhaba.txt"));
        br.write("Merhaba Dünya");
        br.close();
    }
}
