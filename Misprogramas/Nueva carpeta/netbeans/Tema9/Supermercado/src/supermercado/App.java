/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author ASIR 7L
 */
public class App {
    static HashSet<Abono>a=new HashSet<Abono>();
    static Scanner lector=new Scanner(System.in);
    public static void main(String[] args) {
        int opcion=0;
        do{
            opcion=menu();// hay que pedir el menú cada vez
            switch(opcion){
                case 1://Hacer abono 
                    Abono abono=pedirDatos() ;//meto en una variable el abono para luego utilizarlo
                    añadirAbono(abono);
                    break;
                case 2://Mostrar
                    mostrar();
                    break;
                case 3://salir
                    System.out.println("Hasta pronto");
                    break;
            }
        
        
        }while(opcion!=3);
        
        
    }
    public static int menu(){
        int opc;
        System.out.println("--- Elija que desea hacer ---\n" +
                                "1- Hacer abono\n" +
                                "2- Mostrar\n " +
                                "3- Salir\n");
        opc=lector.nextInt();
        return opc;
    }
    
    public static void añadirAbono(Abono abono){
       
        if(a.add(abono)){
                System.out.println("Añadido ");
        }else{
            System.out.println("Vale duplicado");
        }    
    }
    
    public static void mostrar(){
        Iterator <Abono>it=a.iterator();// primero hago que la variable de tipo Iterator contenga el tipo HashSet
        while(it.hasNext()){//mientras haya un elemento
            System.out.println(it.next());// me imprimirá el elemento siguiente
        }
    
    }
    
    
    
    
    public static Abono pedirDatos(){
        int cCliente;
        int cVale;
        double iCompra;
        double descuentoV;//el descuento será un importe
        try{
            System.out.println("Introduce el código del cliente: ");
            cCliente=lector.nextInt();
            System.out.println("Introduce el código de vale: ");
            cVale=lector.nextInt();
            System.out.println("Introduce el importe de la compra: ");
            iCompra=lector.nextDouble();
            System.out.println("Introduce el descuento: ");
            descuentoV=lector.nextDouble();
            return new Abono(cCliente,cVale,iCompra,descuentoV);
        }catch(InputMismatchException e){
            System.out.println("No es un número");
        }
        
        return null;
    }
}
