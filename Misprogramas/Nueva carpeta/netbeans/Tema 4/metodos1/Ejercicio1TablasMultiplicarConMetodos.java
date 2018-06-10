/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos1;

import java.util.Scanner;
public class Ejercicio1TablasMultiplicarConMetodos {
    
    public static void main(String[] args) {
        int num;
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduce un número para calcular su tabla de multiplicar: ");
        num=lector.nextInt();
           
              
            
             
           
            
        
        
           System.out.println(tabla(num)); 
        
        
    }    
    
    static int tabla(int a){
           int i,j = 0,mult=0;
           
           for(i=1;i<=10;i++){
                
                for(j=a;j<a;j++){
                
                }
                mult=i*j;
                System.out.printf("%2d x %2d = %2d \n",i,j,i*j);
            }
            return mult;
    }
}