13-. Escribe un programa que solicite tres valores enteros con el día, mes y año de una 
fecha e indique  si  se  trata de valores válidos para una  fecha. (tener en cuenta el 
número de días de cada mes)(el año será válido si es >=1970 y menor que 3000) 


package condicionales;

import java.util.Scanner;
import java.util.GregorianCalendar;
public class Ejercicio13 {
    
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        int anyo;
        System.out.print("Introduce un año: ");
        anyo=lector.nextInt();
        int mes;
        System.out.print("Introduce el mes en número: ");
        mes=lector.nextInt();
        int dia;
        System.out.print("Introduce el número de día: ");
        dia=lector.nextInt();
        GregorianCalendar calendar = new GregorianCalendar();
        
        if(anyo>=1970 && anyo<3000){
        
            System.out.println(" El año introducido es correcto ");
        
        }else{
        
            System.out.println(" El año introducido no es correcto ");
        
        }
        
            if(mes<=12){
        
                System.out.println(" El mes introducido es correcto ");
        
            }else{
        
                 System.out.println(" El mes introducido no es correcto ");
        
            }
        
                if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
        
                    if(dia<=31){
                       
                        System.out.println(" El día es correcto ");
                    
                    }else{
                    
                        System.out.println(" El día introducido no es correcto ");
                    }
                    
                }else if(mes==4 || mes==6 || mes==9 || mes==11){
                
                    if(dia<=30){
                    
                        System.out.println(" El día introducido es correcto ");
                    
                    }else{
                    
                        System.out.println(" El día introducido no es correcto ");
                    }
                
                
                }else if(calendar.isLeapYear(anyo)){
                    
                    if(dia>=29){    
                
                        System.out.println(" Es un año bisiesto ");
                        
                    }else{
                    
                        System.out.println(" No es un año bisiesto ");
                    
                    }
                }else{
                
                     System.out.println(" El dato introducido es incorrecto ");
                
                }
                    
    }      

    
    
}
