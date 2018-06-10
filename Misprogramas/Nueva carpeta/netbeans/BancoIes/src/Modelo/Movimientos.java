/*
Una cuenta puede tener 0 o muchos movimientos
Aquí quedarán reflejados todos los movimientos de cada cuenta
 */

package Modelo;
import java.io.Serializable;
import java.util.ArrayList;

import java.util.Date;
import java.util.Iterator;


public class Movimientos implements Serializable {
    private String concepto;
    private double cantidad;
    Date date; 

    public Movimientos(String concepto, double cantidad){
        this.concepto=concepto;
        this.cantidad=cantidad;
        date = new Date(); // Instantiate a Date object
        
    }

    @Override
    public String toString(){
        return date 
                + " " + concepto 
                + " " + cantidad;
    }
}
