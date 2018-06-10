/*
 1. Diseña un algoritmo que visualice los 50 primeros números enteros. 
 
 */
package repetitivas;

/**
 *
 * @author Siby
 */
public class Ejercicio1RepetitivasDoWhile {
    
    public static void main(String[] args) {
        
        int num=1;
       
        
        do{
            
            System.out.println("numeros: "+ num);
            num=num+1;//se incrementa después de que se imprima el número
            
        }while(num<=50);
                
    
    
    
    }
}
