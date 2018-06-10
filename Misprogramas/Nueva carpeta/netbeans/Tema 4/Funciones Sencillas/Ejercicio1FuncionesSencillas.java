/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionesSencillas;

import java.util.Scanner;
public class Ejercicio1FuncionesSencillas {
     public static void main(String[] args) {
        
         Scanner lector=new Scanner(System.in);
         int num,resultado;
         System.out.println("Introduce un número: ");
         num=lector.nextInt();
         resultado=potencia(num);
         System.out.println("El resultado será: "+ resultado);
         
    }
     static int potencia(int num){
         int contador=0,exp=1;//tiene que empezar en 1 para que pueda avanzar
              
        while(exp<num){
            exp=2*exp;
            contador++;
        }    
            return contador;
        
         
     }

}