/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author danie
 */
public class NumeroDisplay {
  private String texto;
    private boolean negativo;
    private boolean punto;

    public void setPunto(boolean punto) {
        this.punto = punto;
    }

    public boolean isPunto() {
        return punto;
    }

    public NumeroDisplay() {
        this.texto = "";
        negativo = false;
        punto = false;
    }

    public NumeroDisplay(String texto) {
        this.texto = texto;
        this.negativo = false;
    }


    public void concatenar(String texto){
        this.setTexto(this.getTexto() + texto);

    }

    public double getValue(){
        double valor=new Double(this.getTexto());
        if (isNegativo()){
           valor=new Double(texto.substring(1));
           return valor*-1;
        }
        return valor;
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * @return the negativo
     */
    public boolean isNegativo() {
        return negativo;
    }

    /**
     * @param negativo the negativo to set
     */
    public void setNegativo(boolean negativo) {
        this.negativo = negativo;
        if(negativo==true){
            this.texto="-"+texto;
        }else{
            this.texto=texto.substring(1);
        }
    }

}