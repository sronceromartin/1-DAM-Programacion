
package expresiones;

import java.util.Scanner;
public class Ejercicio5_2 {
    
    public static void main(String[]args){
    
    Scanner lector=new Scanner(System.in);
    int base;
    System.out.print("Introduce un valor para la base: ");
    base=lector.nextInt();
    
    lector.nextLine();
    int altura;
    System.out.print("Introduce un valor para la altura: ");
    altura=lector.nextInt();
    
    int area;
    
    System.out.print("area = " + base * altura );
    System.out.print(" Perimetro = " +  (2*base + 2*altura) );
    
    }  
    
}
