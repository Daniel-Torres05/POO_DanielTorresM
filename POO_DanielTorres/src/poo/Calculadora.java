/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Calculadora {
    private double a;
    private double b;
    private double res;
    private double modulo;
    public Calculadora() {
        this.a=0;
        this.b=0;
    }
    public void menu(){
        String simbo;
        System.out.println("que operacion desea realizar:");
        Scanner simbolo= new Scanner(System.in);
        simbo=simbolo.nextLine();
        switch (simbo){
            case "+":
                System.out.println("introduce los dos numeros:");
                System.out.println(suma());
                menu();
                break;
            case "/":
                System.out.println("introduce los dos numeros:");
                System.out.println(div());
                menu();
                break;
            case "*":
                System.out.println("introduce los dos numeros:");
                System.out.println(mult());
                menu();
                break;
            case "-":
                System.out.println("introduce los dos numeros:");
                System.out.println(rest());
                menu();
                break;
            case "%":
                System.out.println("introduce los dos numeros:");
                System.out.println(mod());
                menu();
                break;
            case "pow":
                System.out.println("introduce los dos numeros:");
                System.out.println(pot());
                menu();
                break;
            case "sqrt":
                System.out.println("introduce los dos numeros:");
                System.out.println(raizcuad());
                menu();
                break;
            case "estado":
                System.out.println("introduce los dos numeros:");
                System.out.println(toString());
                menu();
                break;
            case "salir":
  
                return ;
            default:
                menu();
        }
    }
    public double suma(){
        Scanner v1 = new Scanner(System.in);
        setA(v1);
        Scanner v2 = new Scanner(System.in);
        setB(v2);
        this.res=getA()+getB();
        return this.res;
    }
    public double mod(){
        Scanner v1 = new Scanner(System.in);
        setA(v1);
        Scanner v2 = new Scanner(System.in);
        setB(v2);
        this.res=getA()%getB();
        this.modulo=this.res;
        return this.res;
    }
    public double div(){
        Scanner v1 = new Scanner(System.in);
        setA(v1);
        Scanner v2 = new Scanner(System.in);
        setB(v2);
        this.res= getA()/getB();
        return this.res;
    }
    public double mult(){
        Scanner v1 = new Scanner(System.in);
        setA(v1);
        Scanner v2 = new Scanner(System.in);
        setB(v2);
        this.res= getA()*getB();
        return this.res;
    }
    public double pot(){
        Scanner v1 = new Scanner(System.in);
        setA(v1);
        Scanner v2 = new Scanner(System.in);
        setB(v2);
        this.res= Math.pow(getA(), getB());
        return this.res;
    }
    public double rest(){
        Scanner v1 = new Scanner(System.in);
        setA(v1);
        Scanner v2 = new Scanner(System.in);
        setB(v2);
        this.res= getA()-getB();
        return this.res;
    }
    public double raizcuad(){
        Scanner v1 = new Scanner(System.in);
        setA(v1);
        this.res= Math.sqrt(getA());
        return this.res;
    }

    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(Scanner a) {
        this.a = a.nextDouble();
    }

    /**
     * @return the b
     */
    public double getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(Scanner b) {
        this.b = b.nextDouble();
    }

    /**
     * @return the Res
     */
    public double getRes() {
        return res;
    }

    /**
     * @return the modulo
     */
    public double getModulo() {
        return modulo;
    }

    @Override
    public String toString() {
        String estado="El primer numero es= "+getA()+"\nEl otro es= "+getB()+"\n"
                + "El resultado de la operacion anterior es: "+getRes()+""
                + "\nEl modulo es= "+getModulo()+"\n";
        return estado; //To change body of generated methods, choose Tools | Templates.
    }
    
}

