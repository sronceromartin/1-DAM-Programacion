/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author DAM 6J
 */
public class MetodosRecursivos {
    static long fact(int n){
    
        long f=1;
        if(n!=0){
            f=fact(n-1)*n;
        }
        return f;
    }

    static int Potencia(int num,int exp){
    
       int p=1;
       if(exp!=0){
           p=Potencia(num,exp-1)*num;
       }
       return p;
    }
    static int Producto(int num,int exp){
    
       int p=0;
       if(exp!=0){
           p=Producto(num,exp-1)+num;
       
       }
       return p;
    }
    
    static void TrianguloRecursivo(int num){
        int i;
        
        if(num!=0){
            TrianguloRecursivo(num-1);
        
        }
        for(i=1;i<=num;i++){
        
            System.out.print("*");
        }
        System.out.println(" ");
    }
    static void TrianguloInverso(int num){
        int i;
        for(i=1;i<=num;i++){
        
            System.out.print("*");
        }
        System.out.println(" ");
        if(num!=0){
            TrianguloInverso(num-1);
        
        }
           
    }
    static int Fibonacci(int n){
      /*p o         p=posicion o=operacion
        0-0
        1-1
        2-0+1=1
        3-1+1=2
        4-2+1=3
        5-3+2=5
        6-5+3=8
      */
      if(n==0||n==1){
      
          return 1;
      }else{
      
          return Fibonacci(n-1)+Fibonacci(n-2);
      }
      
    }



}
