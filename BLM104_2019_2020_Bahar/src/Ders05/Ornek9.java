/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author alinizam
 */
public class Ornek9 {

    public static void main(String[] args) {
        String desen = "[\\s]";
        String aranacakMetin = "6Ş1FAtih 2454S?@uAltAan 3.Mehmet 2132";
       // desenAra(aranacakMetin, desen);
        
        desenAra(aranacakMetin,"[0-9]{3}" );
        
         
    }
    
    static void desenAra(String aranacakMetin,String desen){
      
        Pattern p = Pattern.compile(desen);
        Matcher m = p.matcher(aranacakMetin);
        while (m.find()) {
            System.out.println(m.group() + " " + m.start() + ":" + m.end());
        }
    
    }
}
