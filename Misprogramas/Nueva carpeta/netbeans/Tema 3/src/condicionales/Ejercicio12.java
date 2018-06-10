/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Scanner;
import java.util.GregorianCalendar;
public class Ejercicio12 {
    
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        int diaN;
        System.out.print(" Introduce un día: ");
        diaN=lector.nextInt();
        int mesN;
        System.out.print(" Introduce un mes: ");
        mesN=lector.nextInt();
        int anyoN;
        System.out.print(" Introduce un año: ");
        anyoN=lector.nextInt();
        int edad=anyoAc-anyoN;
        Calendar fecha= new GregorianCalendar();
        int diaAc;
        int mesAc;
        int anyoAc;
        diaAc=fecha.get(GregorianCalendar.DAY_OF_MONTH);
        mesAc=fecha.get(GregorianCalendar.MONTH)+1;
        anyoAc=fecha.get(GregorianCalendar.YEAR);
        System.out.print(" La fecha actual es: "+ diaAc + "/" + mesAc + "/" + anyoAc );
        
        
        System.out.println("la edad de la persona será: "+ edad);
        
    }
    
}
