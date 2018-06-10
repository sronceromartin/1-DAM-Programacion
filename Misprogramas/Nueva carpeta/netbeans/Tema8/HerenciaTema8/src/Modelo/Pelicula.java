/*
Escribe una clase Película que herede de la clase Multimedia anterior. La
clase Película tiene, además de los atributos heredados, un actor principal y una
actriz principal. Se permite que uno de los dos sea nulo, pero no los dos. La clase
debe tener dos métodos para obtener los dos nuevos atributos y debe
sobrescribir el método toString() para que devuelva, además de la información
heredada, la nueva información.
 */
package Modelo;

import Modelo.Multimedia;
import Modelo.Formato;

/**
 *
 * @author Siby
 */
public class Pelicula extends Multimedia {
    
    private String actorP=null;
    private String actrizP;
    
    public Pelicula(String titul,String aut,Formato.formato f,double d,String ap,String azp)throws Exception{
        super(titul,aut,f,d);
        this.actorP=ap;
        this.actrizP=azp;
        
        if(this.actorP == null&& this.actrizP == null){
            throw new Exception("Solo uno puede ser null");         
        }
   }
    
    public String getActor(){
        return actorP;
    }
    
    public String getActriz(){
        return actrizP;
    
    }
    
    @Override
    public String toString(){
        return "Titulo: "+ getTitulo() + "Autor: "+ getAutor()+ "Formato: "+ getFormato() + "Duración: "+ getDuracion()+ "Actor principal: " + actorP + "Actriz principal: " + actrizP;
    
    }
    
}
