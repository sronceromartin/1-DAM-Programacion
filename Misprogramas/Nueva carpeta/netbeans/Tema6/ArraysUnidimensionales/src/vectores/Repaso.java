/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

/*Escribe un programa que permita introducir un vector de 50 elementos numéricos e
indique luego cual es el primer elemento cuyo contenido sea cero. Si no lo hubiera,
debe indicarlo.*/
public class Repaso {
   
    public static void primerCero(){
        int arrayNumeros[]=new int[50];
        int i=0;
        boolean esCero=false;
        for(i=0;i<arrayNumeros.length;i++){
            int primerElemento=i;
            arrayNumeros[i]=(int)(Math.random()*100);
            System.out.println(arrayNumeros[i]);
            if(arrayNumeros[i]==0){
                esCero=true;
                System.out.println("Hay un cero");
            }
        }
        
    
    
    }
    /*Escribe un programa que permita introducir vector de diez elementos y visualizar,
indicar luego posición y contenido de todos aquellos que sean mayores que diez.
Indicando cuantos elementos hay que cumplen esta condición*/
    public static void mayoresde10(){
        int vector[]=new int[10];
        int i;
        int contador=0;
        for(i=0;i<vector.length;i++){
            vector[i]=(int)(Math.random()*100);
            if(vector[i]<10){
                System.out.println("Posicion: "+ i + "Vector : "+ vector[i] );
                contador++;
           }
            
        }
        System.out.println("contador: "+ contador);
    
    }
    
    /*Escribe un programa que permita introducir un vector P de diez elementos numéricos,
visualizar su contenido, crear un vector V con los elementos de P que sean mayores
de diez. Visualizar luego el contenido de V.*/
    
    public static void traspaso(){
    
        int vectorP[]=new int [10];
        int vectorV[]=new int [10];
        int i;
        for(i=0;i<vectorP.length;i++){
            vectorP[i]=(int)(Math.random()*100);
            System.out.println("VectorP: "+ vectorP[i]+ "Posicion: "+ i);
            vectorP=vectorV;
            System.out.println("****************");
            if(vectorP[i]>10){
                
                System.out.println("VectorV:" + vectorV[i]+ "Posicion: "+ i);
            }
        
        }
    }
    
    
    public static void main(String[] args) {
        //primerCero();
        //mayoresde10();
        traspaso();
    }
}
