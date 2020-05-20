/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author alinizam
 */
public class Ornek1 {

    public static void main(String[] args) {
        Path p = Paths.get("c:\\dosyalar\\yeni\\Merhaba.txt");
        System.out.println(p.getFileName());
        System.out.println(p.getRoot());
        System.out.println(p.getFileSystem());
        System.out.println(p.getParent());
        System.out.println("---------");
        for (int i = 0; i < p.getNameCount(); i++) {
            System.out.println(p.getName(i));
        }
        System.out.println("----------");
        System.out.println(p.subpath(0, 2));
    }
}
