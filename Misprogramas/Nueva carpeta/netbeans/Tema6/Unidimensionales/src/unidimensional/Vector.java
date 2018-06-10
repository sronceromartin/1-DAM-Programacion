/*
Hacer un programa que: RECORRIDO PARCIAL
a) Cree un array unidimensional de nombre vector de 10 elementos, de
tipo numérico entero.
b) Cargue el array con valores dados por el usuario.
c) Y calcule la suma de los primeros N elementos almacenados en el array
siendo N un número dado por el usuario, en el rango correcto.
d) Muestre el resultado de la suma así como el contenido del array
 */

package unidimensional;

import java.util.Scanner;

public class Vector{
    static Scanner lector=new Scanner(System.in);
    public static void ejercicio1(int n){
        int vector[]=new int[10];
        
        int i,suma=0;
        if(n<=vector.length){
            for(i=0;i<vector.length;i++){
                System.out.println("Introduce un número: ");
                vector[i]=lector.nextInt();
           
            }
            for(i=0;i<vector.length;i++){//para que recorra el array y me sumo los números que hay introducidos
                suma=suma+vector[i];
            }
            
        }else{
                System.out.println("El número introducido es mayor que la longitud del array");
        }    
        System.out.println("La suma de los números introducidos por el usuario es: "+ suma);
       for(i=0;i<vector.length;i++){
           System.out.print(" " +vector[i]);
       
       } 
    
    }
    
    /*Hacer un programa que: SELECCIONAR ELEMENTOS, COPIARLOS EN OTRO
ARRAY
a) Cree un array unidimensional de nombre origen de 12 elementos, de
tipo numérico entero.
b) Rellene el vector con los valores 10,25,26,40,37,45,90,76,78,81,58 y 32
respectivamente.
c) Muestre en pantalla la posición de los elementos pares
d) Mete en un segundo array de nombre destino todos aquellos elementos
que sean pares y mayores de 25
e) y muestre en pantalla el contenido de los dos arrays unidimensionales.
*/
    public static void ejercicio2(){
    
        int origen[]={10,25,26,40,37,45,90,76,78,81,58,32};
        int i;
        int destino[]=new int[11];//le damos el mismo tamaño que el anterior
        for(i=0;i<origen.length;i++){
            if(origen[i]%2==0)//si son pares
                System.out.println("Posición de números pares: "+ i);
                if(origen[i]>25){
                    destino[i]=origen[i];//lo igualamos para que se me pasen los pares y mayores de 25
                }
        }
        for(i=0;i<origen.length;i++){
            System.out.println("Origen:"+ origen[i]);
            System.out.println("Destino:"+ destino[i]);
        
        }
    
    }
    
    public static void main(String[] args) {
        
        /*System.out.println("Número dado por el usuario");//de cuantos números quiero que haga la suma
        int num;
        num=lector.nextInt();
        ejercicio1(num);//lo que me hará es hacer la suma de los numeros introducidos por el usuario, no los 10, sino los N numeros
        */
        ejercicio2();
    
    
    }
}
