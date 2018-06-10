/*
Diseña un algoritmo que calcule y muestre el factorial de un número entero positivo
dado por teclado 
 */
package repetitivas;

import java.util.Scanner;
public class Ejercicio6Repetitivas {
    
    public static void main(String[] args) {
        
        Scanner lector= new Scanner(System.in);
        int num;
        System.out.println("Introduce un número: ");
        num=lector.nextInt();
        int num2 = num;//lo que hace la variable es guardar el número antes de que se modifique
        int contador=1;//ponemos el contador a 1 para que cuando se multiplique por el numero introducido de bien
        
     
        while(num>1){
            
            contador=contador*num;
            
            num=num-1;//lo pongo para que me decrezca num y continue en el bucle        
        }
        System.out.println("El factorial de " + num2 + " es: "+ contador );








//    5! = 5 * 4 * 3 * 2 * 1
//    2!=2*1
//    1616!=1616*1615
    
    
    }
}
