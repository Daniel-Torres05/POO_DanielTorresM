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
public class Genericlass <T> {
    T obj;
    public Genericlass(T o){
        obj =o;
        
    }
      public void classType() {
    System.out.println("la Clase asignada a T es: " + obj.getClass().getName());
  }
}      

