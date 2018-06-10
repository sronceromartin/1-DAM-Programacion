/*
- Escribe una clase Multimedia para almacenar información de objetos de
tipo multimedia (películas, discos, mp3...). Esta clase contiene título, autor,
formato y duración como atributos. El formato puede ser uno de los siguientes:
wav, mp3, midi, avi, mov, mpg, cdAudio y dvd. El valor de todos los atributos se
pasa por parámetro en el momento de crear el objeto. Esta clase tiene, además,
un método para devolver cada uno de los atributos y un método toString() que
devuelve la información del objeto. Por último un método equals() que recibe un
objeto de tipo Multimedia y devuelve true en caso de que el título y el autor sean
iguales a los del objeto que llama al método y false en caso contrario
 */
package Modelo;

import Modelo.Formato;
import java.util.Arrays;


/**
 *
 * @author Siby
 */
public class Multimedia implements Comparable {
   private String titulo;
   private String autor;
   private Formato.formato formato;
   private double duracion;
  
   
   public Multimedia(String t,String a,Formato.formato f,double d){
       this.titulo=t;
       this.autor=a;
       this.formato=f;
       this.duracion=d;
   }
   
   public String getTitulo(){
       return titulo;
   }
   public String getAutor(){
       return autor;
   }
   public Formato.formato getFormato(){
       return formato;
   }
   public double getDuracion(){
       return duracion;
   }
   
  @Override
   public String toString(){
       return "Titulo: "+ getTitulo() + "Autor: "+ getAutor()+ "Formato: "+ getFormato() + "Duración: "+ getDuracion();
   }
   
   public boolean sonIguales(Multimedia m1){
       if(getTitulo().equals(m1)&& getAutor().equals(m1)){
           return true;
       }
       return false;
   }
   
   //----------------------------------
    public int compareTo(Object t){// no ponemos Override pq la clase multimedia hereda de la clase Object, si en implementar pusieramos <Multimedia> podríamos poner un objeto multimedia
       Multimedia m = (Multimedia)t;//si pongo como parámetro un tipo Multimedia me da error, he tenído que hacer un casting
       if(duracion < m.duracion){
           return -1;
       }
       if(duracion>m.duracion){
           return 1;
       }
       
    return 0;
   }
   
   public void Paco(Formato.formato f){
       
   }
   
   
   /*public boolean equals(Object obj){
      if(this==obj){
        return true;
       }
       if(obj=null){
        return false;
       }
     final Multimedia other=(Multimedia) obj;
     if(!(this.titulo.equals(other.titulo)&&this.autor.equals(other.autor)){
   
        return true;
     }
        return false;
     }
   */
}
