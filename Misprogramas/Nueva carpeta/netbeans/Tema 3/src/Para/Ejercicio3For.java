/*
Diseña un algoritmo que calcule y muestre la suma de una serie de números
introducidos por teclado, siendo introducido por teclado el número de valores que
hay que leer.
 */
package para;

import java.util.Scanner;
public class Ejercicio3For {
    
    public static void main(String[] args) {
        int i,num,n;
        int suma=0;
        
        
        Scanner lector=new Scanner(System.in);
            System.out.println("¿Cuántos números vas a introducir?");
            n=lector.nextInt();//tiene que ir fuera para que pida el número de veces y luego utilizarlo en el bucle
        
        for(i=1;i<=n;i++){
        
            
            
            System.out.println("Introduce un número: ");
            num=lector.nextInt();
            
            suma=suma+num;
            
        
        }
            System.out.println("El resultado será: "+ suma);//tiene que ponerse fuera del bucle para que se pueda imprimir
    }
}
