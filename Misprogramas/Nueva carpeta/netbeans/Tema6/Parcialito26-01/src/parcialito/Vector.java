/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialito;

import java.util.Scanner;
public class Vector {
    
    
    public static void ejercicio5(){
        Scanner lector=new Scanner(System.in);  
        int vector[]=new int[10];
        int i;
        int contador=0;
        for(i=0;i<vector.length;i++){
            System.out.println("Introduce un número: ");
            vector[i]=lector.nextInt();
            if(vector[i]>10){
                 System.out.println("Vector: "+ vector[i]+ "Posicion: "+ i);
                contador++;
            }
            System.out.println("Vector: "+ vector[i]);
        }
       
       
        System.out.println("Elementos mayores de 10: "+ contador);
    
    
    
    
    }
  
    
    
    
    public static void main(String[] args) {
        ejercicio5();
    }
}
