/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConjuntoDatos;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author ASIR 7L
 */
public class ConjuntoTreeSet {
    static Scanner lector=new Scanner(System.in);
    static TreeSet<Integer>t=new TreeSet<Integer>();
    public static void main(String[] args) {
        
        int opcion=0;// lo inicializamos a cero para que luego en el switch no me de errores aunque luego le vayamos a asignar el menú
        do{  
            try{
                opcion=menu();
            }catch(InputMismatchException e){
                System.out.println("Debe introducir un número");
            }        
            int num;
            switch(opcion){
                
                case 1://Añadir elementos
                    num=pedirNumero();//con esta variable almacenamos los números que pedimos al usuario
                    insertar();
                    break;
                case 2: //Borrar elemento
                    borrar();
                    break;
                case 3://Mostrar     
                    mostrar();
                    break;
                case 4: 
                    System.out.println("Hasta pronto");
                    
            }
        
        }while(opcion!=4);
        
 }
    
    
    public static int pedirNumero(){
        int num;
        System.out.println("Introduce un número: ");
        num=lector.nextInt();
        return num;
    
    }
    public static void insertar(){
        int num;
        int i;
        for(i=0;i<5;i++){// que llegue hasta 5 elementos
            num=pedirNumero();//le pido al usuario los 5 elementos
            if(t.add(num)){
                System.out.println("Añadido "+ num);
            }else{
                System.out.println("No puedo añadir número");
            }
        }
    }
    
    public static  void borrar(){
        int num;
        System.out.println("¿Qué número quiere borrar? ");
        num=lector.nextInt();
        if(t.remove(num)){//el remove recorre en Hashset
            System.out.println("Borrando número..."+ num);
        }else{
            System.out.println("No se ha podido borrar");
        } 
    }
    
    public static void mostrar(){
        Iterator <Integer>ith=t.iterator();// primero hago que la variable de tipo Iterator contenga el tipo HashSet
        while(ith.hasNext()){//mientras haya un elemento
            System.out.println(ith.next());// me imprimirá el elemento siguiente
        }
    
    }
    
    public static int  menu(){
        int opc;
        System.out.println("¿Qué desea hacer?\n "+
                "1. Añadir elemento\n"+
                "2. Borrar elemento\n"+
                "3.Mostrar\n"+ 
                "4.Salir\n"
                );
        opc=lector.nextInt();
        return opc;
    }
    
}
