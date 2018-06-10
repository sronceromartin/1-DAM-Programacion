/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Diseña un algoritmo que muestre los números comprendidos entre dos números
introducidos desde el teclado en orden ascendente
 */
package repetitivas;
 import java.util.Scanner;

public class Ejercicio3Repetitivas {

    public static void main(String[] args) {
        
        
        Scanner lector= new Scanner(System.in);
        int a;
        System.out.print(" Introduce un número: ");
        a=lector.nextInt();
        int b;
        System.out.print(" Introduce otro número: ");
        b=lector.nextInt();
        int max;
        int min;
        int cont;
        if(a>b){
            
                max=a;
                min=b;
                      
        }else{
            
            max=b;
            min=a;
        }
        cont=min;//tengo que igualar el contador al numero minimo
        while(cont<=max){//no puede sobrepasar al valor máximo
        
            System.out.println(cont+ " ");
            cont++;
        }
        
        
        
    }
}
