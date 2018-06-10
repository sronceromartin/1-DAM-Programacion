
package expresiones;

/**
 *
 * @author Siby
 */
import java.util.Scanner;
public class Ejercicio1_2 {
 
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        String nombre;
        System.out.print("Introduce tu nombre: ");
        nombre=lector.nextLine();
        String apell1;
        System.out.print("Introduce tu 1º apellido: ");
        apell1=lector.nextLine();
        String apell2;
        System.out.print("Introduce el 2º apellido: ");
        apell2=lector.nextLine();
        String fecha;
        System.out.print("Introduce tu fecha de nacimiento: ");
        fecha=lector.nextLine();
        System.out.print(nombre + " " + apell1 + " " + apell2 + " " + fecha);
       
    }
    
}
