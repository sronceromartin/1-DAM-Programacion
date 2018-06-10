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
public class Alumno {


    int numeroPersonal;
    String apellido1, apellido2, nombre;
    double[ ] notasFinales;
    public Alumno(int numPer, String ap1, String ap2, String nom, double[ ] notasF) {
        this.numeroPersonal=numPer;
        this.apellido1=ap1;
        this.apellido2=ap2;
        this.nombre=nom;
        notasFinales=notasF.clone();
    }

    @Override
    public String toString( ) {
    String resul;
    resul = "NP: " + numeroPersonal + "\n" +" Nombre; " +
    nombre +" Apellido1: " + apellido1 +
    " Apellido2: " + apellido2 + "\n" +" Nota Media Final: " +
    obtenerNotaMediaFinal() + "\n";
    return resul;
    }
    public double obtenerNotaMediaFinal( ) {
        double acumulador=0;
        double media=0;
        int f;
        for(f=0;f<notasFinales.length;f++){
            acumulador=acumulador+notasFinales[f];
        }
        media=acumulador/notasFinales.length;
        return media;

    }
    public void notaFinal(double n[][], int i){
        int f,c;
        double acumulador=0;
        double media=0;
        for(c=0;c<n[0].length;c++){
            for(f=0;f<n.length;f++){
                if(f==0){
                    acumulador=acumulador+n[f][c]*0.60;
                }else if(f==1){
                    acumulador=acumulador+n[f][c]*0.40;
                }
                media=acumulador/n.length;
            }
        }
        System.out.println("Media: "+ media);
    }


    //• Pide los datos de cada alumno(nombre, apellido y notas) y rellena el array Alumno
    //• Muestra los datos de todos los alumnos
    //• Muestra la nota media total
}
