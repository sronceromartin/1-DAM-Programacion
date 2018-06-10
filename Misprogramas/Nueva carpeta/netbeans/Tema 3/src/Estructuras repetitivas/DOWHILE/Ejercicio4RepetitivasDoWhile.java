/*
 Diseña un algoritmo que muestre los números comprendidos entre dos números
introducidos desde el teclado en orden descendente
 */
package repetitivas;

import java.util.Scanner;
public class Ejercicio4RepetitivasDoWhile {
    
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        int a;
        System.out.println("Introduce un número: ");
        a=lector.nextInt();
        int b;
        System.out.println("Introduce otro número: ");
        b=lector.nextInt();
        int contador=0;
        int max=0;
        int min=0;
        
        if(a>b){
            max=a;
            min=b;
        
        }else{
            max=b;
            min=a;
        
        }
        contador=max;
        
        do{
        
            System.out.println(contador);
            contador--;
        
        }while(contador>=min);
    }
}
