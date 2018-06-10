/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

/**
 *
 * @author Siby
 */
import java.util.Scanner;

public class Ejercicio2Alternativas {
    
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        int num;
        System.out.print(" Introduce un número: ");
        num=lector.nextInt();
        
        if(num%2==0){
        
            System.out.print(" El número introducido es par ");
                   
        }else{
        
            System.out.print(" El número introducido es impar ");
        
        }
        
        
    }
    
}
