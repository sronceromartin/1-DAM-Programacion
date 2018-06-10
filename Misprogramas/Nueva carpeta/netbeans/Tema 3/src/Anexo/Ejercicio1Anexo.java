/*
 Programa que indique si alguno de los números introducidos por teclado (se acaba con 0)  tiene algún 0 entre sus cifras
 */
package anexo;

import java.util.Scanner;
public class Ejercicio1Anexo {
    
    public static void main(String[] args) {
        int num = 1;//lo sacamos fuera y lo igualamos a 1 pq si no no entraría en el bucle
        while(num!=0){
            Scanner lector=new Scanner(System.in);            
            System.out.println("Introduce un número: ");
            num=lector.nextInt();
            int cociente=num;//no puede ser igual a 0, si no en el while no se daría
            int resto = num % 10;
            boolean ceros = resto == 0 ;//es lo mismo que decir true
            while(ceros==false && cociente>10){
                    resto=cociente%10; // si ponemos num en lugar de cociente no decrecería el número
                    cociente=cociente/10; 
                    if(resto==0){
                        ceros=true;                    
                    } 
            }
            
            if(resto==0){//tienen que estar dentro del while que hace que se repita todo hasta que sea igual a 0
                System.out.println("Este número " + num + "contiene ceros");
            }else{
                System.out.println("El número "+ num + "no contiene ceros");
            }
        }                
    }    
}
    
