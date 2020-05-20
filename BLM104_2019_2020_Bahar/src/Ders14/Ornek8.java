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
import java.nio.file.StandardCopyOption;

/**
 *
 * @author alinizam
 */
public class Ornek8 {
    public static void main(String[] args) throws IOException {
        Path p1=Paths.get("c:", "dosyalar","a1");
        Path p2=Paths.get("c:", "dosyalar","c1");
        Files.copy(p1, p2,StandardCopyOption.REPLACE_EXISTING);
        
    }
}
