/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotas;

import java.io.Serializable;

/**
 *
 * @author ASIR 7L
 */
public class Mascota implements Serializable{
    private String nombre;
    private int patas;

    public Mascota(String nombre, int patas) throws PatasImparesException{
        this.nombre = nombre;
        if(this.patas%2!=0){
            throw new PatasImparesException("Número de patas incorrecto");
        }else{
            this.patas = patas;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getPatas() {
        return patas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", patas=" + patas + '}';
    }
    
    
}
