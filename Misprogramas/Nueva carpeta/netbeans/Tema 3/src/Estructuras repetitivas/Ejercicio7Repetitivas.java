/*
 Diseñar un algoritmo correspondiente a un programa que lee un número entero
positivo y determina el número de dígitos decimales necesarios para la representación
de dicho valor
 */
package repetitivas;

import java.util.Scanner;
public class Ejercicio7Repetitivas {
    
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        int num;
        System.out.println("Introduce un número: ");
        num=lector.nextInt();
        int divisor=10;
        int cociente=0;
        int digitos=0;//contador para saber cuantas veces se ha ejercutado
        if(num==0){
                digitos=1;
                
        }else{
        
            while(num>0 || cociente!=0){//es la condicion por la que para el bucle
        
            cociente=num/divisor;
            num=num/10;
            digitos=digitos+1;//conforme decrece el número aumenta el numero de digitos
            
            
            }
        }
        
        System.out.println("El número de digitos será: "+ digitos);
    }
}
