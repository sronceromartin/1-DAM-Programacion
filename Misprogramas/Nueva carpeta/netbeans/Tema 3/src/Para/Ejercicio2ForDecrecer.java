/*
Diseña un algoritmo que muestre los números comprendidos entre el 1 y un número introducido por teclado en orden descendente. 
 */
package para;

import java.util.Scanner;

public class Ejercicio2ForDecrecer {
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        int num,n;
        System.out.println("Introduce un número: ");
        n=lector.nextInt();
        
        for(num=n;num>=1;num--){ // irá desde n decreciendo hasta 1
        
            System.out.println(num);
        
        
        }
    }
}
