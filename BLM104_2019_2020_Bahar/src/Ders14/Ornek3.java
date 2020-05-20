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
public class Ornek3 {
    public static void main(String[] args) {
        Path pKurulum=Paths.get("c:","dosyalar","alt");
        Path pAlt=Paths.get("..\\alt");
        pKurulum=pKurulum.resolve(pAlt);
        System.out.println(pKurulum);
        
    }
}
