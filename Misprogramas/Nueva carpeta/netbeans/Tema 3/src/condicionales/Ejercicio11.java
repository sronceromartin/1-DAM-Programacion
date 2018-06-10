11. Escribe un programa que solicite un valor  real que indica una cantidad de dinero 
en euros. El programa debe mostrar por pantalla la mínima cantidad de monedas 
de cada tipo en que se debe devolver la cantidad de dinero indicada.  
package condicionales;

import java.util.Scanner;
public class Ejercicio11 {
    
    public static void main(String[] args) {
        int moneda2e=0;
	int moneda1e=0;
	int moneda50c=0;
	int moneda20c=0;
	int moneda10c=0;
	int moneda5c=0;
	int moneda2c=0;
	int moneda1c=0;
        Scanner lector=new Scanner(System.in);
        double cantidad;
        System.out.print(" Introduce una cantidad: ");
        cantidad=lector.nextDouble();

	
	int centimos=(int)cantidad*100;// lo utilizamos para que se pase la cantidad de dinero a centimos


	if(centimos>=200){
	moneda2e=centimos/200; //para una moneda de 2€ 200cent=2€
	centimos=centimos%200;// para saber la cantidad restante
	System.out.println(moneda2e+ "Monedas de 2€");
	}
	
	if(centimos>=100){
	moneda1e=centimos/100;
	centimos=centimos%100;
	System.out.println(moneda1e+ "Monedas de 1€");
	}

	if(centimos>=50){
	moneda50c=centimos/50;
	centimos=centimos%50;
	System.out.println(moneda50c+ " Monedas de 50 centimos");
	}

	if(centimos>=20){
	moneda20c=centimos/20;
	centimos=centimos%20;
	System.out.println(moneda20c+ " Monedas de 20 centimos");
	}

	if(centimos>=10){
	moneda10c=centimos/10;
	centimos=centimos%10;
	System.out.println(moneda10c+ " Monedas de 10 centimos");
	}

	if(centimos>=5){
	moneda5c=centimos/5;
	centimos=centimos%5;
	System.out.println(moneda5c+ "Monedas de 5 centimos");
	}

	if(centimos>=2){
	moneda2c=centimos/2;
	moneda2c=centimos%2;
	System.out.println(moneda2c+ " Monedas de 2 centimos");
	}

	if(centimos>=1){
	moneda1c=centimos/1;
	moneda1c=centimos%1;
	System.out.println(moneda1c+ "Monedas de 1 centimos");
	}



}
        
    }
    
}
