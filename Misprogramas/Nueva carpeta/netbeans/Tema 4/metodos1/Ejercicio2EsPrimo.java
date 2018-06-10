/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos1;

import java.util.Scanner;
public class Ejercicio2EsPrimo {
    
    public static void main(String[] args) {
        int num;
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduce un número: ");
        num=lector.nextInt();
        int i=2,contador=1;//el contador tiene que empezar en 1
        boolean primo=true;
        
        while(i<contador&&primo){
            
            if(contador%i==0){
                primo=false;
            
            }
            i++;
        }
    }
}
