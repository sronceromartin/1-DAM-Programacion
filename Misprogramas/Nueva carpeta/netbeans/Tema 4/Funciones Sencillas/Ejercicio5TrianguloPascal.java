/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionesSencillas;

import java.util.Scanner;
public class Ejercicio5TrianguloPascal {
    public static void main(String[] args) {
        int fila,columna;
        Scanner lector=new Scanner(System.in);
        int num;
        System.out.println("Introduce un número: ");
        num=lector.nextInt();
        System.out.println(combinatorio(1,0));//para que me calcule el combinatorio de estos números
        for(fila=1;fila<num;fila++){//fila, ponemos menor que num pq la primera final la imprimimos con el combinatorio
            for(columna=0;columna<=fila;columna++){//columna
                System.out.print(combinatorio(fila,columna));//tiene que ser print para que salga en filas
                
            }
            System.out.println(" ");//para que haya un salto de linea
        }
        
    }
    
    static int combinatorio(int m,int n){
        
                
            if(m<n){
            
                return 0;
            }else{
        
                return (factorial(m)/(factorial(n)*factorial(m-n)));//me tiene que devolver el resultado de la operación para obtener el combinatorio
            }
        }
        static int factorial (int n){
            int i; 
            int fact=1;//tiene que empezar en 1
            for(i=n;i>1;i--){
                fact=fact*n;
                n=n-1;//num tiene que decrecer para que no se multiplique siempre lo mismo
            }
            return fact;// hay que devolver el factorial
        }
    
    
}
