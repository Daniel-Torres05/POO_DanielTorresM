/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccion;

/**
 *
 * @author danie
 */
public class Carro {
    private String marca;
    private String color;

    public Carro(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", color=" + color + '}';
    }
 
    
    
}
