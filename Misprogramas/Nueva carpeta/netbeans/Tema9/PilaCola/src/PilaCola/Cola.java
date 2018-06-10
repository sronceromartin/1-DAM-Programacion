/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilaCola;

import java.util.LinkedList;

/**
 *
 * @author ASIR 7L
 */
public class Cola implements IPilaCola{
    private LinkedList <Object>listaCola=new LinkedList();
    
    @Override
    //devuelve  el primer elemento y lo elimina
    public void sacar(){
        Object pElem=listaCola.getFirst(); //nos devuelve el primer elemento
        listaCola.remove(pElem);//eliminamos el primer elemento
      
    }
    @Override
    public  void anyadir(String c){
       listaCola.addLast(c);
        
    }
    @Override
    public int tamaño(){
        return listaCola.size();
    }
    
    @Override
    public String toString(){
        return  listaCola.toString();
    }
    
    @Override
    public boolean estaVacia(){
        if(listaCola.size()!=0){
            return true;
        }
        return false;
    }   
}
