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
public class Mecanico extends Empleado {
    private int carArreglados;
    private int anoservicio;
    
    
    public Mecanico(){
        super();
        this.carArreglados=0;
        this.anoservicio=0;
    }
    public Mecanico(String nombre,String apellido, int edad, int pago,int car, int ano){
        super(nombre,apellido,edad,pago);
        this.carArreglados=car;
        this.anoservicio=ano;
    }
@Override
    public String toString(){
        
        String mensaje="El empleado se llama "+Mecanico.super.getNombre()+" "+Mecanico.super.getapellido()+" con "+Mecanico.super.getEdad()+" años " +
                "y un salario de "+Mecanico.super.getPago()+"arreglo"+carArreglados+"carros";
        return mensaje;
    }
    public int getCarArreglados() {
        return carArreglados;
    }

    public int getAnoservicio() {
        return anoservicio;
    }
    
}
