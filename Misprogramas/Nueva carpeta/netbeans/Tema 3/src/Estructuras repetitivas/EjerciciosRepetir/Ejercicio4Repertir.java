/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repetitivas;

import java.util.Scanner;
public class Ejercicio4Repertir {
    
    public static void main(String[] args) {
        
       
        int contadorA=0;
        int contadorE=0;
        int contadorI=0;
        int contadorU=0;
        int contadorO=0;
        int contador=0;
        do{
            Scanner lector=new Scanner(System.in);
            char caracter;
            System.out.println("Introduce una vocal: ");
            caracter=lector.next().charAt(0);
            if(caracter=='a'){
            
                contadorA=contadorA+1;
                System.out.println("Las veces que se repite A:"+ contadorA);
            
            }else if(caracter=='e'){
            
                contadorE=contadorE+1;
                System.out.println("Las veces que se repite E: "+ contadorE);
            
            }else if(caracter=='i'){
            
            
                contadorI=contadorI+1;
                System.out.println("Las veces que se repite I: "+ contadorI);
                
            
            }else if(caracter=='o'){
            
                contadorO=contadorO+1;
                System.out.println("Las veces que se repite O: "+ contadorO);
            
            }else if(caracter=='u'){
            
            
                contadorU=contadorU+1;
                System.out.println("Las veces que se repite U: "+ contadorU);
           
            }else{
            
                System.out.println("El caracter introducido no es válido");
            
            
            }
             
         contador=contadorA + contadorE + contadorI + contadorU + contadorO;   
         System.out.println("El número de repeticiones son: "+ contador); 
         System.out.println("Las veces que se repite A:"+ contadorA);  
          System.out.println("Las veces que se repite E: "+ contadorE);  
          System.out.println("Las veces que se repite I: "+ contadorI);  
          System.out.println("Las veces que se repite O: "+ contadorO);   
         System.out.println("Las veces que se repite U: "+ contadorU);
        
        }while(contador<10);
        
    }
}
