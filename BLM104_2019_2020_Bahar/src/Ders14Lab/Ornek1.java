/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14Lab;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        Path adresler[]=new Path[3];
        adresler[0]=Paths.get("c:\\dosyalar");
        adresler[1]=Paths.get("c:\\dosyalar2");
        adresler[2]=Paths.get("c:\\dosyalar\\Merhaba.txt");
        
        for (Path path : adresler) {
            try {
                System.out.println("Bu gerçek bir yoldur = " + path.toRealPath());
            } catch (IOException ex) {
                System.out.println("Gerçek bir yol değil = " + path);
            }
        }
        
    }
}
