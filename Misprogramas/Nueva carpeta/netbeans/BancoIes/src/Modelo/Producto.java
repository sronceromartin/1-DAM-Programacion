package Modelo;

import java.io.Serializable;




public abstract class Producto implements Serializable { // public class Ejercicio3_12
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
