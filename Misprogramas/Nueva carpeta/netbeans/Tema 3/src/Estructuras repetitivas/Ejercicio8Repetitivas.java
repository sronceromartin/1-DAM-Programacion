/*
Diseña un algoritmo que lea 100 números y cuente los positivos, negativos y nulos y
muestre los totales
 */
package repetitivas;

import java.util.Scanner;

public class Ejercicio8Repetitivas {

    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        int num=0;
        
        int sumaP=0;
        int sumaN=0;
        int sNulo=0;
        int contador=0;
        
        while(contador<100){//ponemos contador ya que es el que nos limita a 100 números
            
           System.out.println("Introduce un número: ");
           num=lector.nextInt();
        
        
            if(num>0){
                    
                sumaP=sumaP+1;
                contador=contador+1;//es el contador del while para que cuente hasta 100
                
            }else if(num<0){
        
                sumaN=sumaN+1;
                contador++;//es el contador del while para que cuente hasta 100
                
        
            }else{// los nulos son los 0
        
                sNulo=sNulo+1;
                contador++;//es el contador del while para que cuente hasta 100
                
        
        }
 
        }
            System.out.println(" Tenemos: "+ sumaP + " número positivos" );
            System.out.println(" Tenemos: "+  sumaN+ " números negativos");
            System.out.println(" Tenemos: "+  sNulo+ " números nulos");
    }
        
}
