/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionesSencillas;

import java.util.Scanner;
public class Ejercicio3FuncionesSencillas {
    
    public static void main(String[] args) {
        int num;
        do{
            
            Scanner lector=new Scanner(System.in);
            System.out.println("Introduce un número: ");
            num=lector.nextInt();
            }while(num<0);//es la condición que hará que siga pidiendome introducir números, si no se cumple ya no entraremos más en el bucle
        
            double result=factorial(num);
            
            System.out.println("El factorial del número introducido es: "+ result);
        
                 
    }
    static double factorial (int n){
            int i; 
            double fact=1;//tiene que empezar en 1
            for(i=n;i>1;i--){
                fact=fact*n;
                n=n-1;//num tiene que decrecer para que no se multiplique siempre lo mismo
            }
            return fact;// hay que devolver el factorial
    
    }
}
