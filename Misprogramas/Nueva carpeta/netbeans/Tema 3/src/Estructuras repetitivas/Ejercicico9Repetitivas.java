/*
 Diseña un algoritmo que calcule la potencia de un número por productos sucesivos
dada la base y el exponente.
 */
package repetitivas;

import java.util.Scanner;
public class Ejercicico9Repetitivas {
    
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        int base;
        System.out.println("Introduce una base: ");
        base=lector.nextInt();
        int exponente;
        System.out.println("Introduce un exponente: ");
        exponente=lector.nextInt();
        int result=1;
        int contador=0;
        
        while(contador<exponente){//el contador limita el exponente
        
            result=result*base;//en result tenemos las veces que se repite la base 
            contador++;
        
        }
        System.out.println("El resultado es : "+ result);
        
        
    }
}
