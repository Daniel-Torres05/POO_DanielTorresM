/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 * Crear objetos
 * @author danie
 */
public class Persona {
    
  private int idPersona;

    private String nombre;

    private int altura;

    public Persona() {
        this.idPersona = 0;
        this.nombre = "";
        this.altura = 0;
    }

 

    public Persona(int idPersona, String nombre, int altura) {

        this.idPersona = idPersona;

        this.nombre = nombre;

        this.altura = altura;}

 

    @Override

    public String toString() {

        return "Persona-> ID: "+idPersona+" Nombre: "+nombre+" Altura: "+altura+"\n";

    }
    
  // public  void saludar(){
       // System.out.println("Hola mundo");
    //} 

    public String getNombre() {
        return nombre;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public int getAltura() {
        return altura;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

   
   
    
    
}
