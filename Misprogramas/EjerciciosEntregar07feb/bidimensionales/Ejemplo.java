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
public class Ejemplo {
    public static double[][] creaMatriz(double matriz[][]){
        int f,c;
        for(f=0;f<matriz.length;f++){
            for(c=0;c<matriz[0].length;c++){
                matriz[f][c]=(int)(Math.random()*10);
            }
        }
        return matriz;
    
    }
    public static void verMatriz(double matriz[][]){
        int f,c;
        for(f=0;f<matriz.length;f++){
            for(c=0;c<matriz[0].length;c++){
                System.out.print("\t"+matriz[f][c]);
            }
            System.out.println("");
        } 
       
    }
    public static void mediaAlumno(double matriz[][]){
       int f,c;
       double acumulador=0;
       boolean parar=false; //por defecto sigo
        
        for(f=0;f<matriz.length;f++){
            System.out.println("\t Alumno"+ f);
            for(c=0;c<matriz[0].length;c++){ 
                if(parar==false && matriz[f][c]>=5){
                   acumulador=acumulador+matriz[f][c];//para que me calcule la media de cada alumno 
                }else{
                    parar=true;
                    acumulador=0;
                }
            }
            System.out.println("Media: "+ acumulador);
        }
        
    }
    public static void notaMaxModulo(double m[][]){
        int f,c;
        double media=0;
        for(c=0;c<m[0].length;c++){
            System.out.println("Modulo "+ c);
            for(f=0;f<m.length;f++){
                media=m[f][c]/m.length;
            }
          System.out.println("Media por módulo: "+ media);  
        }
        
    }
    public static void main(String[] args) {
        double notas[][]=new double [5][3];
        creaMatriz(notas);
        verMatriz(notas);
        mediaAlumno(notas);
        notaMaxModulo(notas);
    }
}
