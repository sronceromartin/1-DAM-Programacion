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
public class Ejercicio1Alternativas {
    
    public static void main(String[] args) {
        
   
    
    Scanner lector=new Scanner(System.in);
        
        
        int horas;//son las horas que ha trabajado
        System.out.print(" Introduce las horas que has trabajado: ");
        horas=lector.nextInt();
        double precioH;//es el precio de la hora normal
        System.out.print("Introduce el precio de la hora normal: ");
        precioH=lector.nextDouble();
        int horasEX=horas-40;
        double sueldoT=0;//Es el sueldo total del trabajador contando las horas extra
        int horasDoble=0;
        int horasTriple=0;
        if(horas==40 || horas<40 ){
        
            System.out.print(" No ha realizado horas extra ");
        
        }else{
        
             if(horas>40){
             
                 if(horasEX<=8){
                     
                     horasDoble=horasEX;
                     sueldoT=horasDoble*(precioH*2);//el doble
                     System.out.print(" El sueldo total será: " + sueldoT);
                 
                 }else if(horasEX>8){
                 
                     horasDoble=8;//se lo asigno fijo para que luego me pueda hacer el calculo
                     horasTriple=horasEX-8;
                     sueldoT=horasDoble*(precioH*2)+ horasTriple*(precioH*3);//el doble hasta 8 más el triple
                     System.out.print(" El sueldo total será: " + sueldoT);
                 }                
                     
                 
                 
             
             }   
        
        }
        
      }   
        
        


}
