
package expresiones;

/**
 *
 * @author Siby
 */
import java.util.Scanner;
public class Ejercicio2_2 {
    
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        float parcial1;
        System.out.print("Escribe la nota del 1º parcial: ");
        parcial1=lector.nextFloat();
        lector.nextLine();
        float parcial2;
        System.out.print("Escribe la nota del 1º parcial: ");
        parcial2=lector.nextFloat();
        float notafinal= (parcial1+parcial2)/2;

        System.out.print("La nota final será : " + notafinal);// el resultado es 7.35
    }
    
}
