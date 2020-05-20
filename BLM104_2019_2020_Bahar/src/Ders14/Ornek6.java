/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author alinizam
 */
public class Ornek6 {
    public static void main(String[] args) throws IOException {
        Path p=Paths.get("c:", "dosyalar","Merhaba.txt");
        Path p1=Paths.get("c:\\dosyalar\\Merhaba.txt");
        
        System.out.println("Var mı = " +Files.exists(p));
        System.out.println("Okunabilir mi = " +Files.isReadable(p));
        System.out.println("Yazılabilir mi = " +Files.isWritable(p));
        System.out.println("Oluşturan ="+Files.getOwner(p1));
        System.out.println("Aynı dosya mı = "+Files.isSameFile(p, p1));
    }
}
