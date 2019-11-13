/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author danie
 */
public class ListenerOpera implements ActionListener {
    
     private Display display;

    public ListenerOpera(Display display) {
        this.display = display;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
       Jcalcu aux = (Jcalcu) e.getSource();
       switch(aux.getText()){

           case "+":{

           break;
           }
           case "-":{

           break;
           }
           case "X":{

           break;
           }
           case "/":{
          System.out.println();
           break;
           }
           case "=":{
          System.out.println();
           break;
           }
           case "?":{
               System.out.println();
               JOptionPane.showMessageDialog(null, "Daniel Torres Montañez");
               break;
           }


       }
    }

    
}
