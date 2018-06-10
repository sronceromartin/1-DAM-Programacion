/*
c) Los camiones tienen un atributo de tipo Remolque que inicializa a null
(para indicar que no tiene remolque). Además tiene un método ponRemolque(),
que recibe el Remolque por parámetro, y otro quitaRemolque(). Cuando se
muestre la información de un camión que lleve remolque, además de la
matrícula y velocidad del camión, debe aparecer la información del remolque. 
 d) En esta clase hay que sobrescribir el método acelerar de manera que
si el camión tiene remolque y la velocidad más la aceleración superan los 100
km/h se lance una excepción de tipo DemasiadoRapidoException.
 */

package Modelo;
import Controlador.GestionVehiculos;

/* * Camion.java  * Creado el  13-mar-2018, 19:08:21  
 * @autor Vicente Martínez Juan * Contacta conmigo en torrent636588336@gmail.com*/

public class Camion extends Vehiculo{
    Remolque remolque=null;

    public Camion(String matricula){
        super(matricula);
    }
    
    public void ponRemolque(Remolque r){
        this.remolque=r;
        
    }
    public void quitaRemolque(){
        this.remolque=null;
    }
    public String toString(){
        return super.toString() + remolque; 
    }
    public void acelerar(float aceleracion){
        try{
            if(remolque!=null && (velocidad + aceleracion) >100)
                throw new DemasiadoRapidoException("Demasiado rápido");
            velocidad+=aceleracion;
        }catch(DemasiadoRapidoException e){
            System.out.println(e.getMessage());
        }
    }
}
class DemasiadoRapidoException extends Exception{
    public DemasiadoRapidoException(){}
    public DemasiadoRapidoException(String msg){
        super(msg);
    }
}
