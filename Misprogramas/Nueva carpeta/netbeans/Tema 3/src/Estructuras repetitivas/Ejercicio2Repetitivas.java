/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repetitivas;

/**
 *
 * @author DAM 6J
 */
import java.util.Scanner;
public class Ejercicio2Repetitivas {
    
    public static void main(String[] args) {
        
        int num1=1;
        Scanner lector=new Scanner(System.in);
        int num2;
        System.out.print(" Introduce un número: ");
        num2=lector.nextInt();
        int suma=0;
        
        
        if(num2<1){
        
            System.out.print("0");
            
        }else{ 
            
            
            while(num1<=num2){
        
                suma=suma+num1;
                System.out.println(suma);// si quiero que me salga todo
                num1=num1+1;
            }
            
            System.out.println("suma= "+ suma);//si quiero que solo me salga la suma
        }
        
        
        
    }
    
    
}
