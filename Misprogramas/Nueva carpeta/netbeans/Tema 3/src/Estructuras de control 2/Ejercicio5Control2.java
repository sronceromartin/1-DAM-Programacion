/*
Un almacén de muebles nos ha pedido un programa para controlar la carga de los camiones que usa para distribuir sus productos. Sabiendo que todos los camiones son iguales, y que pueden cargar como máximo 27800 kg. o hasta un volumen ocupado de 26,75 m3 (puede que no se llegue al peso máximo, pero que el camión se encuentre lleno). El programa deberá leer repetidamente dos cantidades, que corresponden al peso y volumen de cada uno de los muebles que van a ser cargados en el camión, de manera que el programa irá acumulando las cantidades anteriores hasta que se iguale o sobrepase el valor del peso o volumen máximo. Momento en que mostrará como resultado el valor 1 o 2 según sea el caso: 1) La diferencia que hay entre el peso máximo y el cargado, si el programa ha terminado por esta condición. 2) La diferencia que hay entre el volumen máximo y el volumen cargado, si el programa ha terminado por esta condición. 
 */
package control;

import java.util.Scanner;
public class Ejercicio5Control2 {
    
    public static void main(String[] args) {
        
        int cargaM=27800;
        float volumenM=26.75f;
        int pesoAcum=0;
        float volumAcum=0f;
        
        
        do{
        Scanner lector=new Scanner(System.in);
        int carga;
        System.out.println("Introduce la cantidad de carga en Kg: ");
        carga=lector.nextInt();
        
        float volumen;
        System.out.println("Introduce el volumen del producto en m3: ");
        volumen=lector.nextFloat();
        
        pesoAcum=pesoAcum+ carga;
        volumAcum=volumAcum+volumen;
        
        }while(pesoAcum>=cargaM && volumAcum>=volumenM);//tienen que cumplirse ambas
        
            int difcarga= cargaM-pesoAcum;
            System.out.println("La diferencia entre los pesos es de: "+ difcarga);
            float difVolum=volumenM-volumAcum;
            System.out.println("La diferencia entre volumenes es de: "+ difVolum);
    }
}
