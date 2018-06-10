/*
Diseñar un algoritmo que realice y muestre el producto de dos números enteros
positivos introducidos por teclado utilizando sumas sucesivas.
 */
package repetitivas;

import java.util.Scanner;
public class Ejercicio11Repetitivas {
    
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        int a;
        System.out.println("Introduce un número: ");
        a=lector.nextInt();
        int b;
        System.out.println("Introduce el número de veces que se repite: ");
        b=lector.nextInt();
        int suma=0;
        int contador=1;// ponemos el contador en 1 para que sume en lugar de multiplicar
        
                if(a>=0 && b>=0){
        
                while(contador<=b){
                
                    suma=suma+a;//lo hacemos así porque a es el que se suma x veces
                    contador++;
                }
                System.out.println("El resultado es :" + suma);
                
            }else{
            
                System.out.println("El número introducido es negativo");
            
            }
        
        
        
    }
}
