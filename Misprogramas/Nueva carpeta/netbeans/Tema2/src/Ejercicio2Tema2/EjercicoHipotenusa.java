
package expresiones;

/**
 *
 * @author Siby
 */
import java.util.Scanner;
public class EjercicoHipotenusa {
    
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        float angulo;
        System.out.print("Escribe el valor del ángulo: ");
        angulo=lector.nextFloat();
        lector.nextLine();
        double ladoOp;
        System.out.print("Escribe el valor del lado opuesto: ");
        ladoOp=lector.nextFloat();
        double hipotenusa1=ladoOp/Math.sin(Math.toRadians(angulo));
        System.out.println("El valor de la hipotenusa será: " + hipotenusa1);
        double ladoAdy=ladoOp/(Math.sin(Math.toRadians(angulo))/Math.cos(Math.toRadians(angulo)));// podríamos poner Math.tan((Math.toRadians(angulo))
        System.out.println("El valor del lado Adyacente es: "+ + ladoAdy);
        double hipotenusa2=Math.sqrt((Math.pow(ladoAdy,2)+Math.pow(ladoOp,2)));
        System.out.println("El valor de la hipotenusa será: " + hipotenusa2);
    }
    
}
