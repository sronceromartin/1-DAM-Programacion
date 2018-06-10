/*
Diseñar un algoritmo que realice la división de dos números enteros positivos
introducidos a través del teclado mediante restas sucesivas, mostrando el cociente y
el resto.
 */
package repetitivas;

import java.util.Scanner;

public class Ejercicio12Repetitivas {
     
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int dividendo;
        System.out.println("Introduce el dividendo: ");
        dividendo=lector.nextInt();
        int divisor;
        System.out.println("Introduce el divisor: ");
        divisor=lector.nextInt();
        int cociente=0;
        int resto=0;
       
       
        
        if(divisor>0){
            
            while(dividendo>=divisor){
                resto=dividendo-divisor;
                dividendo=resto;//una vez realizada la division el dividendo toma el valor del resto anterior
                cociente++; //el cociente va aumentando en 1         
            
            }
                System.out.println("Resto: "+ resto);
                System.out.println("Cociente: "+ cociente);
                
                
        
        }else{
        
            System.out.println("No se puede dividir entre 0 o entre un número negativo");
        
        
        }


    }
}
