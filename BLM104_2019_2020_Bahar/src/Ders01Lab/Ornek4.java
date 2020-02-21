/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders01Lab;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author alinizam
 */
public class Ornek4 {
    public static void main(String[] args) {
        JFrame pencerem=new JFrame("Merhaba");
        JLabel l1=new JLabel("Pencere label");
        JButton b1=new JButton("Buton");
        JTextField t1=new JTextField("Metin kutusu");
        
        pencerem.add(l1);
        pencerem.add(b1);
        pencerem.add(t1);
        pencerem.setVisible(true);
        pencerem.setSize(300,300);
        pencerem.setLayout(new FlowLayout());
         
    }
}
