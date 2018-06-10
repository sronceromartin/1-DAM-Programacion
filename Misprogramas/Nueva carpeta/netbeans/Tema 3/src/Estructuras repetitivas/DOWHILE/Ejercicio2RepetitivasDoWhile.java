/*
Diseña un algoritmo que sume los números comprendidos entre el 1 y un número introducido por el usuario a través del teclado. Si el número introducido es <1 la suma será 0. 
 */
package repetitivas;

import java.util.Scanner;
public class Ejercicio2RepetitivasDoWhile {
    
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        int num2;
        System.out.println("Introduce un número: ");
        num2=lector.nextInt();
        int suma=0;
        int num=1;
        
        do{
            suma=suma+num;
            
            num=num+1;
        
        }while(num<=num2);// esta es la clave
        
            System.out.println("La suma es: "+ suma);// lo pongo aquí para que no entre en el bucle
    }
}
