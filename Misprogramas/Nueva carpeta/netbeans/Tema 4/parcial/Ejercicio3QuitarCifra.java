/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.Scanner;
public class Ejercicio3QuitarCifra {
    
    public static void main(String[] args) {
       Scanner lector=new Scanner(System.in);
       int num, N2=0;
       System.out.println("Introduce un número: ");
       num=lector.nextInt();
        if(num>=100){//esto se pone para que tenga más de 2 cifras
            //System.out.println("N2 = "+ quitarPrimero(num));
            int num2 = quitarPrimero(num);
            System.out.println( quitarUltimo(num2));
            
          
        }else{
        
            N2=0;
            System.out.println("N2 = "+ N2);
        
        
        }
        
    }    
    static int quitarPrimero(int N1){
    
        int longi=0;
        int cociente=0;
        int N2;
        int primero;
        int cifra=longi+1;
        while(N1%10==0 || cociente>0){
            cociente=N1/10;
            longi++;
        }
            primero=N1/(int)(Math.pow(10, cifra));
            N2=N1-primero*(int)(Math.pow(10,cifra));
            return N2;
    }
    static int quitarUltimo(int N1){
        
        int N2=0;
   
        N2=N1/10;
        return N2;
        
        
    }
}
