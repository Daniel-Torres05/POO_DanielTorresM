/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionorientadaobjetos2020.pkg1;

/*import gui.NuevoJFrame;
import herencia.Empleado;
import herencia.Expecialista;
import herencia.Mecanico;
import java.awt.Color;
import javax.swing.JFrame;
import poo.Alumno;
import poo.Audifonos;
import poo.Cable;
import poo.Celular;
import poo.Gato;
import poo.Lapiz;
import poo.Laptop;
import poo.Lentes;
import poo.Lonchera;
import poo.Mause;
import poo.Pantalon;
import poo.Perfume;
import poo.Perro;
*/
//import poo.Tenis;
//import poo.Yoghurt;

import coleccion.ArregloObjetos;
import poo.Persona;
//import poo.Profesor;
import java.util.ArrayList;

import java.util.LinkedList;

import java.util.List;
/**
 *
 * @author danie
 */
public class ProgramacionOrientadaObjetos20201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*Persona beto = new Persona("Skabe", 19, 1.8, 92, "Masculino");
        System.out.println(beto.getNombre());
       System.out.println(beto.getEdad());
         System.out.println(beto.toString());*/
         /* List<Persona> listaarray = new ArrayList<Persona>();

            List<Persona> listalinked = new LinkedList<Persona>();

            long antes;

            for(int i=0;i<100;i++)

            {

               listaarray.add(new Persona(i,"Persona"+i,i));  // En este ejemplo cada persona lleva datos ficticios

                listalinked.add(new Persona(i,"Persona"+i,i));

            }

            System.out.println("Tiempo invertido en insertar una persona en listaarray (en nanosegundos):");

            antes = System.nanoTime();

            listaarray.add(0,new Persona(10001,"Prueba",10001)); // Inserción en posicion 0 de una persona

            System.out.println(System.nanoTime()- antes); 

            System.out.println("Tiempo invertido en insertar una persona en listalinked (en nanosegundos):");

            antes = System.nanoTime();

            listalinked.add(0,new Persona(10001,"Prueba",10001));  // Inserción en posicion 0 de una persona

            System.out.println(System.nanoTime()- antes
        */
       /* Gato kiri = new Gato("cat", 2, "persa");
        kiri.setNombre("mishi");
        System.out.println(kiri.getNombre());
        Audifonos skull = new Audifonos("bits", 3000, "rojo");
        skull.setMarca("candy");
        System.out.println(skull.getMarca());
        Cable largo = new Cable("xiaomi", 200, 3);
        largo.setPrecio(250);
        System.out.println(largo.getPrecio());
        Celular negro = new Celular("xiaomi", 4000, "negro");
        negro.setColor("blanco");
        System.out.println(negro.getColor());
        Lapiz pun = new Lapiz("bic", 2, "amarillo");
        pun.setColor("negro");
        System.out.println(pun.getColor());
        Laptop pc = new Laptop("dell", 8000, "gris");
        pc.setMarca("HP");
        System.out.println(pc.getMarca());
        Lentes asd = new Lentes("converse", 1500,"transparentes");
        asd.setTipo("sol");
        System.out.println(asd.getTipo());
        Lonchera xdr = new Lonchera("nike", 300, "rosa");
        xdr.setColor("azul");
        System.out.println(xdr.getColor());
        Mause rata = new Mause("redDragon", 500, "rojo");
        rata.setPrecio(800);
        System.out.println(rata.getPrecio());
        Pantalon pans = new Pantalon("lives", 250, 34);
       pans.setPrecio(800);
        System.out.println(pans.getPrecio());
        Perfume olor = new Perfume("gucci", 2500, 600);
       olor.setMarca("Victoria");
       System.out.println(olor.getMarca());
        Perro dog= new Perro("poki", 3,"hasky");
        dog.setNombre("lobo");
        System.out.println(dog.getNombre());
        Tenis pe = new Tenis("Lebron_James", 2500, 30);
        pe.setMarca("Curry");
        System.out.println(pe.getMarca());
        Yoghurt jairo= new Yoghurt("Yakult", "fresa", 300);
        jairo.setGramos(600);
        System.out.println(jairo.getGramos());
                
        Alumno chochos = new Alumno("angel",19,1.9,89,"hombre",43423,93);
        System.out.println(chochos.getNombre());
        System.out.println(chochos.getCodigo());
        System.out.println();
        Profesor chendo = new Profesor("Rosendo", 30, 2.0, 100, "HOMBRE", "calculo", "doctorado");
        System.out.println(chendo.getGradoEstudio());
        */
        /*
        Empleado ruben = new Empleado("carlos","jimenez",25,99311);
        System.out.println(ruben.getNombre());
     
       Mecanico aceite= new Mecanico();
       System.out.println(aceite.getNombre());
       System.out.println(aceite.toString());
       
       Expecialista prro= new Expecialista();
       System.out.println(prro.getPago());
        
       Empleado empleado1=new Empleado("Fernando", "Ureña", 23, 600);
        Empleado empleado2=new Empleado("Antonio", "Lopez", 28, 900);
        Empleado empleado3=new Empleado("Alvaro", "Perez", 19, 800);
 
        //Mostramos la informacion del objeto
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        
        System.out.println(empleado2==empleado3);
            
        NuevoJFrame aux = new NuevoJFrame("mi nuevo jframe",300,400);
        JFrame aux2 = new JFrame("jframe");
        aux2.setSize(600,400);
        aux2.setVisible(true);
        aux2.setBackground(Color.GREEN);
        //aux2.createImage(200,150);
 
        JFrame aux3 = new JFrame();
        aux3.setVisible(true);
                */
        ArregloObjetos.main2(args);
        
    }
    
}
