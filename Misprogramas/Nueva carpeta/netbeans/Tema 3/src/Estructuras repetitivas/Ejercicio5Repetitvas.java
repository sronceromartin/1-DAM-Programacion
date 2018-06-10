/*
Diseño de un algoritmo que sume todos aquellos números leídos mientras no sean
negativos, al introducirse un número negativo, muestra la suma y acaba el programa
 */
package repetitivas;

/**
 *
 * @author siby
 */
import java.util.Scanner;
public class Ejercicio5Repetitvas {
     public static void main(String[] args) {
        
         
         Scanner lector=new Scanner(System.in);         
        
         int suma=0;
         int a=0;//lo inicializo pq me lo pide, pero después machacamos con el introducido por teclado
         
             while(a>=0){
                    
                    System.out.println("Introduce un número: ");
                    a=lector.nextInt();
                    if(a>=0){
                            suma=suma+a;
                            System.out.println("El resultado de la suma es: "+ suma);//se pone fuera del while para que solo me salga el resultado de la suma
                    }else{
                            System.out.println("El número introducido es negativo");
                            System.out.println("El resultado de la suma es: "+ suma);
                    
                    }
             }
             
        
         
             
             
             }   
         }
    

