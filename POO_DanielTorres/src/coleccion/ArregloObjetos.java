/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccion;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class ArregloObjetos {
     public static void main2(String[] args) {
         ArrayList<Object> arregloaux = new ArrayList<>(3);
         Carro aux1 = new Carro("honda", "negro");
         Gato aux2 = new Gato("kiri", "arabe", "azul");
         Pantalon aux3 = new Pantalon("negro", "Suprime", "algodon");
         arregloaux.add(aux1);
         arregloaux.add(aux2);
         arregloaux.add(aux3);
         
         for(Object aux4: arregloaux){
             System.out.println(aux4.toString());
             
         }
     }
}
