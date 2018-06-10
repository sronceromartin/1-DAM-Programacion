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
public class Ejercicio4Alternativas {
    
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        int num;
        System.out.print(" Introduce un número del 0 al 99: ");
        num=lector.nextInt();
        int dec;
        System.out.print(" Introduce las decenas: ");
        dec=lector.nextInt();
        
        switch(num){
        
            case 0:
                System.out.print("Cero");
                break;
                
            case 1:
                System.out.print("Uno");
                break;    
                
            case 2:
                System.out.print("Dos");
                break;    
            
            case 3:
                System.out.print("Tres");
                break;    
                
            case 4:
                System.out.print("Cuatro");
                break;    
                
            case 5:
                System.out.print("Cinco");
                break;    
                
            case 6:
                System.out.print("Seis");
                break;    
                
            case 7:
                System.out.print("Siete");
                break;    
                
            case 8:
                System.out.print("Ocho");
                break;    
                
            case 9:
                System.out.print("Nueve");
                break;    
                
            default:
                
                System.out.print(" El número introducido no está dentro de este rango ");
        
       }         
                
                
            switch(dec){
            
            case 1:
                System.out.print("Diez");
                break;    
                
            case 2:
                System.out.print("Veinte");
                break;    
            
            case 3:
                System.out.print("Treinta");
                break;    
                
            case 4:
                System.out.print("Cuarenta");
                break;    
                
            case 5:
                System.out.print("Cincuenta");
                break;    
                
            case 6:
                System.out.print("Sesenta");
                break;    
                
            case 7:
                System.out.print("Setenta");
                break;    
                
            case 8:
                System.out.print("Ochenta");
                break;    
                
            case 9:
                System.out.print("Noventa");
                break;    
                
            default:
                System.out.print("");
                
            }        
                
                
                
        
        
    }
    
}
