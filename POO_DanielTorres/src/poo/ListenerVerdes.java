/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import poo.JFramecalcu;


/**
 *
 * @author danie
 */
public class ListenerVerdes implements ActionListener {
    
  private Display display;

    public ListenerVerdes(Display display) {
        this.display = display;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       Jcalcu aux =(Jcalcu) e.getSource();

       if (aux.getText().equals("+/-")){
          if(display.getNumero().isNegativo()){
              display.getNumero().setNegativo(false);
          }else{
              display.getNumero().setNegativo(true);

          }
         display.setText(display.getNumero().getTexto());
         //System.out.println(display.getNumero().getValue());  
       }
       
       else{
         display.concatenar(aux.getText());
       }

    }

}