/*
Diseña un algoritmo que calcule y muestre el factorial de un número entero positivo dado por teclado
 */
package para;

import java.util.Scanner;
public class Ejercicio3ForFactorial {
    
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        int num,i;
        int result=1;
        
        System.out.println("Introduce un número: ");
        num=lector.nextInt();
        
        for(i=num;i>1;i--){
            
            
            result=result*num;// me calcula el producto del factorial
            
           
        
            
        }
        System.out.println("El  factorial de : " + num + "será: "+ result);// me imprime el número factorial y el resultado del producto
    }
}
