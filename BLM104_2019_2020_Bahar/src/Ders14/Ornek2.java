/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author alinizam
 */
public class Ornek2 {
    public static void main(String[] args) throws IOException {
        Path p=Paths.get("c:","dosyalar","Merhaba.txt");
        System.out.println(p.toUri());
        
        Path p1=Paths.get("c:","dosyalar","Merhaba.txt");
        System.out.println(p1.toAbsolutePath());
        
        Path p2=Paths.get("c:\\dosyalar");
        System.out.println(p2.toRealPath());
    }
}
