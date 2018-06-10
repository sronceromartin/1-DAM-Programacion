/*
Hacer un programa que defina una matriz llamada TB de 10 x 10,
inicialice mediante un bucle las filas pares a 1 y las impares a 0 
y muestre el contenido de la matriz. 
 */
package bidimensionales;

/**
 *
 * @author Siby
 */
public class Ejercicio2 {
    public static int[][] creaMatriz(int matriz[][]){
    int f, c;
        for(f=0;f<matriz.length;f++){
            for(c=0;c<matriz[f].length;c++){
                if(f%2==0){// como f es el indice la primera fila es 0 y es impar
                    matriz[f][c]=0;
                }else{
                    matriz[f][c]=1;
                }
            }
        } 
        return matriz;
    }
    
    public static void visualizaMatriz(int matriz[][]){
      int f, c;
      for(f=0;f<matriz.length;f++){
          for(c=0;c<matriz[f].length;c++){
            System.out.print( matriz[f][c]);
          }
          System.out.println(" ");
      }
    }
    public static void main(String[] args) {
        int TB[][]=new int[10][10];
        creaMatriz(TB);
        visualizaMatriz(TB);
        
    }
}
