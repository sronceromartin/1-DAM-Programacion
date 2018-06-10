/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repetitivas;

import java.util.Scanner;
public class Ejercicio3Repetir {
    
    public static void main(String[] args) {
        
       Scanner lector=new Scanner(System.in);
       int num;
       System.out.println("Introduce un número: ");
       num=lector.nextInt();
       char signo='*';
       int repetir=num;//solo se utilizaría si ponemos que nos imprima el numero de veces que se repite el signo, lo ponemos igual al valor de num al iniciar, por que luego sería 0
       
       do{
           num=num-1;
           System.out.println(signo);
       
       
       
       }while(num>0);
        System.out.println( signo + " se repite "+ repetir + " veces " );
    }
}
