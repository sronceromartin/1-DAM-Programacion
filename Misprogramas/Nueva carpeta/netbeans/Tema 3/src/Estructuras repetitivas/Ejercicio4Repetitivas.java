/*
Diseña un algoritmo que muestre los números comprendidos entre dos números
introducidos desde el teclado en orden descendente
 */
package repetitivas;

import java.util.Scanner;
public class Ejercicio4Repetitivas {
    
    public static void main(String[] args) {
                
        Scanner lector=new Scanner(System.in);
        int a;
        System.out.println("Introduce un número: ");
        a=lector.nextInt();
        int b;
        System.out.println("Introduce otro número: ");
        b=lector.nextInt();
        int max;
        int min;
        int contar;
        
        if(a>b){
        
            max=a;
            min=b;
        
        }else{
        
            max=b;
            min=a;
        
        }
        
            contar=max;//para que los números salgan de mayor a menor
            while(contar>=min){
            
                System.out.println(contar);
                contar=contar-1;
            
            }
    }
    
}
