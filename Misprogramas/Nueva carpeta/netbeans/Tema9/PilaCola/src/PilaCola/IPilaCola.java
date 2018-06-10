/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilaCola;

/**
 *
 * @author ASIR 7L
 */
 
public interface IPilaCola {
    
    //los tres son abstractos pero no hace falta ponerlo en una interface
    void sacar();// saca un objeto, no lo devuelvo por que luego que hago con lo devuelto??
    void anyadir(String c);
    int tamaño();
    boolean estaVacia();
}