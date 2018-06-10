/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author ASIR 7L
 */
public class Persona {
    
    public String nombre;
    public String apellidos;
    public int anyoNacimiento;
    
    public Persona(String nom,String apells,int aNac){
        this.nombre=nom;
        this.apellidos=apells;
        this.anyoNacimiento=aNac;
    
    }
    public void imprime(){
        System.out.println("Nombre: "+ nombre + "Apellidos: "+ apellidos + "Año de nacimiento: "+ anyoNacimiento );
    
    }
}
