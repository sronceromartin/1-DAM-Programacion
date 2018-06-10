/*
b) Los coches tienen además un atributo para el número de puertas, que
se recibe también  por parámetro en el momento de crearlo. Tiene además un
método que devuelve el número  de puertas.
 */

package Modelo;

/* * Coche.java  * Creado el  13-mar-2018, 19:04:10  
 * @autor Vicente Martínez Juan * Contacta conmigo en torrent636588336@gmail.com*/

public class Coche extends Vehiculo{
    private int nPuertas;
    
    public Coche(int n, String matricula){
        super(matricula);
        this.nPuertas=n;
    }
    public int getpuertas(){  
        return nPuertas;
    }
}
