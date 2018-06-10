/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

public class LogisticaAlmacen {
    
    private int capacidad;// la capacidad máxima de cada almacen
    private int Cdisponibles;//cuantos huecos hay en cada almacen
    
    public LogisticaAlmacen(int capacidad){
    
        this.capacidad=capacidad;
        this.Cdisponibles = capacidad;
    }
    public int getCapacidad(){
    
        return capacidad;
    
    }
    public int getCdisponibles(){
    
        return Cdisponibles;
    }
    
    
    public int Disponibilidad(){//me devuelve el número de huecos
    
        return this.Cdisponibles;    
    
    }
    public int ContenedoresParaSacar(){
    
        return this.Cdisponibles;//  esto te da los huecos pero si hay 1 o 0 huecos significa que hay contenedor
    
    }
    
    public void Meter()
    {
        this.Cdisponibles --;// decrece el número de huecos
    }
    
    public void Sacar()
    {
        this.Cdisponibles ++;//aunmenta el número de huecos
    }
}
