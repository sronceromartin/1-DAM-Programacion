/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidimensionales;

/**
 *
 * @author Siby
 */
import java.util.Arrays;
import java.util.Scanner;
public class AlumnoAppp {
    public static void main(String[] args) {
        double[] notas=new double[3];
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
            for(j=0;j<notas.length;j++){//para pedir la nota 3 veces
                System.out.println("Introduce una nota: ");
                notas[j]=tec.nextDouble();
                
            }
            al[i]=new Alumno(numeroPersona,ape1,ape2,nom,notas);
            al[i].obtenerNotaMediaFinal( );
            System.out.println("Alumnos: "+ Arrays.toString(al));
            System.out.println("Notas: "+ Arrays.toString(notas));
        }
        
       
        
    }
}
