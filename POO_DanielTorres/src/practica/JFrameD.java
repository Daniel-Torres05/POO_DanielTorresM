/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import poo.JFramecalcu;
/**
 *
 * @author danie
 */
public class JFrameD extends JFrame {
    public JFrameD(){
        JPanel f = new JPanel(new GridLayout(5,1));
        //crea botones
        Dimension dim = new Dimension(300,300);
        Jboton bt1 = new Jboton("primero", dim, Color.red);
        Jboton bt2 = new Jboton("segundo", dim, Color.red);
        Jboton bt3 = new Jboton("tercero", dim, Color.red);
        Jboton bt4 = new Jboton("cuarto", dim, Color.red);
        Jboton bt5 = new Jboton("quinto", dim, Color.red);
        
        
         setSize(500,500);
        f.add(bt1);
        f.add(bt2);
        f.add(bt3);
        f.add(bt4);
        f.add(bt5);
        
        
        f.setVisible(true);
     
        setLayout(new BorderLayout());
        add(f,BorderLayout.CENTER);
        
        Dialogos muestra = new Dialogos();
        bt1.addActionListener(muestra);
        bt2.addActionListener(muestra);
        bt3.addActionListener(muestra);
        bt4.addActionListener(muestra);
        bt5.addActionListener(muestra);
       
        setDefaultCloseOperation(JFramecalcu.EXIT_ON_CLOSE);
        
    }
}
