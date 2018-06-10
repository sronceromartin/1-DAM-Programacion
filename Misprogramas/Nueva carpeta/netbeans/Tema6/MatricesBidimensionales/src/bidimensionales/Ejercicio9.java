/*
Inventarios para una red de almacenes. Tenemos un inventario de M piezas distribuidas por N almacenes, expresado mediante una matriz de M x N, 
y un vector de costes de M elementos con los precios de las piezas. Diseñar un programa que halle: 
a. El valor total general
b. El valor total de una pieza en todos los almacenes
c. Valor total de todas las piezas por almacén
d. Valor de cada pieza por almacén. 
Por ejemplo: para M=3 y N=2 la tabla inicial es: 
 */
package bidimensionales;

/**
 *
 * @author Siby
 */
public class Ejercicio9 {
    
    public static void verMatriz(int matriz[][],double v[]){
        int f,c,i;
        System.out.print("Matriz:"+ "");
        for(f=0;f<matriz.length;f++){
            for(c=0;c<matriz[0].length;c++){
                System.out.print("\t"+matriz[f][c]);
            }
            System.out.println(" ");
        }
        System.out.print("Vector:"+ "");
        for(i=0;i<v.length;i++){
            System.out.print("\t"+ v[i]);
        }
    
    }
    //Apartado a
    public static void valorTotal(int m[][],double t[]){
        int f,c;
        double acumulado=0;
        for(f=0;f<m.length;f++){
            for(c=0;c<m[0].length;c++){//se recorre la matriz a la vez que el vector , pq si recorremos el vector por separado se calculan todos por todos y no es lo que queremos
                double p=m[f][c]*t[c];
                acumulado=acumulado+p;    
            }
            
        }
        System.out.println("Valor total: "+acumulado);
    }
    //Apartado b
     public static void valortotalP(int m[][],double t[]){
         int f,c;
         double total=0;
        double suma=0;
        for(c=0;c<m[0].length;c++){
            suma=0;
            for(f=0;f<m.length;f++){
                total=m[f][c]*t[c];
                suma=suma+total;
                System.out.println("Valor total de una pieza: "+ suma); 
            }
         
        }
         
     }
    //Apartado c
    public static void valortotalPA(int m[][],double t[]){
        int f,c;
        double total=0;
        double suma=0;
        for(f=0;f<m.length;f++){
            suma=0;
            for(c=0;c<m[0].length;c++){
               total=m[f][c]*t[c];
               suma=suma+total;
               
            }
            System.out.println("Valor total de una pieza por almacen: "+suma);
        }
       
    }
    //Apartado d
    public static void valorPieza(int m[][],double t[]){
        int f,c;
        double total=0;
        double suma=0;
        for(f=0;f<m.length;f++){
            for(c=0;c<m[0].length;c++){
                total=m[f][c]*t[c];
                System.out.println("Valor: "+ total);
            }
        }
        
    }
    public static void main(String[] args) {
        int inventario[][]={{31, 42, 64},{50, 101, 194}};
        double costes[]={19.61, 23, 86.04 };
        verMatriz(inventario,costes);
        System.out.println("");
        valorTotal(inventario,costes);
        valortotalP(inventario,costes);
        valortotalPA(inventario,costes);
        valorPieza(inventario,costes);
       
    }    
}
