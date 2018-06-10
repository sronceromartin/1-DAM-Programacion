/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5.elemento;

/**
 *
 * @author Siby
 */
public class Elemento {
    
    private String nombre;// es un atributo de la clase el cual es static
    private static int numElementos=0;//lo inicializamos a 0 pq se supone que no hay ninguno al principio
    
   public Elemento(String nom){
       nombre=nom;
       numElementos++;
   
   } 
    
   static int numeroDeElementos(){
   
       return numElementos;
   
   
   } 
   

    public static void main(String[] args) {
        
        Elemento e1= new Elemento("Oxígeno");
        Elemento e2= new Elemento("Hierro");
        
        System.out.println("El número de elementos que tendremos serán: "+ e1.numeroDeElementos());//podría poner cualquiera de los dos objetos, ya que me darían lo mismo
        
    }
    
    
}
