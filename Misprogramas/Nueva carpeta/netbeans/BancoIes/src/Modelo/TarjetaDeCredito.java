package Modelo;

import java.io.Serializable;



public class TarjetaDeCredito extends Tarjeta{

    private int acumulaPuntos; // acumula puntos con el pago en establecimientos
    
    public TarjetaDeCredito(String fechaInicio, String fechaFinal){
        super(fechaInicio, fechaFinal);
        limiteCajero=1000.0;
        this.enumTarjeta=EnumTarjeta.CREDITO;
        
    }
    public void setacumulaPuntos(int puntos){
        acumulaPuntos+=puntos;
    }
    @Override
    public String toString(){
        return "\nTIPO TARJETA " + EnumTarjeta.CREDITO 
                + "\nPIN. tarjeta " + pinTarjeta
                + "\nLímite Cajero " + limiteCajero
                + super.toString() + "\n---------------\n";
    }
}
