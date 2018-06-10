/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 Diseña un algoritmo que muestre los números comprendidos entre dos números introducidos desde el teclado en orden ascendente 
 */
package repetitivas;


 
import java.util.Scanner;
public class Ejercicio3RepetitivasDoWhile {
    
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        int a;
        System.out.println("Introduce un número: ");
        a=lector.nextInt();
        int b;
        System.out.println("Introduce otro número: ");
        b=lector.nextInt();
        int max=0;
        int min=0;
        int contador=0;
        
        if(a>b){
                max=a;
                min=b;
                
                
            }else{
                max=b;
                min=a;
            
            }
        
            contador=min;//tiene que ir fuera del bucle para que pueda empezar a ejecutarse
        do{
            
                
                 System.out.println(contador);
                contador++;//el contador se incrementa
           
            
            
        }while(contador<=max);
            
           
    }
}



