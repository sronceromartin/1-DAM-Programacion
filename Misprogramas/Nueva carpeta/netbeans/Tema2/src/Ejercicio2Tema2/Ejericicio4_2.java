/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresiones;

import java.util.Scanner;
public class Ejericicio4_2 {
    public static void main(String[]args){
    
        Scanner lector=new Scanner(System.in);
        int cantidadInicial;
        System.out.print("Introduzca el importe de su fondo : ");
        cantidadInicial=lector.nextInt();
        lector.nextLine();
        float interesAnual=2.75f;
        float retencionHacienda=18f;
        float interesNeto;
        
        System.out.println("Cantidad Inicial:" + cantidadInicial);
        System.out.println("Intereses anuales al 2,75%: " + (interesAnual*cantidadInicial)/100);
        System.out.println("Intereses a los 6 meses: " + ((interesAnual*cantidadInicial)/100)/2);
        System.out.println("Retención Hacienda: " + ((((interesAnual*cantidadInicial)/100)/2)*retencionHacienda)/100);
        interesNeto=(((interesAnual*cantidadInicial)/100)/2-((((interesAnual*cantidadInicial)/100)/2)*retencionHacienda)/100);
        System.out.println("Interés neto: " + interesNeto);
        System.out.println("Cantidad Final: " + (cantidadInicial + interesNeto));
    
    
    
    
    
    }    
}
