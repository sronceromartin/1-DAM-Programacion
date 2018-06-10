/*
• Escribir un algoritmo que lea un número y escriba todos los números comprendidos entre dicho número y la unidad en orden decreciente. (utilizando el bucle repetir-hasta) 
 */
package repetitivas;
import java.util.Scanner;

public class Ejercicio2Repetir {

    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        int num;
        System.out.println("Introduce un número: ");
        num=lector.nextInt();
        int contador=0;
        int max=0;
        int min=0;
        
        
        do{
            num=num-1;
            
            System.out.println(num);
            
             
        
        }while(num>1);// si ponemos que sea igual a uno, entrará en el bucle cuando num=1 y me imprimirá el 0
            
            
    }
}
