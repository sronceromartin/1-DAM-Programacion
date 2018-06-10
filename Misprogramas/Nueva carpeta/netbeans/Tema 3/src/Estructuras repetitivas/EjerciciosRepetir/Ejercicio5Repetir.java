/*
Escribir un algoritmo que escribe la suma de una secuencia de números enteros
leídos del teclado finalizando la entrada de datos al evaluar la respuesta dada a un
mensaje que diga “continuar S/N”, mostrado después de realizar las operaciones
del bucle
 */
package repetitivas;
import java.util.Scanner;
public class Ejercicio5Repetir {
    public static void main(String[] args) {
        int suma=0;
        char opc='S';
        do{
            Scanner lector=new Scanner(System.in);
            int num;
            System.out.println("Introduce un número: ");
            num=lector.nextInt();
            suma=suma+num;
            System.out.println("Deseas continuar S/N: ");
            opc=lector.next().charAt(0);//lo utilizo para que me lea el char
           
        }while(opc=='S');
             System.out.println("El resultado de la suma es: "+ suma);
             
    }
}
