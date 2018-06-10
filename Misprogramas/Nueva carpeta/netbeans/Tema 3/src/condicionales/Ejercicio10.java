10-Se introduce por teclado una hora determinada con el formato H, M, S (H: horas, M: 
minutos,  S:  segundos).  Calcular  qué  hora  será  dentro  de  un  minuto. 
package condicionales;

import java.util.Calendar;
import java.util.GregorianCalendar;
public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        Calendar horario=new GregorianCalendar();
        
        int hora;
        int minutos;
        int segundos;
        
        hora=horario.get(Calendar.HOUR_OF_DAY);
        minutos=horario.get(Calendar.MINUTE);
        segundos=horario.get(Calendar.SECOND);
	minutos=minutos+1;
	if(minutos>59){

		minutos=0;
		hora=hora+1;
		if(hora>23){ 

			hora=0;
		}		
	  System.out.print(hora + ":" + minutos + ":" + segundos);	 

	}
       
    
    
    
    }
    
    
    
}
