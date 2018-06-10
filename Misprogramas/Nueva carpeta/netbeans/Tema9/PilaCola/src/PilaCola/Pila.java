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


import java.util.LinkedList;

public class Pila implements IPilaCola{
    private  LinkedList <Object>listaPila=new LinkedList();//es de tipo object
    
    @Override
    //el último elemento, lo elimina
    public  void sacar(){
        Object elemento=listaPila.getLast();// me devuelve el valor del último elemento pero sigue estando en la lista
        listaPila.removeLast();// saco de la lista el último elemento que sigue estando ahí
    }
    @Override
    public  void anyadir(String c){
        listaPila.addLast(c);// en una pila el elemento se añade en la última posición
    }
    @Override
    public int tamaño(){
        return listaPila.size();
    }
    
    @Override
    public String toString(){
        return  listaPila.toString();
    }
    @Override
    public boolean estaVacia(){
        if(listaPila.size()!=0){
            return true;
        }
        return false;
    }   
}
