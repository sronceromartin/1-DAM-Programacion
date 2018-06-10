/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploJuanvi;

/**
 *
 * @author Siby
 */
public class Item {
    public static String nombre = "Cero";
    
    public Item()
    {
    }
    
    public Item(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return this.nombre;
    }
}