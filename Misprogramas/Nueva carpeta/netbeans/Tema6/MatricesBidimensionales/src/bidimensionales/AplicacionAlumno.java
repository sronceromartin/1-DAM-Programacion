/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidimensionales;

/**
 *
 * @author ASIR 7L
 */
import java.util.Scanner;
public class AplicacionAlumno {
    public static void main(String[] args) {
        double[] notas=new double[3];
        Alumno[] al=new Alumno[3];
        String nom,ape1,ape2;
        Scanner tec=new Scanner(System.in);
        int numPer=0;
        int f;
        for(f=0;f<al.length;f++){
             System.out.println("Introduce el número personal: ");
             numPer=tec.nextInt();
             tec.nextLine();
             System.out.println("Apellido1: ");
             ape1=tec.nextLine();
             System.out.println("Apellido2: ");
             ape2=tec.nextLine();
             System.out.println("Nombre: ");
             nom=tec.nextLine();
             for(int j=0;j<notas.length;j++){
               System.out.println("Introduce una nota: ");
               notas[j]=tec.nextDouble();  
             }
             al[f]=new Alumno(numPer,ape1,ape2,nom,notas);
            
        }
        for(f=0;f<al.length;f++){    
            System.out.println(al[f].toString()); 
        }    
           
    }
}
