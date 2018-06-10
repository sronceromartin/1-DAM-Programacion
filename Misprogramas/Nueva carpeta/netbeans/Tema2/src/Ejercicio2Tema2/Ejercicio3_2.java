
package expresiones;

/**
 *
 * @author Siby
 */
import java.util.Scanner;
public class Ejercicio3_2 {
    
    public static void main(String[] args) {
        
    
    Scanner lector=new Scanner(System.in);
    float precio;
    System.out.print("Introduce el precio del artículo: ");
    precio=lector.nextFloat();
    lector.nextLine();
    float descuento;
    System.out.print("Introduce el valor del descuento: ");
    descuento=lector.nextFloat();    
    double precioF= precio-(precio*descuento/100);
    System.out.print("El precio final será : "+ precioF);
    }
    
    
}
