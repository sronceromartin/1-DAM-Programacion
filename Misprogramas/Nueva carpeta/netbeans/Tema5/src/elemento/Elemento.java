/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elemento;

/**
 *
 * @author Siby
 */
public class Elemento {
    
    static String nombre;// es un atributo de la clase el cual es static
    static int numElementos;
    
   public Elemento(){
   
       numElementos++;
   
   } 
    
   static int numeroDeElementos(){
   
       return numElementos;
   
   
   } 
   

    public static void main(String[] args) {
        
        Elemento e1= new Elemento();
        Elemento e2= new Elemento();
        
        System.out.println("El número de elementos que tendremos serán: "+ e1.numeroDeElementos());
        
    }
    
    
}
