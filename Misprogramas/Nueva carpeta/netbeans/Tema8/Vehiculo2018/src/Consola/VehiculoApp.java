/*
 b) Cree 2 camiones y 2 coches y los añada al array.
c) Suponiendo que no se sabe en qué celdas los coches y en cuáles los 
camiones:
• Ponga un remolque de 5000 Kg a los camiones del array.
• Acelere todos los vehículos.
• Escriba por pantalla la información de todos los vehículos. 
 */

package Consola;
import Modelo.*;
import Controlador.GestionVehiculos;
import java.util.Scanner;
import java.util.InputMismatchException;
/* * VehiculoApp.java  * Creado el  13-mar-2018, 21:24:14  
 * @autor Vicente Martínez Juan * Contacta conmigo en torrent636588336@gmail.com*/

public class VehiculoApp {
    static Scanner tec = new Scanner(System.in);
    
public static void main(String[] args) {
        int op;
        String opciones = "1.Insertar Camion"
                + "\n2.Insertar Coche"
                + "\n3.Remolque 5000kg"
                + "\n4. Acelerar"
                + "\n5. Listar"
                + "\n6. Salir";
        do {
            op = menu(opciones);
            switch (op) {
                case 1:
                    GestionVehiculos.insertar(crearCamion());
                    break;
                case 2:
                    GestionVehiculos.insertar(crearCoche());
                    break;
                case 3: //Ponga un remolque de 5000 Kg a los camiones del array
                    GestionVehiculos.meterRemolque();
                    
                    break;
                case 4: //Acelere todos los vehículos.
                    GestionVehiculos.acelerarV(acelerarVehiculos());
                    break;
                case 5: //escriba por pantalla la información de todos los vehículos.
                    System.out.println(GestionVehiculos.listar());
                    break;
                case 6:
                    System.out.println("Fin");
            }
        } while (op != 6);
    }

    private static int menu(String opciones) {
       
        int op=0;
        do {
            System.out.println(opciones);
            try{
                op = tec.nextInt();
            }catch(InputMismatchException e){ //lanzado por Scanner, indica que el valor devuelto no coincide con el patron esperado
                System.out.println("El valor devuelto no se corresponde con un entero");
                tec.nextLine();
            }
        } while (op < 1 || op > 6);
        return op;
    }
    private static Camion crearCamion() {       
        String matricula;
        tec.nextLine();//recogemos el intro del buffer

        System.out.print("Matricula: ");
        matricula = tec.nextLine();

            return new Camion(matricula);
    }  
    private static Coche crearCoche() {       
        String matricula; 
        int nPuertas;        
        tec.nextLine();//recogemos el intro del buffer

        System.out.print("Matricula: ");
        matricula = tec.nextLine();
        System.out.print("Número de Puertas: ");
        nPuertas = tec.nextInt();
        return new Coche(nPuertas,matricula);
    }
    private static float acelerarVehiculos(){
        float a;
        System.out.println("En cuantos km desea acelerar todos los vehiculos");
        a=tec.nextFloat();
        return a;
    }
}
