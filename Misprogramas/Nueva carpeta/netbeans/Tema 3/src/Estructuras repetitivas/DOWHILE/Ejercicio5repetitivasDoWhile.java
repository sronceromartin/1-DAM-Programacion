/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repetitivas;

/**
 *
 * @author DAM 6J
 */
import java.util.Scanner;
public class Ejercicio5repetitivasDoWhile {
    
    public static void main(String[] args) {
        
        
         int suma=0;
         int a=0;//lo inicializo pq me lo pide, pero después machacamos con el introducido por teclado
         
         if(a<0){
         
             System.out.println("El número introducido es negativo");
             System.out.println("El resultado de la suma es: "+ suma);
         
         }else{
         do{
             Scanner lector=new Scanner(System.in);
             System.out.println("Introduce un número: ");
             a=lector.nextInt();
             suma=suma+a;
                  
         }while(a>=0);
            System.out.println("El resultado de la suma es: "+ suma);//se pone fuera del while para que solo me salga el resultado de la suma
    }
    }
}
