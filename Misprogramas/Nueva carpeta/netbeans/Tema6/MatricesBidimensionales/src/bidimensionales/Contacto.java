/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidimensionales;

/**
 *
 * @author Siby
 */

public class Contacto {
    
    String nombre;
    String Apellido1;
    String Apellido2;
    String telefono;
       
    public Contacto(String nom,String apell1,String apell2,String telf){
        this.nombre=nom;
        this.Apellido1=apell1;
        this.Apellido2=apell2;
        this.telefono=telf;
    }
    public void verContacto(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: "+ Apellido1);
        System.out.println("Apellidos: "+ Apellido1);
        System.out.println("Teléfono: "+ telefono);
    
    
    }
    @Override
    public String toString(){
        return "Nombre: "+ nombre + "Apellidos: "+ Apellido1 + " " + Apellido2 + "Teléfono: "+telefono;
    
    }
    
   
        
    
    
    
}
