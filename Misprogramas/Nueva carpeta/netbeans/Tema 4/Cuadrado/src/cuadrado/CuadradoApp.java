/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrado;

import java.util.Scanner;

public class CuadradoApp {
     public static void main(String[] args) {
        
         Scanner lector=new Scanner(System.in);
        int lado;
        System.out.println("Introduce el valor del lado: ");
        lado=lector.nextInt();
        
        Cuadrado c=new Cuadrado(lado);
        c.Dibujar(lado);//me sirve para que me imprima el cuadrado
     }    
}
