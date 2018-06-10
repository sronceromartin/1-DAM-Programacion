/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author Siby
 */
class Persona2 {
    public static void main(String[] args) {
        
        Persona p=new Persona();
        System.out.println("Datos: ");
        System.out.println("Nombre: " + p.suNombre());
        System.out.println("Apellidos: "+ p.suApellido1() + p.suApellido2());
        System.out.println("Edad: "+ p.suEdad());
        
        Persona p1=new Persona("Juan","Lopez","Lopez");
        System.out.println("Datos: ");
        System.out.println("Nombre: " + p1.suNombre());
        System.out.println("Apellidos: "+ p1.suApellido1() + p1.suApellido2());
        System.out.println("Edad: "+ p1.suEdad());
        
        Persona p3=new Persona(33);
        System.out.println("Datos: ");
        System.out.println("Nombre: " + p3.suNombre());
        System.out.println("Apellidos: "+ p3.suApellido1() + p3.suApellido2());
        System.out.println("Edad: "+ p3.suEdad());
        

    }
    
}
