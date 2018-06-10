
package consola;

import Controlador.GestionMultimedia;
import static Controlador.GestionMultimedia.duracionTotal;
import Modelo.Disco;
import Modelo.Formato;
import Modelo.Genero;
import Modelo.Pelicula;
import java.util.Scanner;
import java.util.Arrays;

/**
 * @author Pilar Melio
 * @version 1.0
 * @date 08-mar-2018
 */
public class AplicacionMultimedia {
 static Scanner tec = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        String opciones = "---------------------------------\n1.Insertar Película\n2.Insertar Disco\n3.Listar\n4.Duración Total\n5.¿Cuántos discos hay de rock?\n6.¿Peliculas sin actrices?\n7.Salir\n---------------------------------\n";
        do {
            op = menu(opciones);
            switch (op) {
                case 1:
                    GestionMultimedia.insertarP(crearPelicula());
                    System.out.println("Se ha creado la película ");
                    break;
                case 2:
                    GestionMultimedia.insertar(crearDisco());
                    System.out.println("Se ha creado el disco ");
                    break;
                case 3:
                    System.out.println(GestionMultimedia.listar());
                    System.out.println("Se ha listado ");
                    break;
                case 4:   
                    System.out.println("Duración total: " );
                    duracionTotal();
                    break;
                case 5:
                    System.out.println("Cantidad de discos de rock: ");
                    GeneroRock();
                    break;
                case 6:
                    System.out.println("Películas sin actrices: ");
                    sinActriz();
                    break;
                case 7:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Opción incorrecta ");
                    
            }
        } while (op != 7);
    }

    private static int menu(String opciones) {
       
        int op;
        //do {
            System.out.println(opciones);
            op = tec.nextInt();
        //} while (op < 1 || op > 7);
        
        return op;
    }

    private static Pelicula crearPelicula() {
       
        String tit, autor, actriz, actor;
        float duracion;
        tec.nextLine();
        System.out.println("DATOS PELÍCULA");
        System.out.println("Título:");
        tit = tec.nextLine();
        System.out.println("Director:");
        autor = tec.nextLine();
        System.out.println("Actriz:");
        actriz = tec.nextLine();
        System.out.println("Actor:");
        actor = tec.nextLine();
        System.out.println("Duración:");
        duracion = Float.parseFloat(tec.nextLine());
        try {
            return new Pelicula(tit, autor, Formato.formato.MPG, duracion,actor, actriz);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    private static Disco crearDisco() {
    
        String tit, autor, genero;
        Disco d = null;
        float duracion;
        tec.nextLine();
        System.out.println("DATOS DISCO");
        System.out.println("Título:");
        tit = tec.nextLine();
        System.out.println("Autor:");
        autor = tec.nextLine();
        System.out.println("Genero:");
        genero = tec.nextLine();
        System.out.println("Duración:");
        duracion = Float.parseFloat(tec.nextLine());
        if (Genero.estaEn(genero)) {
            try {
                return new Disco( tit, autor, Formato.formato.DVD, duracion,genero);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return null;
            }

        }
        return d;
    }

    private static void GeneroRock() {
        GestionMultimedia.GeneroRock();
    }

    private static void sinActriz() {
        GestionMultimedia.sinActriz();
    }
    
   
        
    
    
}
