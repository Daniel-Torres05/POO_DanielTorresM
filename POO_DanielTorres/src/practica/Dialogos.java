/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Dialogos implements ActionListener{
     @Override
    public void actionPerformed(ActionEvent e) {
       Jboton aux = (Jboton) e.getSource();
       switch(aux.getText()){

           case "primero":{
               
                String resp = (String) JOptionPane.showInputDialog(null,"Escriba la respuesta correcta","showInputDialog",JOptionPane.INFORMATION_MESSAGE);
           break;
           }
           case "segundo":{
      int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro?","Seleccione una opción", JOptionPane.YES_NO_OPTION);
 
           break;
           }
           case "tercero":{
                JOptionPane.showMessageDialog(null, "Este es un mensaje simple","showMessageDialog",JOptionPane.WARNING_MESSAGE);
              break;
           }
           case "cuarto":{
         
               int seleccion = JOptionPane.showOptionDialog(null, "Este es un cuadro de dialogo Option", "showOptionDialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Si", "No","Cancelar"}, "Si");
          
               break;
           }
           case "quinto":{
          JOptionPane.showMessageDialog(null, "Ocurrio un error", "ERROR!", JOptionPane.ERROR_MESSAGE);
           break;
           }
       }
    }
}
       
