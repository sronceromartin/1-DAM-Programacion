/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
Escribe un programa que permita introducir un vector de diez elementos,
visualizar e indicar luego si hay o no algún elemento repetido. En ese
caso indicar cuáles son y la posición que ocupan.
 */
public class AmpliacionArrays {
    
    public static void ejercicio1(){
    
        int elementos[]={1,2,4,1,2,3,5,7,2,0};
        boolean pos[]=new boolean[elementos.length];
        int i,j;
        for(i=0;i<elementos.length;i++){//recorre el array para ir comparando
            pos[i]=false;
        }   
            for(i=0;i<elementos.length;i++){//recorre el vector para saber si está repetido
                if(!pos[i]){
                    for(j=i+1;j<elementos.length;j++){//empieza en i+1 pq el primer elemento ha sido utilizado ya en el primero
                        if(elementos[i]==elementos[j]){
                             if(!pos[i]){
                                 System.out.println("Valor: "+ elementos[i]+","+ "posicion:"+ i);
                                 pos[i]=true;
                             }
                             System.out.println(j);
                             pos[j]=true;
                        }
                
                    }
                }
            }
       
    
    }
    /*Escribe un programa que permita, partiendo de un Vector V de cincuenta
elementos, generar un vector P de cincuenta elementos de forma que:
P(1)=V(1),
P(2)=V(1)+V(2),
P(3)=V(1)+V(2)+V(3)
....
P(50)= V(1)+V(2)+V(3)+...+ V(50) 
*/
    public static void ejercicio2(){
    
        int v[]=new int[50];
        int p[]=new int[50];
        int i,j;
        for(i=0;i<v.length;i++){//recorre los elementos del array
            v[i]=(int)(Math.random()*100);
            System.out.println("Vector v: "+ v[i]);
            for(j=0;j<=i;j++){
                    p[i]=p[i]+v[j];
            } 
            System.out.println("Vector p: "+ p[i]);    

        }    
        
        
    
    }
    /*Escribe un método, de nombre obtenerLongCadenas, que reciba por
parámetro un array de cadenas y devuelva un array de enteros con los
tamaños de las cadenas contenidas en el array*/
    public static int[] obtenerLongCadenas(String cad[]){
        int longi[]=new int[cad.length];
        int i;
        for(i=0;i<cad.length;i++){
            longi[i]=cad[i].length();
        }
        return longi;
    }
    
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        String cad[]={"hola","Adios","Si","No"};
        int longi[]=obtenerLongCadenas(cad);
        for(int j=0;j<cad.length;j++){
            System.out.println(longi[j]);
        
        }
    }
}
