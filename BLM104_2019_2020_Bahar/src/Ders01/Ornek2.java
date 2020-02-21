/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders01;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author alinizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        JFrame form=new JFrame("Merhaba");
        JTextField t1=new JTextField("Merhaba Dünya");
        JTextField t2=new JTextField("Merhaba Ay");
        JButton b=new JButton("Merhaba Buton");
        form.add(t1);
        form.add(t2);
        form.add(b);
        form.setVisible(true);
        form.setLayout(new FlowLayout());
      //form.setSize(200, 500);
        form.pack();
        
    }

}
