/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrameteclado;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author danie
 */
public class Jteclado extends JFrame {
    
   public Jteclado(){
        JPanel f = new JPanel(new GridLayout(4,10));
        //crea botones
        Dimension dim = new Dimension(10,10);
         Jnumeros btn1 = new Jnumeros("1", dim, Color.WHITE);
         Jnumeros btn2 = new Jnumeros("2", dim, Color.WHITE);
         Jnumeros btn3 = new Jnumeros("3", dim, Color.WHITE);
         Jnumeros btn4 = new Jnumeros("4", dim, Color.WHITE);
         Jnumeros btn5 = new Jnumeros("5", dim, Color.WHITE);
         Jnumeros btn6 = new Jnumeros("6", dim, Color.WHITE);
         Jnumeros btn7 = new Jnumeros("7", dim, Color.WHITE);
         Jnumeros btn8 = new Jnumeros("8", dim, Color.WHITE);
         Jnumeros btn9 = new Jnumeros("9", dim, Color.WHITE);
         Jnumeros btn0 = new Jnumeros("0", dim, Color.WHITE);
         Jletras btnQ = new Jletras("Q", dim, Color.cyan);
           Jletras btnW = new Jletras("W", dim, Color.cyan);
           Jletras btnE = new Jletras("E", dim, Color.cyan);
           Jletras btnR = new Jletras("R", dim, Color.cyan);
           Jletras btnT = new Jletras("T", dim, Color.cyan);
           Jletras btnY = new Jletras("Y", dim, Color.cyan);
           Jletras btnU = new Jletras("U", dim, Color.cyan);
           Jletras btnI = new Jletras("I", dim, Color.cyan);
           Jletras btnO = new Jletras("O", dim, Color.cyan);
           Jletras btnP = new Jletras("P", dim, Color.cyan);
           Jletras btnA = new Jletras("A", dim, Color.cyan);
           Jletras btnS = new Jletras("S", dim, Color.cyan);
           Jletras btnD = new Jletras("D", dim, Color.cyan);
           Jletras btnF = new Jletras("F", dim, Color.cyan);
           Jletras btnG = new Jletras("G", dim, Color.cyan);
           Jletras btnH = new Jletras("H", dim, Color.cyan);
           Jletras btnJ = new Jletras("J", dim, Color.cyan);
           Jletras btnK = new Jletras("K", dim, Color.cyan);
           Jletras btnL = new Jletras("L", dim, Color.cyan);
           Jletras btnÑ = new Jletras("Ñ", dim, Color.cyan);
           Jletras btnZ = new Jletras("Z", dim, Color.cyan);
           Jletras btnX = new Jletras("X", dim, Color.cyan);
           Jletras btnC = new Jletras("C", dim, Color.cyan);
           Jletras btnV = new Jletras("V", dim, Color.cyan);
           Jletras btnB = new Jletras("B", dim, Color.cyan);
           Jletras btnN = new Jletras("N", dim, Color.cyan);
           Jletras btnM = new Jletras("M", dim, Color.cyan);
           
           Jflechas btnarri = new Jflechas("🡡", dim, Color.red);
           Jflechas btnizq = new Jflechas("🡠", dim, Color.red);
           Jflechas btnabaj = new Jflechas("🡣", dim, Color.red);
           Jflechas btndere = new Jflechas("🡢", dim, Color.red);
           
               
         
         f.add(btn1);
         f.add(btn2);
         f.add(btn3);
         f.add(btn4);
         f.add(btn5);
         f.add(btn6);
         f.add(btn7);
         f.add(btn8);
         f.add(btn9);
         f.add(btn0);
         
         f.add(btnQ);
         f.add(btnW);
         f.add(btnE);
         f.add(btnR);
         f.add(btnT);
         f.add(btnY);
         f.add(btnU);
         f.add(btnI);
         f.add(btnO);
         f.add(btnP);
         f.add(btnA);
         f.add(btnS);
         f.add(btnD);
         f.add(btnF);
         f.add(btnG);
         f.add(btnH);
         f.add(btnJ);
         f.add(btnK);
         f.add(btnL);
         f.add(btnÑ);
         f.add(btnZ);
         f.add(btnX);
         f.add(btnC);
         f.add(btnV);
         f.add(btnB);
         f.add(btnN);        
         f.add(btnM);
         
         f.add(btnarri);
         f.add(btnizq);
         f.add(btnabaj);
         f.add(btndere);
         btn1.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
 
                if (key == KeyEvent.VK_1) {
                    btn1.setBackground(Color.green);
                }
                if (key == KeyEvent.VK_2) {
                btn2.setBackground(Color.green);
                }
                if (key == KeyEvent.VK_3) {
                btn3.setBackground(Color.green);
                }
                if (key == KeyEvent.VK_3) {
                btn3.setBackground(Color.green);
                }
                if (key == KeyEvent.VK_4) {
                btn4.setBackground(Color.green);
                }
                if (key == KeyEvent.VK_5) {
                btn5.setBackground(Color.green);
                }
                if (key == KeyEvent.VK_6) {
                btn6.setBackground(Color.green);
                }
                if (key == KeyEvent.VK_7) {
                btn7.setBackground(Color.green);
                }
                if (key == KeyEvent.VK_8) {
                btn8.setBackground(Color.green);
                }
                 if (key == KeyEvent.VK_9) {
                btn9.setBackground(Color.green);
                }
                  if (key == KeyEvent.VK_0) {
                btn0.setBackground(Color.green);
                }
                if (key == KeyEvent.VK_Q) {
                btnQ.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_W) {
                btnW.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_E) {
                btnE.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_R) {
                btnR.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_T) {
                btnT.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_Y) {
                btnY.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_U) {
                btnU.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_I) {
                btnI.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_O) {
                btnO.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_P) {
                btnP.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_A) {
                btnA.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_S) {
                btnS.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_D) {
                btnD.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_F) {
                btnF.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_G) {
                btnG.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_H) {
                btnH.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_J) {
                btnJ.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_K) {
                btnK.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_L) {
                btnL.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_ACCEPT) {
                btnÑ.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_Z) {
                btnZ.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_X) {
                btnX.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_C) {
                btnC.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_V) {
                btnV.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_B) {
                btnB.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_N) {
                btnN.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_M) {
                btnM.setBackground(Color.magenta);
                }
                if (key == KeyEvent.VK_UP) {
                btnarri.setBackground(Color.ORANGE);
                }
                if (key == KeyEvent.VK_DOWN) {
                btnabaj.setBackground(Color.ORANGE);
                }
                if (key == KeyEvent.VK_LEFT) {
                btnizq.setBackground(Color.ORANGE);
                }
                if (key == KeyEvent.VK_RIGHT) {
                btndere.setBackground(Color.ORANGE);
                }
                
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                int key = e.getKeyCode();
 
                if (key == KeyEvent.VK_1) {
                    btn1.setBackground(Color.WHITE);
                }
                if (key == KeyEvent.VK_2) {
                btn2.setBackground(Color.WHITE);
                }
                 if (key == KeyEvent.VK_3) {
                btn3.setBackground(Color.WHITE);
                }
                if (key == KeyEvent.VK_3) {
                btn3.setBackground(Color.WHITE);
                }
                if (key == KeyEvent.VK_4) {
                btn4.setBackground(Color.WHITE);
                }
                if (key == KeyEvent.VK_5) {
                btn5.setBackground(Color.WHITE);
                }
                if (key == KeyEvent.VK_6) {
                btn6.setBackground(Color.WHITE);
                }
                if (key == KeyEvent.VK_7) {
                btn7.setBackground(Color.WHITE);
                }
                if (key == KeyEvent.VK_8) {
                btn8.setBackground(Color.WHITE);
                }
                 if (key == KeyEvent.VK_9) {
                btn9.setBackground(Color.WHITE);
                }
                  if (key == KeyEvent.VK_0) {
                btn0.setBackground(Color.WHITE);
                }
                if (key == KeyEvent.VK_Q) {
                btnQ.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_W) {
                btnW.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_E) {
                btnE.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_R) {
                btnR.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_T) {
                btnT.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_Y) {
                btnY.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_U) {
                btnU.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_I) {
                btnI.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_O) {
                btnO.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_P) {
                btnP.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_A) {
                btnA.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_S) {
                btnS.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_D) {
                btnD.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_F) {
                btnF.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_G) {
                btnG.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_H) {
                btnH.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_J) {
                btnJ.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_K) {
                btnK.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_L) {
                btnL.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_DEAD_ABOVEDOT) {
                btnÑ.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_Z) {
                btnZ.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_X) {
                btnX.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_C) {
                btnC.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_V) {
                btnV.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_B) {
                btnB.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_N) {
                btnN.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_M) {
                btnM.setBackground(Color.cyan);
                }
                if (key == KeyEvent.VK_UP) {
                btnarri.setBackground(Color.red);
                }
                if (key == KeyEvent.VK_DOWN) {
                btnabaj.setBackground(Color.red);
                }
                if (key == KeyEvent.VK_LEFT) {
                btnizq.setBackground(Color.red);
                }
                if (key == KeyEvent.VK_RIGHT) {
                btndere.setBackground(Color.red);
                }
            }
        });
         
        
         f.setVisible(true);
        
         
       
        setLayout(new BorderLayout());
        add(f,BorderLayout.CENTER);
        setDefaultCloseOperation(Jteclado.EXIT_ON_CLOSE);
   }
}
