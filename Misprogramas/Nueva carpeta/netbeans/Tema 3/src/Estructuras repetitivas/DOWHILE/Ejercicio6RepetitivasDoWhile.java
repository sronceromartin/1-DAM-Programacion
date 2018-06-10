/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repetitivas;

/**
 *
 * @author DAM 6J
 */
import java.util.Scanner;
public class Ejercicio6RepetitivasDoWhile {
    
    public static void main(String[] args) {
        
        Scanner lector= new Scanner(System.in);
        int num;
        System.out.println("Introduce un número: ");
        num=lector.nextInt();
        int num2 = num;//lo que hace la variable es guardar el número antes de que se modifique
        int contador=1;//ponemos el contador a 1 para que cuando se multiplique por el numero introducido de bien
        
        do{
        
            contador=contador*num;
            num=num-1;
            
        
        }while(num>1);
            System.out.println("El factorial de "+ num2+ "=" + contador);
        
        
    }
}
