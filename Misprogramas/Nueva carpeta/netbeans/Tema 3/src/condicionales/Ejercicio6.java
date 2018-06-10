/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;
import java.util.Scanner;
public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        Scanner lector= new Scanner(System.in); 
        int num1;
        System.out.print("Introduce un número: ");
        num1=lector.nextInt();
        int num2;
        System.out.print("Introduce otro número: ");
        num2=lector.nextInt();
        int num3;
        System.out.print("Introduce otro número: ");
        num3=lector.nextInt();
        
	if(num1<num2&& num1<num3&& num2< num3){
            System.out.print(num1+ " es menor que "+ num2 + " y " + num2+ " es menor que "+ num3);
        
        }else if(num1<num2&& num1<num3&& num3< num2){
            System.out.print(num1+ " es menor que "+ num2 + " y " + num3 + " es menor que "+ num2);
        
        }else if(num2<num1&& num2<num3&& num1< num3){
            System.out.print(num2+ " es menor que "+ num1 + " y " + num1 + " es menor que "+ num3);
        
        }else if(num2<num1&& num2<num3&& num3< num1){
            System.out.print(num2+ " es menor que "+ num1 + " y " + num3 + " es menor que "+ num1);
        
        }else if(num3<num1&& num3<num2&& num1< num2){
            System.out.print(num3+ " es menor que "+ num1 + " y "+ num1 + " es menor que "+ num2);
        
        }else if(num3<num1&& num3<num2&& num2< num3){
            System.out.print(num3+ " es menor que "+ num1 + " y "+ num2 + " es menor que "+ num1);
        
        }else{
	
		System.out.print(" Fallo en el programa");		
	
	}
        
        
    }
    
    
}
