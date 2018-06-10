/*
Escribe una clase ListaMultimedia para almacenar objetos de tipo
multimedia. La clase debe tener un atributo que sea un array de objetos
Multimedia y un entero para contar cuántos objetos hay almacenados. Además,
tiene un constructor y los siguientes métodos:
a) el constructor recibe por parámetro un entero indicando el número
máximo de objetos que va a almacenar.
b) int size(): devuelve el número de objetos que hay en la lista.
c) boolean add(Multimedia m): añade el objeto al final de la lista y devuelve
true, en caso de que la lista esté llena devolverá false.
d) Multimedia get(int posición): devuelve el objeto situado en la posición
especificada.
e) int indexOf(Multimedia m): devuelve la posición del objeto que se
introduce por parámetro, si no se encuentra, devolverá -1.
f) String toString() devuelve la información de los objetos que están en la
lista.
 */
package Modelo;

import java.util.Arrays;
import interfaces.Estadisticas;//para poder importarla cojo y voy a libraries con boton derecho "add project" y seleccion el proyecto que quiero importar
import Modelo.Multimedia;
/**
 *
 * @author Siby
 */
public class ListaMultimedia implements Estadisticas {
    //array de objetos Multimedia y un entero para contar cuántos objetos hay almacenados
    
    public Multimedia m[];
    private int numObjetos=0;
   
    
    
    public ListaMultimedia(int numO){//máximo de objetos que va a almacenar
        m=new Multimedia[numO];
    }
    
    public Multimedia[] getObjMultimedia(){
        return m;
    }
    
    public int size(){
        return numObjetos;
    }
    
    public boolean add(Multimedia m){
         if(numObjetos<this.m.length){
            this.m[numObjetos]=m;//meto el objeto multimedia en el array en la posicion numObjetos
            numObjetos++;
            return true;
        }//si el array está lleno, devuelve false 
        return false;
    
    }
    public void Ordenar(){// e sun método compareTo sirve para ordenar el array
        Arrays.sort(m);
    }
    
    public Multimedia getOMult(int posicion) throws Exception{//devuelve el objeto situado en la posición especificada.
        if(posicion>=numObjetos){ //si el número de posicion que queremos obtener está fuera del array
            throw new Exception("El elemento no existe");// lanzamos una excepcion si no está ese elemento
        }
        return this.m[posicion];
    
    }
    
    public int indexOf(Multimedia m){//devuelve la posición del objeto que se introduce por parámetro, si no se encuentra, devolverá -1.
        for(int i=0;i<this.m.length;i++){
                if(this.m[i].equals(m)){
                    return i;
                }
        }
        return -1;
    }
        
    
    
    @Override
    public String toString(){
        int i;
        String s = "";
        for(i=0;i<this.size();i++){//utilizamos el método size que está en la misma clase por eso ponemos this
           s=s+ m[i].toString()+"\n";//primero va thor a s y cincuenta...estará en el array
            //System.out.println(s);
        }
        return s;
    }
    
    //implemento los métodos de la interface Estadistica
    //-----------------------------------------------------------------
    //se supone que es para que me calcule el que tiene la minima duración
    public double minimo(){
        double min=m[0].getDuracion();
        int i;
        for(i=0;i<m.length;i++){
            if(min>=(m[i]).getDuracion()){//tiene que ser mayor o igual para que yo le cambie el valor al que es menor
                min=(m[i]).getDuracion();
            }
        }
        return min;
    }
    
    public double maximo(){
        double max=m[0].getDuracion();
        int j;
        for(j=0;j<m.length;j++){
            if(max<=m[j].getDuracion()){
                max=m[j].getDuracion();
            }
        }
        return max;
    }
    
    public double sumatorio(){
        double sum=0;
        int i;
        for(i=0;i<m.length;i++){
            sum=sum+m[i].getDuracion();
        }
        return sum;
    }
    
    
    //-----------------------------------------
     //Escribir por pantalla los elementos del array multimedia ordenados por duración, utilizando el método sort de la clase Arrays:
    //Arrays.sort(milista);
    
}
