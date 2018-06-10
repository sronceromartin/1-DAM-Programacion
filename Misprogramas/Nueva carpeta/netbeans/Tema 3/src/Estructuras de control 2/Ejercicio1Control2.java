/*
Programa que muestre el siguiente menu
1.-Opción 1
2.-Opción 2
3.- Opción 3
4.- Finalizar
El programa mostrará la opción seleccionada (utilizar un switch) y esperará a que se pulse una
tecla para continuar.
Cuando se pulse la tecla volverá a mostrar el menú.
El programa finalizará cuando se seleccione la opción 4
 */
package control;

import java.util.Scanner;
public class Ejercicio1Control2 {
    
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        int opcion;
        System.out.println(" Introduce una opción: ");
        opcion=lector.nextInt();
        
        
        
        switch (opcion){      
        
            case 1:
                
                System.out.println("Has elegido la opción 1");
                break;
        
            case 2:
                
                System.out.println("Has elegido la opción 2");
                break;
                
            case 3:
                
                System.out.println("Has elegido la opción 3");
                break;
                
                
            case 4:
                
                defaul:
                
                    System.out.println("Se acaba el programa");
        }
    }
}
