/*
 e) Hay que implementar la clase Remolque. Esta clase tiene un atributo
de tipo entero que es el peso y cuyo valor se le da en el momento de crear el
objeto. Debe tener un método toString() que devuelva la información del
remolque.
 */

package Modelo;

/* * Remolque.java  * Creado el  13-mar-2018, 19:12:28  
 * @autor Vicente Martínez Juan * Contacta conmigo en torrent636588336@gmail.com*/

public class Remolque {
    private int peso;
    public Remolque (int p){
        peso=p;
    }
    public String toString(){
        return "peso " + peso;
    }
}
