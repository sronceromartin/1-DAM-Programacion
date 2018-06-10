/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

import java.io.Serializable;

/**
 *
 * @author Siby
 */
public class Contacto implements Serializable{
    public String nombre;
    public String Apellidos;
    public String telefono;
       
    public Contacto(String nom,String apell,String telf){//para crear un contacto de verdad
        this.nombre=nom;
        this.Apellidos=apell;
        this.telefono=telf;
    }
    
    public Contacto(String nom){//creo este constructor para cuando haga la busqueda del contacto
        this.nombre=nom;
    }
    public void verContacto(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: "+ Apellidos);
        System.out.println("Teléfono: "+ telefono);
    
    
    }
    @Override
    public String toString(){
        return "Nombre: "+ nombre + "\n Apellidos: "+ Apellidos + "\n Teléfono: "+telefono;
    
    }
  
    public int compareTo(Contacto c){ // aqui como el string tiene un compareTo no ponemos un if, si no que devolvemos lo que de (1,0 o -1)
        return this.nombre.compareTo(c.nombre); //solo lo utilizamos cuando tenemos que ordenar por nombre, telefono o lo que sea          
        
        //return // -1, 0, 1
    }
    
    @Override
    public boolean equals (Object o){//lo utilizamos para el remove()
        Contacto c;//hago una variable de tipo contacto
        c=(Contacto)o;//hago un casting de objeto pasarlo a contacto
        return nombre.equalsIgnoreCase(c.nombre);//para que no tenga en cuenta las mayúsculas o minúsculas
    }
    
   
        
    
    
    
}


