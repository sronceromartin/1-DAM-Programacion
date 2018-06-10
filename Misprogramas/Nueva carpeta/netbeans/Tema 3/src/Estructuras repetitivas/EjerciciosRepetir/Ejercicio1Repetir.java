/*
Diseñar un algoritmo que verifique que la entrada de un dato es correcta. Un dato
es correcto si está entre 1 y 5 (ambos inclusive).
 */
package repetitivas;

/**
 *
 * @author DAM 6J
 */
import java.util.Scanner;
public class Ejercicio1Repetir {
    
    public static void main(String[] args) {
        
        int num;
        
        do{
        
            Scanner lector=new Scanner(System.in);
            System.out.println("Introduce un número: ");
            num=lector.nextInt();
            
        
        
        }while(num>=1 && num<=5);
        
                System.out.println("El número introducido es incorrecto");
    }
}
