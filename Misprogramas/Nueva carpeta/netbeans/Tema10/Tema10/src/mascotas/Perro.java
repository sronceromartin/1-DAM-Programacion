/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotas;

import java.util.Date;

/**
 *
 * @author ASIR 7L
 */
public class Perro extends Mascota{
    protected boolean vacunado;
    protected Date fecha;
    
    public Perro(String nombre,int patas) throws PatasImparesException{
        super(nombre,patas);//le pongo fijo el 4 pq son las patas
    
    }
    
    
    
    public  void setVacunado(boolean vacunado){
        this.vacunado=vacunado;
    }
    
    public void setFecha(Date fecha){
        this.fecha=fecha;
    }
    
    public boolean getVacunado(){
        return this.vacunado;
    }

    @Override
    public String toString() {
        return super.toString()+ "Perro{" + "vacunado=" + vacunado + ", fecha=" + fecha + '}';
    }
    
}
