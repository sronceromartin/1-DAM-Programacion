/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        int pasos;
        System.out.print(" Introduce el número de pasos: ");
        pasos=lector.nextInt();
        
        if(pasos<=5){
        
            System.out.print(" El coste de la llamada será de 0.10 centimos");
            
        }else if(pasos>5){
        
            System.out.print(" El coste de la llamada será de 0.05 centimos");
        
        }else{
        
            System.out.print(" No se puede calcular");
        
        }
        
    }
    
}
