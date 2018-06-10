
import java.util.Scanner;


public class Ejercicio4 {
    
    public static void main(String[] args) {
        

    	int cantidadInicial=2000;
        float interesAnual=2.75f;
        int retencionHacienda=18;
        float interesNeto;
        
        System.out.println("Cantidad Inicial:" + cantidadInicial);
        System.out.println("Intereses anuales al 2,75%: " + (interesAnual*cantidadInicial)/100);
        System.out.println("Intereses a los 6 meses: " + ((interesAnual*cantidadInicial)/100)/2);
        System.out.println("Retención Hacienda: " + ((((interesAnual*cantidadInicial)/100)/2)*retencionHacienda)/100);
        interesNeto=(((interesAnual*cantidadInicial)/100)/2-((((interesAnual*cantidadInicial)/100)/2)*retencionHacienda)/100);
        System.out.println("Interés neto: " + interesNeto);
        System.out.println("Cantidad Final: " + (cantidadInicial + interesNeto));
}
}