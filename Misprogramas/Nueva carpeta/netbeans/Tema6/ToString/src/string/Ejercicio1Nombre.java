/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.Scanner;
public class Ejercicio1Nombre {
       public static void main(String[] args) {
        
          

           /*Scanner lector=new Scanner(System.in);
           String nombre;
           System.out.println("Introduce el nombre: ");
           nombre=lector.nextLine();
           String primerApellido;
           System.out.println("Introduce tu 1º apellido: ");
           primerApellido=lector.nextLine();
           String segundoApellido;
           System.out.println("Introduce tu 2º apellido: ");
           segundoApellido=lector.nextLine();*/
           String nombre="Luisa";
           String primerApellido="Luiz";
           String segundoApellido="Pelez";
           String cadena=nombre.concat(" " +primerApellido).concat(" "+segundoApellido);
           //o el nombre completo  con todos los caracteres en minúsculas y luego en mayúsculas y su longitud
           System.out.println(cadena);//con las comillas consigo que salgan separados
           System.out.println(cadena.toUpperCase());
           System.out.println(cadena.length());
                   
           //los dos primeros caracteres de la cadena concatenada (solo en el caso de que la longitud de esta sea de dos o más caracteres)  
           if(cadena.length()>=2){
               System.out.println(cadena.substring(0,2));
           }
           
           //los dos últimos caracteres de la cadena concatenada (solo en el caso de que la longitud de esta sea de dos o más caracteres)
           if(cadena.length()>=2){
               System.out.println(cadena.substring(cadena.length()-2,cadena.length()));//como el último no lo coge tiene que ponerse length y no length -1
               
            }
           //el número de ocurrencias en la cadena del último carácter (cuántas veces se repite el último caracter)
           int contadorLetras=0;
           int i;
           char c=cadena.charAt(cadena.length()-1);
           for(i=0;i<=cadena.length()-1;i++){
               if(c==cadena.charAt(i)){
               
                  contadorLetras++;
               }
            }
           System.out.println(contadorLetras);
           
           //la cadena con todas las ocurrencias del primer carácter en mayúsculas (que te pase los caracteres iguales al primero a mayuscula)
           
           /*int contador=0;
           int j;
           char C=cadena.toUpperCase().charAt(0);
           for(j=0;j<=cadena.length()-1;j++){
               if(C==cadena.charAt(i)){
                 
                  contador++;
               }
            }
           System.out.println(contador);
           */
           char letraMin=cadena.toLowerCase().charAt(0);
           System.out.println("Letra: "+letraMin);
           char letraMay=cadena.toUpperCase().charAt(0);
           System.out.println(cadena.replace(letraMin,letraMay));
           
           //la cadena con tres asteriscos por delante  y por detrás 
           
            System.out.println("***"+cadena.substring(3,cadena.length()-3)+"***");
            
           //a cadena invertida (Sólo la muestra, no la guarda invertida) 
           String cadenaInvertida=" ";
           for (int x=cadena.length()-1;x>=0;x--){
		cadenaInvertida = cadenaInvertida + cadena.charAt(x);
           } 
           System.out.println(cadenaInvertida);
    }
         
}
