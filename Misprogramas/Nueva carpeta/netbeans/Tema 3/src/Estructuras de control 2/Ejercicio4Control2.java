/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Scanner;
public class Ejercicio4Control2 {
    
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        int num;
        System.out.println("Introduce un número: ");
        num=lector.nextInt();
        int i=0;
        int j=0;
        String divisor="";// lo ponemos tipo String para que pueda aparecer la coma como sale en el enunciado, divisor va acumulando los divisores de cada múltiplo
        if(num>=0){
            
           
            for(i=3;i<=num;i++){
                
                if(i%3==0){//busco múltiplos de 3, num nos sirve como limite
                    divisor="";// sirve para que se limpie divisor, y no se acumulen los valores de los divisores del anterior m´´ultiplo
                    for(j=1;j<=i;j++){
                        
                        
                        if(i%j==0){
                            
                                
                             divisor=divisor+j+",";
                        
                        }
                    
                    }
                   System.out.println("Múltiplo = " + i + "Divisores del " + i+ "=" + divisor);// lo ponemos fuera para no se repita el multiplo tantas veces como sale en bucle y así solo aparece una vez
                }
                
                
            }
                
           
    }

    }   }