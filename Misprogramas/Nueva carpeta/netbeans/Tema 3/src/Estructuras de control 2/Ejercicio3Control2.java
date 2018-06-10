/*
Números primos:
1) Programa que lea un número y diga si es primo o no (Un número primo es divisible
únicamente por 1 y por si mismo)
2) Amplía el programa anterior para que muestre todoslos números primos menores
que un número introducido por teclado. Este número debe ser mayor que 4, si no,
se volverá a pedir otro número.
 */
package control;

import java.util.Scanner;
public class Ejercicio3Control2 {
    
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
      int num;
        int i=0;// 
        int contador=1;
       
        System.out.println("Introduce un número: ");
        num=lector.nextInt();
        
       for(i=2;i<num+1;i++){ //lo inicializamos en dos para que empiece a comprobar, pq sabemos que es divisible en 1, después a num le sumamos 1.
        
            if(num%i==0){
                
                
                contador++;
               
            }
                   
        }if(contador!=2){
            System.out.println("El número no es primo"); 
        
        }else{
        
             System.out.println("El número es primo");
        
        }
    }
}

        
