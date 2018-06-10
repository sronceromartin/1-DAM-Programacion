/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
  Una empresa consta de tres departamentos, el programa lee como
entrada el departamento en el que se ha producido una venta (1,2,o 3). El programa va
acumulándolas en un array y a finalizar la entrada, determinar el total de ventas
diarias por departamento. 
 */

import java.util.Scanner;
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        int importe;
        int departamento;
        int depart[]=new int[5];//lo saco fuera para que no se me vayan machacado los datos cada vez que me piden un valor
        int ventas[]=new int [5];
        int i=0;
        int ventas1=0;
        int ventas2=0;
        int ventas3=0;
        
        do{
            Scanner lector=new Scanner(System.in);
            System.out.println("Introduce el importe vendido: ");
            importe=lector.nextInt();
            System.out.println("Introduce el número del departamento donde se ha producido la venta: ");
            departamento=lector.nextInt();
            
            depart[i]=departamento;
            ventas[i]=importe;
                    
            i++;// hay que incrementar la i para que recorra el array
        }while(departamento<=3&&departamento>0&&i<5); //tenemos que poner esta condicion para que pare después de pedir la 5ª, y tiene que ser menor que 5 si no me pediría 6       
        
        for(i=0;i<depart.length;i++){
            if(depart[i]==1){
                
                ventas1=ventas1+ventas[i];
                
            }else if(depart[i]==2){
                 ventas2=ventas2+ventas[i];
            
            }else if(depart[i]==3){
                 ventas3=ventas3+ventas[i];
            
            }
            
            
        }
        System.out.println("Las ventas del departamento 1 serán: "+ ventas1);
        System.out.println("Las ventas del departamento 2 serán: "+ ventas2);
        System.out.println("Las ventas del departamento 3 serán: "+ ventas3);
    }
}
