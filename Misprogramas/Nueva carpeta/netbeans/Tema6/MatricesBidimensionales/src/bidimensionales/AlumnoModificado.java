/*
Modifica el ejercicio anterior para que al consturctor de la clase alumno no
se le pase un vector de 3 doubles (las 3 notas de las 3 asignaturas), si no
una matriz como la siguiente con las notas de las 3 asignaturas en 2
evaluaciones
 */
package bidimensionales;

/**
 *
 * @author Siby
 */
import java.util.Scanner;
public class AlumnoModificado {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        double notas[][]=new double [2][3];
        int f,c;
        for(f=0;f<notas.length;f++){
            System.out.print("Evaluación " + (f+1));
            System.out.println("");
            for(c=0;c<notas[f].length;c++){
                System.out.println("Asig  "+ c);
                System.out.println("");
                System.out.println("Introduce las notas: ");
                notas[f][c]=lector.nextDouble();
                
            }
        }
        for(f=0;f<notas.length;f++){
            System.out.print("Evaluación " + (f+1));
            for(c=0;c<notas[0].length;c++){
                System.out.print("Asig  "+ c);
                System.out.print("\t"+ notas[f][c]); 
            }
            System.out.println("");
        }
        Alumno[] al=new Alumno[3];
        String nom,ape1,ape2;
        int numeroPersona=0;
        Scanner tec=new Scanner(System.in);
        int i,j;
        for(i=0;i<al.length;i++){
            System.out.println("Número personal: ");
            numeroPersona=tec.nextInt();
            tec.nextLine();
            System.out.println("Apellido 1: ");
            ape1=tec.nextLine();
            System.out.println("Apellido 2: ");
            ape2=tec.nextLine();
            System.out.println("Nombre: ");
            nom=tec.nextLine();
        }    
    }    
}
