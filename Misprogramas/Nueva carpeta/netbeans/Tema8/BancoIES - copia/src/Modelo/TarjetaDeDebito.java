package Modelo;

/* * TarjetaDeDebito.java  * Creado el  18-mar-2018, 12:39:38  
 * @autor Vicente Martínez Juan * Contacta conmigo en torrent636588336@gmail.com*/

public class TarjetaDeDebito extends Tarjeta {
    private boolean seguro;//seguro de protección de compras 
    
    public TarjetaDeDebito(String fechaInicio, String fechaFinal){
        super(fechaInicio, fechaFinal);
        limiteCajero=600.0;
        this.enumTarjeta=EnumTarjeta.DEBITO;
    }
    public void setSeguro(boolean s){
        seguro=s;
    }
    @Override
    public String toString(){
        return "\nTIPO TARJETA " + EnumTarjeta.DEBITO 
                + "\nPIN. tarjeta " + pinTarjeta
                + "\nLímite Cajero " + limiteCajero
                + super.toString() + "\n---------------\n";
    }
}
