/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos2;

import java.util.Scanner;
public class EjercicioMetodos2Indice {
    public static void main(String[] args) {
       int opcion=escribeMenu(); // para que no tenga un valor de 0 fijo,le ponemos la función
       
        Scanner lector=new Scanner(System.in);
        do{
                
        switch (opcion){
        
            case 1: 
                    
                    int num;
                    System.out.println("Introduce un número:");
                    num=lector.nextInt();
                    System.out.println(esCapicua(num));
                    break;
           
            case 2:
                    
                    int num1,num2;
                    System.out.println("Introduce un número: ");
                    num1=lector.nextInt();
                    System.out.println("Introduce otro número:");
                    num2=lector.nextInt();
                    System.out.println(sumaDivisores(num1));
                    System.out.println(sumaDivisores(num2));
                    break;
                    
            case 3:
                    
                    int filas,columnas;
                    System.out.println("Intoduce el número de filas: ");
                    filas=lector.nextInt();
                    System.out.println("Introduce el número de columnas: ");
                    columnas=lector.nextInt();
                    break;
                    
            case 4:
                    
                    
                    break;
                    
            default:
                    System.out.println("La opción elegida no es la correcta");
        }            
                    
        }while(opcion!=4);
    }
    
    static int escribeMenu(){
        System.out.println("1. Capicua");
        System.out.println("2.Números amigos");
        System.out.println("3.Dibujar rectángulo de *");
        System.out.println("4.Salir");
        Scanner lector=new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Introduce una opción: ");//se tendrá qque repetir cuando salga lo que el while tiene
            opcion=lector.nextInt();
        
            if(opcion<1 || opcion>4){
                System.out.println("Opción incorrecta");
            }
        }while(opcion<1 || opcion>4);
            
                
        
         return opcion;
    }
       
   
    
   static boolean esCapicua(int numero){
    
    
        int nInvertido=0,nfalta=numero,resto=0;
             
        
            while(nfalta==numero){
            resto=nfalta%10;
            nInvertido=nInvertido*10+resto;
            nfalta=nfalta/10;
            }
        
            if(nInvertido==numero){
                return true;
            }else{

                return false;
            }
        
        
        
    }


    static int sumaDivisores(int n){

        int suma=0;

        for(int i=1;i<n;i++){

            if(n%i==0){
                suma=suma+i;
            }
            
        }
        return suma;
    }
    
    static void escribeLinea(int n){
    
        for(int i=1;i<=n;i++){//me imprime en una fila el número de * que yo le pase por parámetro
            System.out.print("*");
            
        
        }
        System.out.println(" ");
    }
    static void cuadrado(int l,int c){
        int j;
        for(j=1;j<=l;j++){// lo que hace es recorrer la columna
            
            escribeLinea(c);// para la columna
        }
    }
}    