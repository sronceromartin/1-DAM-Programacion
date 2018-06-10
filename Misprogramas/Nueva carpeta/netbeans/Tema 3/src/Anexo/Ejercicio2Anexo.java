/*
Programa que indique si una secuencia de números introducidos por teclado (se acaba con 0) está en orden. 
 */
package anexo;

import java.util.Scanner;
public class Ejercicio2Anexo {
    
    public static void main(String[] args) {
        int num=1;
        int almacenar=0;//hay que inicializarlo en cero pq es el número anterior a 1 que sería el más pequeño
        boolean ordenado=true;
        
        do{
            Scanner lector=new Scanner(System.in);
            System.out.println("Introduce un número: ");
            num=lector.nextInt();
             
             if(num!=0){       
                if(num<=almacenar)
                {
                    
                    ordenado=false;
                
                }//no ponemos un else ya que si se pone al tener el true por defecto cuando metemos un ultimo número que si cumple con el orden, me cambia de false a true y no da bien
                almacenar=num;//lo ponemos después del if para que primero compare el numero introducido y el valor inicial
             }     
        }while(num!=0);
            
            if(ordenado==true){
                System.out.println("Los números están ordenados");
            }else{
                System.out.println("Los números no están ordenados");
            
            }
    }
}
