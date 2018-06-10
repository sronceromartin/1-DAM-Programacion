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
public class Programa {
    public static void main(String[] args) {
        /*
        Item i1 = new Item();   
        System.out.println(i1);  
        Item i2 = new Item();
        System.out.println(i2);    
        Item i3 = new Item();
        System.out.println(i3);
        */
        
        Coche c1 = new Coche();
        Coche c2 = new Coche();
        
        System.out.println("Hay: " + c1.CalculoTotalCoches() + " coches");
        System.out.println("Hay: " + c2.CalculoTotalCoches() + " coches");
        
    }
}
