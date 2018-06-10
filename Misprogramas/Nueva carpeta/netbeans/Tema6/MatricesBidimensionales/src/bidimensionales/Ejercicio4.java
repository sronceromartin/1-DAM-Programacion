/*
Hacer un programa que defina una matriz de 5 x 5, 
que inicialice mediante bucles las diagonales a 1, y el resto de celdas a 0. 0 
 */
package bidimensionales;

/**
 *
 * @author Siby
 */
public class Ejercicio4 {
    
    
    public static int [][] crearyVisualizarMatriz(int matriz[][]){
        int f,c;
        for(f=0;f<matriz.length;f++){
            for(c=0;c<matriz[f].length;c++){
                if(f==c){
                    System.out.print("\t 1"); 
                }else if(c==matriz.length-f-1){
                    System.out.print("\t 1");
                }else{
                    System.out.print("\t 0");
                }
            }
            System.out.println(" ");
        }      
        return matriz;        
    }
         
    
    public static void main(String[] args) {
        int m[][]=new int[5][5];
        crearyVisualizarMatriz(m);
        
        
    }
}
