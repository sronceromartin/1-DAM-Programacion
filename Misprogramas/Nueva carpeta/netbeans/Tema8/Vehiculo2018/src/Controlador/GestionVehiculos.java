/*
 a) Declare y cree un array de 4 vehículos.

 */

package Controlador;
import Modelo.*;
import java.util.Arrays;

/* * GestionVehiculos.java  * Creado el  13-mar-2018, 21:06:30  
 * @autor Vicente Martínez Juan * Contacta conmigo en torrent636588336@gmail.com*/

public class GestionVehiculos {
    static Vehiculo [] vectorVeh = new Vehiculo[4];
    static int indice=0; //objetos almacenados
    
    
    public static void insertar(Vehiculo v){
        if(indice<vectorVeh.length){
            vectorVeh[indice]=v;
            indice++;
        }
    }

    public static void acelerarV(float a){
        for(int i=0; i<indice;i++){
            if(vectorVeh[i] instanceof Camion){ //Down Casting. Si es una instancia de Disco....                       
                vectorVeh[i].acelerar(a);                           
            }
            if(vectorVeh[i] instanceof Coche){ //Down Casting. Si es una instancia de Disco....                       
                vectorVeh[i].acelerar(a);                           
            }            
        }
    }
    
    public static void meterRemolque(){
        for(int i=0; i<indice;i++){
            if(vectorVeh[i] instanceof Camion){ //Down Casting. Si es una instancia de Disco....                       
                Camion c=((Camion)vectorVeh[i]);
                Remolque r=new Remolque(5000);//creamos un objeto de tipo remolque para poder meterle el peso
                c.ponRemolque(r);//necesitamos llamar al método ponRemolque para que lo meta dentro del objero
            }
        }
    }
    public static String listar(){  
        return(Arrays.toString(vectorVeh)); //Imprime el vector entero
    }

}
