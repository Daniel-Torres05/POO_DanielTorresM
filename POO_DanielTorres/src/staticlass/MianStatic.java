/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticlass;



/**
 *
 * @author danie
 */
public class MianStatic {
   public int aux; 
   public static int contador=0;
   
   public MianStatic() {
        contador= contador+1;
   }
   public static void main(String[] args) {
       
      /* MianStatic a = new MianStatic();
       MianStatic b = new MianStatic();
       MianStatic c = new MianStatic();
       MianStatic d = new MianStatic();
              */
       
       System.out.println(MianStatic.contador);
        Genericlass<Integer> intObj = new Genericlass<Integer>(88);
    intObj.classType();
 
    // Creamos una instancia de ClaseGenerica para String.
    Genericlass<String> strObj = new Genericlass<String>("Test");
    strObj.classType();
       
   }

    
    
    
       
 }

