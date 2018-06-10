/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionesSencillas;

import java.util.Scanner;
public class Ejercicio4FuncionesSencillas {
    
    public static void main(String[] args) {
       
    int num1;
    int num2;
    
    do{
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduce un número: ");
        num1=lector.nextInt();
        System.out.println("Introduce otro número: ");
        num2=lector.nextInt();
     
        System.out.println("El resultado de la operación es: " + combinatorio(num1,num2));
        
    }while(num1<0&& num2<0);

    
    }
        static int combinatorio(int m,int n){
        
            
            int combi;
            int i,j,k, factM=1,factN=1;
            int factR=1;
           
        
            factM=factorial(m);
            factN=factorial(n);
            factR=factorial(m-n);
            
            if(m<n){
            
                return 0;
            }else{
        
                combi=factM/(factN*factR);
        
                return combi;//me tiene que devolver el resultado de la operación para obtener el combinatorio
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
