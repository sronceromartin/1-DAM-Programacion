/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
: De una clase de 15 alumnos determinar cuantas notas hay por encima de la
media de la clase.
 Datos:
 un vector de 15 elementos para guardar las notas
 Un índice para recorrer el vector
 Proceso:
 Recoger la notas
 Calcular la media
 Recorrer el vector contando cuantas notas están por encima de la media
calculada
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        //double notas[]={6.8,4.5,3.9,5.5,8.9,6.6,6.5,7.9,7.2,5.3,5.5,2.1,7.1,4.5,6.2};
        double notas[]=new double[15];//tenemos que ponerle el tamaño
        double suma=0;        
        double media;
        int contador=0;
        for(int i=0;i<notas.length;i++){
            notas[i]=Math.random()*10;//para que me iga las notas aleatoriamente
            suma=suma+notas[i];
           
        }
         media=(suma/notas.length);
        System.out.println("La media de la clase será: "+ media);
        
        //Recorrer el vector contando cuantas notas están por encima de la media
        for(int i=0;i<notas.length;i++){//va a recorrer el array para comparar con la nota media
        
            if(notas[i]>media){
                contador++;
            }
        }
        System.out.println("Alumnos por encima de la media: "+contador);
    }
}
