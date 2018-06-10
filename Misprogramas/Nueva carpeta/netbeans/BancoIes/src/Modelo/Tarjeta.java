package Modelo;
import java.io.Serializable;
import java.util.Objects;



public class Tarjeta extends Producto implements Serializable{
  
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
