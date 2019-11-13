/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;



import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author danie
 */
public class MyJFrame extends JFrame{
     public MyJFrame(String titulo){
        JPanel panelCentral = new JPanel(new GridLayout(4,4));
        //crea botones
        Dimension dim = new Dimension(300,300);
       
     
        //setSize(w,h);
        setVisible(true);
    }
}
