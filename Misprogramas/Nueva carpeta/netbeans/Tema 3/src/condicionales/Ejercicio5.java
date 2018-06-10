/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Scanner;
public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        int num1;
        System.out.print("Introduce un número: ");
        num1=lector.nextInt();
        int num2;
        System.out.print("Introduce otro número: ");
        num2=lector.nextInt();
        if(num1>num2){
        
            System.out.print(num1 + " es mayor que " + num2);
        
        }else if(num1<num2){
        
            System.out.print(num2 + " es mayor que " + num1);
        
        }else{
        
            System.out.print(num1 + " es igual que " + num2);
        
        }
        
    }
    
}
