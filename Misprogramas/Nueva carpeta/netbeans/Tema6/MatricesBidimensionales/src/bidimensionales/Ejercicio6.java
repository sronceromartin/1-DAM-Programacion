/*
Sobre una matriz de 3 filas por 6 columnas con valores introducidos por el usuario, mostrar la matriz con los datos introducidos así como:
a. El menor número de la matriz y su posición
b. El mayor número de la matriz y su posición
c. El menor nº de cada fila y su posición
d. El menor nº de cada columna y su posición
e. La media de todos los números
f. La suma de todos ellos
 */
package bidimensionales;

/**
 *
 * @author ASIR 7L
 */
public class Ejercicio6 {
    
    public static int [][] creaMatriz(int matriz[][]){
        int f,c;
        for(f=0;f<matriz.length;f++){
            for(c=0;c<matriz[0].length;c++){//como no es una matriz cuadrada ponemos la posicion 0
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
    public static void numeroMenor(int matriz[][]){
        int f,c;
        int menor=matriz[0][0];
        int posicionf=0;
        int posicionC=0;
        for(f=0;f<matriz.length;f++){
            for(c=0;c<matriz[0].length;c++){
                if(matriz[f][c]<menor){
                    menor=matriz[f][c];
                    posicionf=f;
                    posicionC=c;
                }
            }
        }
        System.out.println("Menor: "+ menor+ "PosicionF: "+ posicionf + "PosicionC: "+ posicionC);
    
    }
    public static void menorNumerodelaFila(int matriz[][]){
        int f,c;
        int menor=matriz[0][0];
        int posicionf=0;
        int posicionC=0;
        for(f=0;f<matriz.length;f++){
            menor=matriz[f][0];//esto lo hago para que no se vaya acumulando el menor de cada fila pq a veces da errores  y en lugar de imprimirme el menor de cada fila me imprime el de la anterior
            for(c=0;c<matriz[0].length;c++){
                if(matriz[f][c]<=menor){
                    menor=matriz[f][c];
                    posicionf=f;
                    posicionC=c;
                    
                    
                }
               
            }
            System.out.println("Menor de la fila: "+ menor + "PosicionF: "+ posicionf + "PosicionC: "+ posicionC); 
            
        }
    }
    public static void menorNumerodelaColumna(int matriz[][]){
        int f,c;
        int menor=matriz[0][0];
        int posicionf=0;
        int posicionC=0;
        for(c=0;c<matriz[0].length;c++){//cambiamos primero las columnas y luego las filas
            menor=matriz[0][c];
            for(f=0;f<matriz.length;f++){
                if(matriz[f][c]<=menor){
                    menor=matriz[f][c];
                    posicionf=f;
                    posicionC=c;
                }
            }
         System.out.println("Menor de la columna: "+ menor + "PosicionF: "+ posicionf + "PosicionC: "+ posicionC);   
        }
    
    
    }
    public static void numeroMayor(int matriz[][]){
        int f,c;
        int mayor=matriz[0][0];
        int posicionF=0;
        int posicionC=0;
        for(f=0;f<matriz.length;f++){
            for(c=0;c<matriz[0].length;c++){
                if(matriz[f][c]>mayor){
                    mayor=matriz[f][c];
                    posicionF=f;
                    posicionC=c;
                }
            }
        }
        System.out.println("Mayor: "+ mayor + "PosicionF: "+ posicionF + "PosicionC: "+ posicionC);
    
    }
    
    public static void media(int matriz[][]){
       int f,c;
       int suma=0;
       int media=0;
       for(f=0;f<matriz.length;f++){
           for(c=0;c<matriz[0].length;c++){
               suma=suma+matriz[f][c];
               media=suma/18;
           }
       
       }
        System.out.println("Suma: "+ suma);
        System.out.println("Media: "+ media);
    
    }
    public static void main(String[] args) {
        int m[][]=new int[3][6];
        creaMatriz(m);
        visualizaMatriz(m);
        numeroMenor(m);
        numeroMayor(m);
        menorNumerodelaFila(m);
        menorNumerodelaColumna(m);
        media(m);
    }
  
}
