/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcion;

/**
 *
 * @author Siby
 */
import java.util.Scanner;
public class PruebaEdad {
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        String nom;
        System.out.println("Introduce tu nombre: ");
        nom=lector.nextLine();
        Persona p= new Persona(nom);
        boolean leido=false;
        do{
           try{
               int edad;
               System.out.println("Introduce tu edad: ");
               edad=lector.nextInt();
               p.ponerEdad(edad);
               leido=true;
           }catch(EdadException e){
               System.out.println(e.getMessage());
           
           } 
            
      
        }while(!leido);
    }
}
