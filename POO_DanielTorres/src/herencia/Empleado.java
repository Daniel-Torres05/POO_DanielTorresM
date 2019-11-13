/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author danie
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private int pago;
    
    public Empleado(){
        this.nombre="desconocido";
         this.apellido="desconocido";
        this.edad=0;
        this.pago=0;
       
    }

    public Empleado(String nombre,String apellido, int edad, int pago) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pago = pago;
      
    }
    
    @Override
    public String toString(){
        
        String mensaje="El empleado se llama "+nombre+" "+apellido+" con "+edad+" años " +
                "y un salario de "+pago;
        return mensaje;
    }

    public String getNombre() {
        return nombre;
    }
 public String getapellido() {
        return apellido;
    }
    
    public int getEdad() {
        return edad;
    }

    public int getPago() {
        return pago;
    }

   
    
}
