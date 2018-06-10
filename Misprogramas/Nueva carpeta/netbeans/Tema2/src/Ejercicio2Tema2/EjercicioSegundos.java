
package expresiones;

import java.util.Scanner;
public class EjercicioSegundos {
    public static void main(String[]args){
    
    Scanner lector=new Scanner(System.in);
    int segundos;
    System.out.print(" Introduce los segundos : ");
    segundos=lector.nextInt();
    int minutos=segundos/60;
    int horas=minutos/24;
    int dias= horas/60;
    System.out.println(segundos + " "+ "segundos equivale a "+ minutos+ "minutos");
    System.out.println(minutos + " " + "minutos equivale a "+ horas+ "horas");
    System.out.println(horas + " "+ "horas equivale a "+ dias+ "días");
    
    
    }
}
