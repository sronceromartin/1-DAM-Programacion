/*
 Diseñar un algoritmo que calcule y muestre la suma de números introducidos por
teclado hasta que dicha suma sea mayor que 1000
 */
package repetitivas;

import java.util.Scanner;
public class Ejercicio10Repetitivas {
    
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        int num;
        int suma=0;
        
        
        while(suma<=1000){// la suma de los números es la que limita que se pare o no
            
            System.out.println("Introduce un número: ");
            num=lector.nextInt();
            suma=suma+num;
           
        
        }
        System.out.println("La suma es: "+ suma);
        
    }
}
