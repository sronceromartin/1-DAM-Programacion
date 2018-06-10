/*
Se quiere realizar una aplicación que gestione los distintos carriles de acceso a la salida
de la autopista. Se dispone de 3 ventanillas, que funcionan como una cola donde el
primero que llega es el primero que sale. Cada cola tiene una denominación diferente: 
• EFECTIVO
• IMPORTE_EXACTO
• TARJETA 

La aplicación permitirá: 
• Añadir vehículo a la cola (al final de la cola)
• Eliminar vehículo de la cola (del principio de la cola)
• Salir de la aplicación

Al finalizar la aplicación se mostrará el número de COCHES total que ha pasado por la autopista       
 */
package Consola;

/**
 *
 * @author ASIR 7L
 */
import Controlador.GestorAutopista;
import Modelo.Coche;
import Modelo.Moto;
import Modelo.Vehiculo;
import java.util.Scanner;
public class AppAutopista {
    static Scanner lector=new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int opc;//para saber el tipo de cola 
        int entraSale;//para saber si entra o sale
        boolean salir=false;
        do{
            
            opc=menuCola();// para seleccionar el tipo de cola
            salir=false;
            entraSale=entraSale();
            if(entraSale==1){
                switch(opc){
                    case 1://Efectivo
                        GestorAutopista.anyadirVehiculo(TipoVehiculo(),opc);//añado al linkedList el vehiculo con su tipo y la cola a la que añado
                        break;
                    case 2://Tarjeta
                        GestorAutopista.anyadirVehiculo(TipoVehiculo(),opc);
                        break;
                    case 3://importe exacto
                        GestorAutopista.anyadirVehiculo(TipoVehiculo(),opc);
                        break;
                    case 4://salir
                        salir=true;
                        break;
                }
            }else if(entraSale==2){//sale
                GestorAutopista.sacarVehiculo(opc);
                
            }
        }while(opc!=4);
    }
    
    
    public static int menuCola(){
        int opcion;
        System.out.println("--Seleccione la cola--\n"+ "1-Efectivo\n"+ "2-Tarjeta\n"+ "3-Importe exacto\n"+ "4-Salir");
        opcion=lector.nextInt();
        return opcion;
    }
    
    public static int entraSale(){
        int opci;
        do{
            System.out.println("1-Entra\n "+ "2-Sale\n"+ "3-Salir de la aplicación");
            opci=lector.nextInt();
        }while(opci!=3);
        return opci;
    }
    
    public static Vehiculo TipoVehiculo(){//me devuelve un vehiculo por que va a almacenar los datos que pediremos
        int tipoV;
        System.out.println("1- Es un coche  o "+ "2- es una moto");
        tipoV=lector.nextInt();
        String matricula;
        String modelo;
        String color;
        System.out.println("Introduce la matricula:");
        matricula=lector.nextLine();
        lector.nextLine();
        System.out.println("Introduce el modelo: ");
        modelo=lector.nextLine();
        System.out.println("Introduce el color: ");
        color=lector.nextLine();
       
        if(tipoV==1){
            return new Coche(matricula,modelo,color);
        
        }else if(tipoV==2){ 
           return new Moto(matricula,modelo,color); 
        }
        return null;// si no es ninguna de las 2 opciones devuelve un nulo
    }
}
