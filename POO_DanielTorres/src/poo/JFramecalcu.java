/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author danie
 */
public class JFramecalcu extends JFrame{
    public JFramecalcu(){
        JPanel f = new JPanel(new GridLayout(5,4));
        //crea botones
        Dimension dim = new Dimension(300,300);
        
        
        Jcalcu btnC = new Jcalcu("C", dim, Color.red);
        Jcalcu btnCE = new Jcalcu("CE", dim, Color.red);
        Jcalcu btnMM = new Jcalcu("+/-", dim, Color.red);
        Jcalcu btnMulti = new Jcalcu("X", dim, Color.red);
        Jcalcu btn7 = new Jcalcu("7", dim, Color.red);
        Jcalcu btn8 = new Jcalcu("8", dim, Color.red);
        Jcalcu btn9 = new Jcalcu("9", dim, Color.red);
        Jcalcu btnDiv = new Jcalcu("/", dim, Color.red);
        Jcalcu btn4 = new Jcalcu("4", dim, Color.red);
        Jcalcu btn5 = new Jcalcu("5", dim, Color.red);
        Jcalcu btn6 = new Jcalcu("6", dim, Color.red);
        Jcalcu btnMenos = new Jcalcu("-", dim, Color.red);
        Jcalcu btn1 = new Jcalcu("1", dim, Color.red);
        
        Jcalcu btn2 = new Jcalcu("2", dim, Color.red);
        Jcalcu btn3 = new Jcalcu("3", dim, Color.red);
        Jcalcu btnPlus = new Jcalcu("+", dim, Color.red);
        Jcalcu btn0 = new Jcalcu("0", dim, Color.red);
        Jcalcu btnpunto = new Jcalcu(".", dim, Color.red);
        Jcalcu btnigual = new Jcalcu("=", dim, Color.red);
        Jcalcu btnacerca = new Jcalcu("?", dim, Color.red);
        //f.setLayout(new FlowLayout());
      
        f.add(btn7,BorderLayout.LINE_START);
        setSize(500,500);
       f.add(btnC);
        f.add(btnCE);
        f.add(btnMM);
        f.add(btnMulti);
        f.add(btn7);
        f.add(btn8);
        f.add(btn9);
        f.add(btnDiv);
        f.add(btn4);
        f.add(btn5);
        f.add(btn6);
        f.add(btnMenos);
        f.add(btn1);
        f.add(btn2);
        f.add(btn3);
        f.add(btnPlus);
        f.add(btn0);
        f.add(btnpunto);
        f.add(btnigual);
        f.add(btnacerca);
           
        f.setVisible(true);
        
       
        setLayout(new BorderLayout());
        add(f,BorderLayout.CENTER);
        Display display = new Display();
        Font auxF = display.getFont();
        Font nueva = new Font(auxF.getName(), auxF.getStyle(), 40);
        display.setFont(nueva);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        
        add(display,BorderLayout.NORTH);
        
        ListenerVerdes orejon = new ListenerVerdes(display);
        btn1.addActionListener(orejon);
        btn2.addActionListener(orejon);
        btn3.addActionListener(orejon);
        btn4.addActionListener(orejon);
        btn5.addActionListener(orejon);
        btn6.addActionListener(orejon);
        btn7.addActionListener(orejon);
        btn8.addActionListener(orejon);
        btn9.addActionListener(orejon);
        btn0.addActionListener(orejon);
        btnpunto.addActionListener(orejon);
        btnMM.addActionListener(orejon);
         ListenerOpera orejon2 = new ListenerOpera(display);
        btnPlus.addActionListener(orejon2);
        btnMenos.addActionListener(orejon2);
        btnDiv.addActionListener(orejon2);
        btnMulti.addActionListener(orejon2);
        btnigual.addActionListener(orejon2);
        btnacerca.addActionListener(orejon2);
                
        setDefaultCloseOperation(JFramecalcu.EXIT_ON_CLOSE);
        
        
               
}

    

}