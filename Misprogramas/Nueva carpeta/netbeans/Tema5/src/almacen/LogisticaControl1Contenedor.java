/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;
import java.util.Scanner;
public class LogisticaControl1Contenedor {
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        int opcion;
        System.out.println("Introduce una opción: ");
        opcion=lector.nextInt();
        LogisticaAlmacen almacen1=new LogisticaAlmacen(2);
        LogisticaAlmacen almacen2=new LogisticaAlmacen(4);
        LogisticaAlmacen almacen3=new LogisticaAlmacen(8);
        
        do{
            int menu=opcion;
            switch(opcion){
            
                case 1:
                    if(almacen1.hayHuecos()){
                        almacen1.meterContenedor();
                    
                    }else if(almacen2.hayHuecos()){
                        almacen2.meterContenedor();
                    
                    }else if(almacen3.hayHuecos()){
                        almacen3.meterContenedor();
                    
                    }else{
                        System.out.println("No hay huecos");
                    
                    }
                break;    
                    
                case 2:
                    
                    
            
            }
        
        
        
        
        }
        
        
        
    }
    
         
}
