/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author ASIR 7L
 */
import Modelo.Cadena;
import java.util.ArrayList;
public class GestionCadenas {
    //public static ArrayList<String>cad=new ArrayList();
    //public static String abc;
    public static String[] obtenerArrCad5VocalesAL(String c[]) throws IllegalArgumentException{
        ArrayList<String>cad=new ArrayList();//lo declaramos aquí ya que solo va utilizarse en esta función
        // para el 1º caso en que String[] cadenas=null;
        if(c==null){
            throw new IllegalArgumentException("Parámetro no válido");
        }
        else{
            // para el 2º caso
            for(int i=0;i<c.length;i++){
                if(c[i]==null){// se pone en la posición 'i', por que hay varios Strings dentro del array
                   //no lanzamos excepción pq queremos que el programa continue y no lo rellenamos tampoco, pq solo queremos que continue ejecutándose 
                }else{
                    if(contieneVocal(c[i])){
                            cad.add(c[i]);
                    }  
                }   
            }
        }
        //Finalmente se crea un array, con el contenido de la lista, que será el que se devuelva como resultado.             
        return cad.toArray(new String[0]);//Convierto el arrayList en un array de strings, que es lo que necesito devolver, pero pq pongo ¿(new String[0]);?
        
    }
   
    public static boolean contieneVocal(String abc){
        if(abc.toLowerCase().contains("a")&&abc.toLowerCase().contains("e")&&abc.toLowerCase().contains("i")&&abc.toLowerCase().contains("o")&&abc.toLowerCase().contains("u")){//tiene que contener las 5 vocales y que si es en mayúscula pase a minúscula
            return true;
        }
        return false;
    }
}
