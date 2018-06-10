/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

/**
 *
 * @author Siby
 */
import java.util.Scanner;

public class Ejercicio3Alternativas {

    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        int sueldoAc;
        System.out.print(" Introduce tu sueldo actual: ");
        sueldoAc=lector.nextInt();
        int sueldoInc=0;
        
        if(sueldoAc<6000){ //si pongo >=0 o <6000, todos se me quedarían en este por que se cumple que sean todos mayorres de 0
        
            sueldoInc=sueldoAc+ (sueldoAc*20/100);
            System.out.print(" El sueldo incrementado será: "+ sueldoInc + "\n" + "y el porcentaje de aumento será del 20% " );
        
        }else if(sueldoAc<7900){ //no puedo poner que sean >=6000 por que todos se quedarían aquí ya que sería iguales o mayores que 6000
        
            sueldoInc=sueldoAc+ (sueldoAc*10/100);
            System.out.print(" El sueldo incrementado será: "+ sueldoInc + "\n" + "y el porcentaje de aumento será del 10% " );
            
        }else if(sueldoAc<12000){
        
            sueldoInc=sueldoAc+ (sueldoAc*5/100);
            System.out.print(" El sueldo incrementado será: "+ sueldoInc + "\n" + "y el porcentaje de aumento será del 5% " );
        
           
        }else if(sueldoAc>=12000){
        
            sueldoAc=sueldoInc;
            System.out.print(" El sueldo incrementado será: "+ sueldoInc + "," + "no se habrá producido ningún aumento ");
        
        }
        
    }
}
