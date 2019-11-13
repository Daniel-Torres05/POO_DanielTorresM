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
public class Expecialista extends Mecanico {
    private String especialidad;
    private String herramienta;
    
    public Expecialista(){
        super();
        this.especialidad="desconocido";
        this.herramienta="desconocido";
    }
    public Expecialista(String nombre,String apellido, int edad, int pago,int car, int ano,String esp, String her){
    super(nombre,apellido,edad,pago,car,ano);
    this.especialidad=esp;
    this.herramienta= her;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getHerramienta() {
        return herramienta;
    }
    
}
