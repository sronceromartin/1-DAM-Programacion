/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        
    Scanner lector=new Scanner(System.in);
    
    
    char turno;
    System.out.print(" Introduce el turno: ");
    turno=lector.next().charAt(0);  
    if(turno=='m'){
        int sueldoM=600*8*5;
        System.out.print("El sueldo será: " + sueldoM);
    }else if(turno=='n'){
        int sueldoN=800*8*5;
        System.out.print("El sueldo será: "+ sueldoN);
    }else if(turno=='f'){
        int sueldoF=1000*8*5;
        System.out.print(" El sueldo será: "+ sueldoF);
    
    }else{
    
        System.out.print(" No hay otro turno" );
    }    
        
    }
    
    
        
    
}
