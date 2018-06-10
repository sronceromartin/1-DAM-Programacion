/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidimensionales;

/**
Introduce una matriz de 5 filas y 7 columnas y a continuación visualiza:
• Toda la matriz (Crea un método que visualice la matriz ya que lo
gastarás más veces)
• La fila cinco completa
• el elemento de la cuarta fila tercera columna y el elemento de la quinta
fila tercera columna. Intercambiarlos el contenido de estos dos
elementos y visualiza la matriz de nuevo
• La primera columna y la cuarta. Intercambiar el contenido de estas
columnas y visualiza la matriz de nuevo
 */
public class Ejercicio1 {
    
    public static int[][] creaMatriz(int matriz[][]){
    int f, c;
        for(f=0;f<matriz.length;f++){
            for(c=0;c<matriz[f].length;c++){
                matriz[f][c]=(int)(Math.random()*10);
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
    public static void obtenerFila(int fila,int Mfila[][]){
     
        int c;
          System.out.println("Fila: "+ fila);  
          for(c=0;c<Mfila[fila].length;c++){ 
              System.out.print(Mfila[fila][c]);;
          }
           
    }
  
    public static void reemplazarValor(int Matriz[][],int fi,int ci,int ff,int cf){
        int valorI=Matriz[fi][ci];//valorI es una función auxiliar que me almacena el valor inicial
        Matriz[fi][ci]=Matriz[ff][cf];
        Matriz[ff][cf]=valorI;
        
    
    }
    public static void intercambiarColumnas(int Matriz[][],int ci,int cf){
        int f;
        for(f=0;f<Matriz.length;f++){
            reemplazarValor(Matriz, f, ci, f,cf);
        }
    
    
    
    }
        
    public static void main(String[] args) {
        int matriz[][]=new int[5][7];
        creaMatriz(matriz);
        visualizaMatriz(matriz);
        obtenerFila(4,matriz);
        System.out.println(" ");
        System.out.println("Matriz reemplazada");
        reemplazarValor(matriz,3,2,4,2);
        visualizaMatriz(matriz);
        System.out.println("Reemplazar columnas");
        intercambiarColumnas(matriz, 0,3);
        visualizaMatriz(matriz);
    }
}
