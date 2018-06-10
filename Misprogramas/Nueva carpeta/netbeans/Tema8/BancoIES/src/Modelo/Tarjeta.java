package Modelo;
import java.util.Objects;

/* * Tarjeta.java  * Creado el  18-mar-2018, 12:34:05  
 * @autor Vicente Martínez Juan * Contacta conmigo en torrent636588336@gmail.com*/

public class Tarjeta extends Producto {
  
    protected long numTarjeta; //numero de tarjeta
    protected int cvv; //codigo de verificacion de la tarjeta
    protected String pinTarjeta; // pin de la tarjeta
    protected double limiteCajero; // limite en los cajeros
    protected EnumTarjeta enumTarjeta;
    
    public Tarjeta(String fechaInicio, String fechaFinal){
        super(fechaInicio, fechaFinal);
        this.numTarjeta=generanumTarjeta();
        this.cvv=generacvv();
        this.pinTarjeta="0000";
    }
    public long generanumTarjeta(){
        long devolver;
        devolver=(long)(Math.random()*(9999999999L-1000000000L))+1000000000L;
        return devolver;        
    }
    public int generacvv(){
        int devolver;
        devolver=(int)(Math.random()*(999-100))+100;
        return devolver;        
    }
    public void setpin(String pin){
        pinTarjeta=pin;
    }

    @Override
    public String toString(){
        return super.toString() 
                        + "\nNúm. tarjeta " + numTarjeta
                        + "\ncvv " + cvv;
    }
}
