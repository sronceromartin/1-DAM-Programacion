/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;


import java.util.Scanner;
public class Ejercicio4Calculadora {
    
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        int num1;
        System.out.print("Introduce un número: ");
        num1=lector.nextInt();
        int num2;
        System.out.print("Introduce otro número: ");
        num2=lector.nextInt();
        char signo;
        System.out.print("Introduce el signo que quieres: ");
        signo=lector.next().charAt(0);
        if(signo=='+'){
        
            int suma=num1+num2;
            System.out.print("Suma = "+ suma);
            
        }else if(signo=='-'){
        
            int resta=num1-num2;
            System.out.print("Resta = "+ resta);
        
        }else if(signo=='/'){
        
            int division=num1/num2;
            System.out.print("División =" + division);
        }else if(signo=='*'){
        
            int multiplicacion=num1*num2;
            System.out.print("Multiplicación="+ multiplicacion);
        }else{
            System.out.print(" La operación introducida es incorrecta ");
        }
    }
    
}
