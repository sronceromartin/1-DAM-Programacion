/*
Introduce  una  matriz de 7 x 5  y visualízala. A continuación:
• Crea una nueva matriz de 7 x 7 en donde las cinco primeras columnas sean las de la matriz origen
• Guarda en la columna sexta la suma de las cinco anteriores 
• Guarda en la columna séptima la media de las cinco primeras
 */
package bidimensionales;

/**
 *
 * @author Siby
 */
public class Ejercicio3 {
    
    public static int [][] crearMatriz(int matriz[][]){
    
        int f,c;
        for(f=0;f<matriz.length;f++){
            for(c=0;c<matriz[f].length;c++){
              matriz[f][c]=(int)(Math.random()*10);  
            }
        }
        return matriz;
    }
    public static void visualizaMatriz(int matriz[][]){
        
        int f,c;
        for(f=0;f<matriz.length;f++){
            for(c=0;c<matriz[f].length;c++){
                System.out.print("\t"+matriz[f][c]);
            }
            System.out.println("");
        }    
    }
    
   public static void obtenerColumna(int matriz[][]){
        int c,f;
        int suma=0;
        int media=0;
        for(f=0;f<matriz.length;f++){
            for(c=0;c<matriz.length;c++){
                suma=suma+matriz[f][c];
                media=suma/5;
                if(c==5){//para la columna 6 que está en la posición 5
                    matriz[f][c]=suma;
                }else if(c==6){
                    matriz[f][c]=media;
                
                }
                
            }
            suma=0;//debemos resetear la suma para que al cambiar de columna no se acumule a la siguiente
            media=0;
        }
    }
    public static void obtenerNuevaMatriz(int n[][],int m[][]){
        int c,f;
        for(f=0;f<m.length;f++){
            for(c=0;c<m[f].length;c++){
                n[f][c]=m[f][c];
                
            }
        }
    
    
    }
    
    public static void main(String[] args) {
        int m[][]=new int [7][5];
        crearMatriz(m);
        visualizaMatriz(m);
        int n[][]=new int [7][7];
        obtenerNuevaMatriz(n,m);
        obtenerColumna(n);
        visualizaMatriz(n);
                
    }
}
