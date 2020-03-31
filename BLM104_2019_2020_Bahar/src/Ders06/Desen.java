/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author alinizam
 */
public class Desen {
     static void desenAra(String arananMetin, String desen){
        Pattern p=Pattern.compile(desen);
        Matcher m=p.matcher(arananMetin);
        while (m.find()){
            System.out.println(m.group()+"   "+m.start()+" "+m.end());
        }
    }
}
