/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import PilaCola.Cola;
import PilaCola.IPilaCola;
import PilaCola.Pila;
import java.util.LinkedList;


/**
 *
 * @author ASIR 7L
 */
public class GestionListas {
    //los pongo static pq los utilizo en AppPilaColaIG
    public static Pila pila=new Pila();
    public static Cola cola=new Cola();
    
    public static void anyadir(String c){//getText es de tipo String
        pila.anyadir(c);
        cola.anyadir(c);
    
    }
    /* -------------------------DIFERENTES FORMAS DE SACAR UN ELEMENTO-------------------------------------------
    public static void sacar(Pila p){
         pila.sacar();
        
    }
    public static void sacar(Cola c){
       cola.sacar();
        
    }
    */
    
    
    public static void sacar(Object o)
    {
        if (o instanceof Pila){
             pila.sacar();
        }
        else if (o instanceof Cola){
             cola.sacar();
        }
        
    }
   
    
   /* public static void sacar(IPilaCola pc)//utilizas la interfaz para sacar el metodo
    {
         pc.sacar();
    }*/
}
