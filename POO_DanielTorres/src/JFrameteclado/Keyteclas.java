/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrameteclado;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
/**
 *
 * @author danie
 */
public class Keyteclas {
   /* boton.addKeyListener(new KeyListener()) {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
 
                if (key == KeyEvent.VK_1) {
                    boton.setBackground(Color.green);
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
 */        
}
