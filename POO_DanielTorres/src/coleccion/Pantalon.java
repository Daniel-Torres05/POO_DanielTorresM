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
public class Pantalon {
    private String color;
    private String marca;
    private String tela;

    public Pantalon(String color, String marca, String tela) {
        this.color = color;
        this.marca = marca;
        this.tela = tela;
    }

    @Override
    public String toString() {
        return "Pantalon{" + "color=" + color + ", marca=" + marca + ", tela=" + tela + '}';
    }
    
    
}
