/*
Diseñar un programa que muestre la suma de dos matrices bidimensionales de 5 filas x 4 columnas, 
rellenadas con valores dados por el usuario. (La matriz resultante contiene la suma de los elementos respectivos)
 */
package bidimensionales;

/**
 *
 * @author ASIR 7L
 */
public class Ejercicio5 {
    
    public static int[][] creaMatriz(int matriz[][]){
        int f,c;
        for(f=0;f<matriz.length;f++){
            for(c=0;c<matriz[0].length;c++){
                matriz[f][c]=(int)(Math.random()*10);
            }
        }
        return matriz;
    
    }
    public static void visualizaMatriz(int matriz[][]){
        int f,c;
        for(f=0;f<matriz.length;f++){
            for(c=0;c<matriz[f].length;c++){
                System.out.print("\t"+ matriz[f][c]);
            }
            System.out.println(" ");
        }
    
    }
    public static int[][] sumaMatrices(int matriz1[][], int matriz2[][]){
        int f,c;
        int matriz3[][]=new int [5][4];
        for(f=0;f<matriz1.length;f++){
            for(c=0;c<matriz1[0].length;c++){
                matriz3[f][c]=matriz1[f][c]+matriz2[f][c];
            }
        }    
        return matriz3;
    }
    public static void main(String[] args) {
        
        int m1[][]=new int [5][4];
        System.out.println("Matriz 1: ");
        creaMatriz(m1);
        visualizaMatriz(m1);
        int m2[][]=new int [5][4];
        System.out.println("Matriz 2: ");
        creaMatriz(m2);
        visualizaMatriz(m2);
        int matriz3[][]=new int[5][4];
        matriz3=sumaMatrices(m1,m2);
        System.out.println("Matriz 3: ");
        visualizaMatriz(matriz3);
        
    }
}
