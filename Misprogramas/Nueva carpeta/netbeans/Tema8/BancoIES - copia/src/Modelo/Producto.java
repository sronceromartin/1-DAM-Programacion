package Modelo;


/* * Producto.java  * Creado el  17-mar-2018, 18:27:15  
 * @autor Vicente Martínez Juan * Contacta conmigo en torrent636588336@gmail.com*/

public abstract class Producto { // public class Ejercicio3_12
    protected String fechaContrato;
    protected String fechaCaducidad;


    public Producto(String fechaContrato, String fechaCaducidad){
        this.fechaContrato=fechaContrato;
        this.fechaCaducidad=fechaCaducidad;        
    }

    @Override
    public String toString(){
        return "\nVálido desde el " + fechaContrato 
                + "\nhasta el " + fechaCaducidad;
    }
}
