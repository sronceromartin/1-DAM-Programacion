/*
  Diseñar un programa que decida si una matriz de dimensión 4 x 4 de números enteros es simétrica.
Al doblarla por la diagonal izquierda coinciden los valores. 
 */
package bidimensionales;

import java.util.Arrays;

/**
 *
 * @author Siby
 */
public class Ejercicio7 {
    public static int[][] transponer(int matriz[][]){
        int f,c;
        int nuevaMatriz[][]=new int[matriz[0].length][matriz.length];
        for(f=0;f<matriz.length;f++){
            for(c=0;c<matriz[f].length;c++){
               nuevaMatriz[c][f]=matriz[f][c]; 
            }
        }
        return nuevaMatriz;
    }
    public static boolean sonIguales(int m1[][],int m2[][]){
        int f,c;
        for(f=0;f<m1.length;f++){
            for(c=0;c<m1[f].length;c++){
                if(m1[f][c]!=m2[f][c]){//si encuentra alguno que no es igual que la otra me devuelve false,pq si lo hacemos al revés me da error
                    return false;
                }
            }
        }
        return true;//supongo que es simétrica
    }
    
    public static void main(String[] args) {
        int a[][]={{1,2,3,9},{2,3,4,1},{3,4,1,2},{4,1,2,3}};
        //int b[][]={{1,2,3,4},{2,3,4,1},{3,4,1,2},{4,1,2,3}};
        int b[][]=transponer(a);
        sonIguales(a,b);
        if(sonIguales(a,b)){
            System.out.println("La matriz es simétrica");
        }else{
            System.out.println("No es simétrica");
        }   
            
   }
}
