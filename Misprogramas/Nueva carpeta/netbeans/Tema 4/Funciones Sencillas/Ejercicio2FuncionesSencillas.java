/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionesSencillas;

import java.util.Scanner;
public class Ejercicio2FuncionesSencillas {
    public static void main(String[] args) {
        
        String frase;
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        frase=lector.nextLine();
        int i,suma=0;
        
        char caracter;
        for(i=0;i<frase.length();i++){
            caracter = frase.charAt(i);// me cuenta los caracteres que hay en la frase según la posición de i
            suma=suma+esdigito(caracter);   // hago la llamada de la función que me sumará 1 si hay un digito o 0 si no lo hay          
            /*if( Character.isDigit(caracter)){//es lo mismo que hay dentro de la función, isdigit es una función booleana
            
                suma=suma+1;
            
            }else{
            
                suma=suma+0;
            }*/
        }
        
        
        System.out.println(suma);//me calcula el número de letras que hay
    }
    static int esdigito(char c){// el parámetro tomará valores como la variable caracter
        if (Character.isDigit(c)){
            //System.out.println("El caracter es un dígito"); Se lo quitamos porque solo me pide el número de caracteres
            return 1;
        }else{
            //System.out.println("El caracter NO es un dígito");
            return 0;
        }    
    }
}
