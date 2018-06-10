/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.LinkedList;

/**
 *
 * @author ASIR 7L
 */
public class Cola {
    private LinkedList <Object>listaCola=new LinkedList();
    
    
    //devuelve  el primer elemento y lo elimina
    public Object sacar(){//devolvemos un object pq luego lo vamos a utilizar para decrementar el número de vehiculos
        Object pElem=listaCola.getFirst(); //nos devuelve el primer elemento
        listaCola.remove(pElem);//eliminamos el primer elemento
        return pElem;
    }
    
    public  boolean anyadir(Object o){// al hacer un if en GestorAutopista necesito que me devuelva un true si se ha añadido a la lista
       return listaCola.add(o);
        
    }
    
    public int tamaño(){
        return listaCola.size();
    }
    
    @Override
    public String toString(){
        return  listaCola.toString();
    }
    
}
