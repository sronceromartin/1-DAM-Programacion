/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logistica;

import java.util.Scanner;
public class LogisticaControl1Contenedor {
    
    public static void main(String[] args) {
       Scanner lector=new Scanner(System.in); 
       char opcion;
       System.out.println("Introduzca la opción, (m) si va a meter o (s) si va a sacar un contenedor: ");
       opcion=lector.next().charAt(0);
       LogisticaAlmacen A1=new LogisticaAlmacen();
       LogisticaAlmacen A2=new LogisticaAlmacen();
       LogisticaAlmacen A3=new LogisticaAlmacen();
       if(opcion=='m'){
           if(A1.MeterContenedor()==true){
           
               System.out.println("Tienes espacio para meter el contenedor ");
           
           }else{
           
               System.out.println("No quedan huecos en el Almacen 1");
           
           }
           
       }else if(opcion=='s'){
       
       
       }
    }
    
}
