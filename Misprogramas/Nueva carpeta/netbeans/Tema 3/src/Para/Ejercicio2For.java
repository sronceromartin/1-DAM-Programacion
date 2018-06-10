/*
Diseña un algoritmo que lee cinco valores numéricos y calcula su producto
 */
package para;

import java.util.Scanner;
public class Ejercicio2For {
    
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        int num;
        int producto=1;
        int i;
        for(i=0;i<5;i++){
        
           System.out.println("Introduce un número: ");
           num=lector.nextInt();
           producto=producto*num;
        }
        System.out.println("El producto será: "+ producto);
    }
}
