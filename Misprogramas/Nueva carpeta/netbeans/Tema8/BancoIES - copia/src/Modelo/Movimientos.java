/*
Una cuenta puede tener 0 o muchos movimientos
Aquí quedarán reflejados todos los movimientos de cada cuenta
 */

package Modelo;
import java.util.ArrayList;

import java.util.Date;
import java.util.Iterator;
/* * Movimientos.java  * Creado el  06-mar-2018, 9:37:00  
 * @autor Vicente Martínez Juan * Contacta conmigo en torrent636588336@gmail.com*/

public class Movimientos {
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
