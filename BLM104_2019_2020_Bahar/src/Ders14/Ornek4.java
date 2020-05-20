/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author alinizam
 */
public class Ornek4 {
    public static void main(String[] args) {
          Path pKaynak=Paths.get("c:","dosyalar","a1","a11");
          Path pHedef=Paths.get("c:","dosyalar","b1");
          System.out.println(pKaynak.relativize(pHedef));
    }
}
